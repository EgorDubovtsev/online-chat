package egor.online.controller;

import egor.online.entity.AuthorizedUser;
import egor.online.entity.Chat;
import egor.online.service.SimpleMessageService;
import egor.online.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {
    @Autowired
    private UserService userService;
    @Autowired
    private SimpleMessageService messageService;

    @GetMapping("/")
    public String index(@RequestParam(required = false) String interlocutorLogin, Authentication authentication, Model model, HttpServletRequest request) {
        AuthorizedUser interlocutor = (AuthorizedUser) userService.getUserByLogin(interlocutorLogin);
        if (interlocutor == null) {
            return "redirect:selectInterlocutor";
        }
        model.addAttribute("Interlocutor", interlocutor);
        Chat chat = messageService.getChatEntity(authentication.getName(), interlocutorLogin);
        if (chat==null){
            //TODO: create chat
        }
        model.addAttribute("Messages",messageService.getAllMessages(chat.getChatId()));

        return "index";

    }

}
