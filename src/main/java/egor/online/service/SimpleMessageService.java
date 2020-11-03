package egor.online.service;

import egor.online.dto.MessageDto;
import egor.online.entity.Chat;
import egor.online.exceptions.ChatCreatingException;

import java.util.List;

public interface SimpleMessageService {
    List<MessageDto> getFiveLastMessages(int chatId);

    List<MessageDto> getAllMessages(int chatId);

    Chat getChatEntity(String firstLogin, String secondLogin);

    void createChat(String firstLogin, String secondLogin) throws ChatCreatingException;

    void sendMessage(String userFrom, String messageText);

    int getChatId();

    void setChatId(int chatId);


}
