package egor.online.dao;

import egor.online.dto.MessageDto;

import java.util.List;

public interface MessagesDao {
    List<MessageDto> getNewMessages(int chatId, String messageText);
    List<MessageDto> getAllMessages(int chatId);
    void sendMessage(String userFrom,String messageText,int chatId);
}
