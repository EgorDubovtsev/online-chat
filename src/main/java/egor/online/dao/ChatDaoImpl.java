package egor.online.dao;

import egor.online.entity.Chat;
import egor.online.mapper.ChatMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class ChatDaoImpl implements ChatDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private ChatMapper chatMapper;

    @Override
    public Chat getChatByLogins(String firstLogin, String secondLogin) {
        String getChatByLoginsSql = "SELECT * FROM chats_id WHERE first_user =? AND second_user = ? OR first_user =? AND second_user = ?";
        try {
            return jdbcTemplate.queryForObject(getChatByLoginsSql, chatMapper, firstLogin, secondLogin, secondLogin, firstLogin);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean createChat(String firstLogin, String secondLogin) {
        String createChatSql = "INSERT INTO chats_id (first_user, second_user) values(?,?)";
        try {
            jdbcTemplate.update(createChatSql, firstLogin, secondLogin);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
