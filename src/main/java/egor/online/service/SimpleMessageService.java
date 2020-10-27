package egor.online.service;

import egor.online.dto.MessageDto;

import java.util.List;

public interface SimpleMessageService {
    List<MessageDto> getFiveLastMessages(String chatId);
    List<MessageDto> getAllMessages(String chatId);
}
