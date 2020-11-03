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
        String getFiveLastMessages = "SELECT * FROM messages where chat_id=? limit 5";
        return jdbcTemplate.query(getFiveLastMessages, messageMapper, chatId);
    }

    @Override
    public List<MessageDto> getAllMessages(int chatId) {
        String getFiveLastMessages = "SELECT * FROM messages where chat_id=?";
        return jdbcTemplate.query(getFiveLastMessages, messageMapper, chatId);
    }

    @Override
    public void sendMessage(String userFrom, String messageText, int chatId) {
        String sendMessageSql = "INSERT INTO messages (chat_id,from_user,message_text) values(?,?,?)";
        jdbcTemplate.update(sendMessageSql,chatId,userFrom,messageText);
    }
}
