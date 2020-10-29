package egor.online.mapper;

import egor.online.entity.Chat;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ChatMapper implements RowMapper<Chat> {
    @Override
    public Chat mapRow(ResultSet resultSet, int i) throws SQLException {
        Chat chat = new Chat();
        chat.setChatId(resultSet.getInt("chat_id"));
        chat.setUserLogin(resultSet.getString("first_user"));
        chat.setInterlocutorLogin(resultSet.getString("second_user"));
        return chat;
    }
}
