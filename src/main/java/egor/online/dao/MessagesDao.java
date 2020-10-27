package egor.online.dao;

import egor.online.dto.MessageDto;

import java.util.List;

public interface MessagesDao {
    List<MessageDto> getFiveLastMessages(String chatId);
    List<MessageDto> getAllMessages(String chatId);
}
