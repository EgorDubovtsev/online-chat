package egor.online.dao;

import egor.online.dto.MessageDto;
import egor.online.mapper.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class MessagesDaoImpl implements MessagesDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private MessageMapper messageMapper;

    @Override
    public List<MessageDto> getFiveLastMessages(int chatId) {
        String getFiveLastMessages = "SELECT * FROM messages where chat_id=? order by message_id DESC limit 5";
        return jdbcTemplate.query(getFiveLastMessages, messageMapper, chatId);
    }

    @Override
    public List<MessageDto> getAllMessages(int chatId) {
        String getFiveLastMessages = "SELECT * FROM messages where chat_id=? order by message_id DESC ";
        return jdbcTemplate.query(getFiveLastMessages, messageMapper, chatId);
    }
}
