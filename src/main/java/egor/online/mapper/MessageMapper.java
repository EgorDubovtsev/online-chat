package egor.online.mapper;

import egor.online.dto.MessageDto;
import egor.online.dto.MessageDtoImpl;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class MessageMapper implements RowMapper<MessageDto> {
    @Override
    public MessageDto mapRow(ResultSet resultSet, int i) throws SQLException {
        MessageDto message = new MessageDtoImpl();
        message.setId(resultSet.getInt("message_id"));
        message.setChatId(resultSet.getInt("chat_id"));
        message.setMessageText(resultSet.getString("message_text"));
        message.setSenderLogin(resultSet.getString("from_user"));
        Timestamp timestamp = resultSet.getTimestamp("send_time");
        if (timestamp!=null){
            message.setSendTime(timestamp.toLocalDateTime().getHour()+":"+timestamp.toLocalDateTime().getMinute());
        }
        return message;
    }
}
