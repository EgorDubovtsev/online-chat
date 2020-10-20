package egor.online.mapper;

import egor.online.dto.InterlocutorDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class InterlocutorMapper implements RowMapper<InterlocutorDto> {
    @Override
    public InterlocutorDto mapRow(ResultSet resultSet, int i) throws SQLException {
        InterlocutorDto dto = new InterlocutorDto();
        System.out.println("MAPPER START");
        System.out.println(resultSet.getString("login")+" MAPPER");
        dto.setLogin(resultSet.getString("login"));
        dto.setName(resultSet.getString("personal_name"));
        return dto;
    }
}
