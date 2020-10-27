package egor.online.controller;

import egor.online.dao.UserDao;
import egor.online.dto.RegisteredUserImpl;
import egor.online.entity.AuthorizedUser;
import egor.online.utils.Role;
import org.apache.tomcat.util.http.parser.Authorization;
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
import sun.net.www.protocol.http.AuthenticationInfo;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@Controller
public class AuthorizationController {
    @Autowired
    private UserDao userDao;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/login")//TODO: add status change after login and logout
    public String login(Model model, @RequestParam(required = false) String error) {
        return "login";
    }

    @GetMapping("/selectInterlocutor")
    public String selectInterlocutor(Authentication authentication, Model model, HttpServletResponse response) {
        response.addCookie(new Cookie("login",authentication.getName()));
        System.out.println("LOGIN IN COOKIE = " + authentication.getName());
        return "selectInterlocutor";
    }

    @GetMapping("/registration")//TODO: Add reserved login handling
    public String registration(Model model, @RequestParam(required = false) String error) {
        if (!model.containsAttribute("registrationForm")) {
            model.addAttribute("registrationForm", new RegisteredUserImpl());
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
