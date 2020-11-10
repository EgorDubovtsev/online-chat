package egor.online.controller;

import egor.online.dao.UserDao;
import egor.online.dto.RegisteredUserImpl;
import egor.online.entity.AuthorizedUser;
import egor.online.service.SimpleFieldCheckerService;
import egor.online.utils.LoginStringConstants;
import egor.online.utils.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@Controller
public class AuthorizationController {
    @Autowired
    private UserDao userDao;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private SimpleFieldCheckerService fieldCheckerService;

    @GetMapping("/login")
    public String login(Model model, @RequestParam(required = false) String error) {
        if (error != null) {
            model.addAttribute("errorMessage", LoginStringConstants.INCORRECT_LOGIN_OR_PASSWORD);
        }
        return "login";
    }

    @GetMapping("/logout")
    public String logout(Model model) {
        model.addAttribute("registrationForm", null);
        return "login";
    }

    @GetMapping("/selectInterlocutor")
    public String selectInterlocutor(Authentication authentication, Model model, HttpServletResponse response) {
        response.addCookie(new Cookie("login", authentication.getName()));
        return "selectInterlocutor";
    }

    @GetMapping("/registration")
    public String registration(Model model, @RequestParam(required = false) String error) {
        if (!model.containsAttribute("registrationForm")) {
            model.addAttribute("registrationForm", new RegisteredUserImpl());
        }
        if (error != null) {
            switch (error) {
                case ("emptyFields"):
                    model.addAttribute("errorMessage", LoginStringConstants.EMPTY_FIELDS);
                    break;
                case ("incorrectSymbols"):
                    model.addAttribute("errorMessage",LoginStringConstants.FORBIDDEN_SYMBOLS);
                    break;
                default:
                    model.addAttribute("errorMessage",LoginStringConstants.UNEXPECTED_ERROR);
            }

        }
        return "registration";
    }

    @PostMapping("/registration/process")
    public String registrationProcess(@Valid @ModelAttribute("registrationForm") RegisteredUserImpl registeredUser,
                                      BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println("err");
            return "redirect:/registration";

        }
        if (fieldCheckerService.isEmpty(registeredUser)) {
            return "redirect:/registration?error=emptyFields";
        } else if (fieldCheckerService.isIncorrect(registeredUser)) {
            return "redirect:/registration?error=incorrectSymbols";
        }
        System.out.println(fieldCheckerService.isIncorrect(registeredUser)+"DDDDDDDDDDDDDDD");
        AuthorizedUser authorizedUser = new AuthorizedUser();
        authorizedUser.setRole(Role.USER);
        authorizedUser.setName(registeredUser.getName());
        authorizedUser.setPassword(passwordEncoder.encode(registeredUser.getPassword()));
        authorizedUser.setLogin(registeredUser.getLogin());
        authorizedUser.setAge(Integer.parseInt(registeredUser.getAge()));
        userDao.saveUser(authorizedUser);

        return "redirect:/login";

    }
}
