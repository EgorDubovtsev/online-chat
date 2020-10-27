package egor.online.dao;

import egor.online.dto.InterlocutorDto;
import egor.online.mapper.InterlocutorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class SearchDaoImpl implements SearchDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private InterlocutorMapper interlocutorMapper;
    @Override
    public List<InterlocutorDto> getMatchedUsers(String name) {
        String getMatchedUsersSql = "SELECT login, personal_name from user_personal_data where login like '%" + name + "%' or personal_name like '%" + name + "%'";
        try {
            return jdbcTemplate.query(getMatchedUsersSql, interlocutorMapper);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }
}
