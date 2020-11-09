package egor.online.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
    private SimpleMessageService simpleMessageService;
    @Autowired
    private ObjectMapper objectMapper;
    @RequestMapping("/api/sendMessage")
    public @ResponseBody
    void sendMessage(@RequestParam String userFrom, @RequestParam String messageText) {
        simpleMessageService.sendMessage(userFrom, messageText);
    }
    @RequestMapping("/api/messages")
    public @ResponseBody
    String loadMessages(@RequestParam String lastMessageText){
        try {
           return objectMapper.writeValueAsString(simpleMessageService.getNewMessages(lastMessageText));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "";
    }
}
