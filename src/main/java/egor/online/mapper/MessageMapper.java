package egor.online.mapper;

import egor.online.dto.MessageDto;
import egor.online.dto.MessageDtoImpl;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MessageMapper implements RowMapper<MessageDto> {//TODO: ADD CHAT ID CREATE
    @Override
    public MessageDto mapRow(ResultSet resultSet, int i) throws SQLException {
        MessageDto message = new MessageDtoImpl();
        message.setId(resultSet.getInt("message_id"));
        message.setChatId(resultSet.getInt("chat_id"));
        message.setMessageText(resultSet.getString("message_text"));
        message.setSenderLogin(resultSet.getString("from_user"));
//        message.setSendTime(resultSet); fixme
        return null;
    }
}
