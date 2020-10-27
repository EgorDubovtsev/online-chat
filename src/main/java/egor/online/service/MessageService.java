package egor.online.service;

import egor.online.dao.MessagesDao;
import egor.online.dto.MessageDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MessageService implements  SimpleMessageService {
    @Autowired
    MessagesDao messagesDao;

    @Override
    public List<MessageDto> getFiveLastMessages(String chatId) {
        return messagesDao.getFiveLastMessages(chatId);
    }

    @Override
    public List<MessageDto> getAllMessages(String chatId) {
        return messagesDao.getAllMessages(chatId);
    }
}
