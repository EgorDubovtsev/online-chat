package egor.online.controller;

import egor.online.entity.AuthorizedUser;
import egor.online.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
public class IndexController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index(@RequestParam(required = false) String interlocutorLogin, Authentication authentication, Model model, HttpServletResponse response) {

        AuthorizedUser interlocutor = (AuthorizedUser) userService.getUserByLogin(interlocutorLogin);
        if (interlocutor == null) {
            return "redirect:selectInterlocutor";
        }
        model.addAttribute("Interlocutor", interlocutor);
        return "index";

    }

}
