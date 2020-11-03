package egor.online.controller;

import egor.online.service.SimpleMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Lazy
@Controller
public class MessageController {
    @Autowired
    SimpleMessageService simpleMessageService;

    @RequestMapping("/api/sendMessage")
    public @ResponseBody
    void sendMessage(@RequestParam String userFrom, @RequestParam String messageText) {
        simpleMessageService.sendMessage(userFrom, messageText);
    }
}
