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
    public List<MessageDto> getNewMessages(int chatId, String messageText) {
        String getNewMessagesSql = "SELECT * FROM messages where chat_id=? and message_id > (SELECT max(message_id) FROM messages WHERE message_text = ?)";
        return jdbcTemplate.query(getNewMessagesSql, messageMapper, chatId, messageText);
    }

    @Override
    public List<MessageDto> getAllMessages(int chatId) {
        String getFiveLastMessages = "SELECT * FROM messages where chat_id=?";
        return jdbcTemplate.query(getFiveLastMessages, messageMapper, chatId);
    }

    @Override
    public void sendMessage(String userFrom, String messageText, int chatId) {
        String sendMessageSql = "INSERT INTO messages (chat_id,from_user,message_text) values(?,?,?)";
        jdbcTemplate.update(sendMessageSql, chatId, userFrom, messageText);
    }
}
