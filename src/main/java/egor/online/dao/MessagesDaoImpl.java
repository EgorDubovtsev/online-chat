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
    public List<MessageDto> getFiveLastMessages(String chatId) {
        String getFiveLastMessages = "SELECT * FROM messages where chatId=? order by message_id DESC limit 5";//TODO: CHECK EFFICIENCY
        return jdbcTemplate.query(getFiveLastMessages, messageMapper, chatId);//TODO: CHECK RETURN and maybe change searchDao
    }

    @Override
    public List<MessageDto> getAllMessages(String chatId) {
        return null;
    }
}
