package egor.online.controller;

import egor.online.dto.RegisteredUserImpl;
import egor.online.entity.AuthorizedUser;
import egor.online.utils.Role;
import egor.online.utils.Status;
import egor.online.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class AuthorizationController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/login")
    public String login(Model model, @RequestParam(required = false) String error) {
        return "login";
    }

    @GetMapping("/registration")
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
        authorizedUser.setStatus(Status.OFFLINE);
        userRepository.addAuthorizedUser(authorizedUser);

        return "redirect:/login";

    }
}
