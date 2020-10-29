package egor.online.service;

import egor.online.dao.ChatDao;
import egor.online.dao.MessagesDao;
import egor.online.dto.MessageDto;
import egor.online.entity.Chat;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MessageService implements SimpleMessageService {
    @Autowired
    private MessagesDao messagesDao;
    @Autowired
    private ChatDao chatDao;

    @Override
    public List<MessageDto> getFiveLastMessages(int chatId) {
        return messagesDao.getFiveLastMessages(chatId);
    }

    @Override
    public List<MessageDto> getAllMessages(int chatId) {
        return messagesDao.getAllMessages(chatId);
    }

    @Override
    public Chat getChatEntity(String firstLogin, String secondLogin) {
        return chatDao.getChatByLogins(firstLogin, secondLogin);
    }


}
