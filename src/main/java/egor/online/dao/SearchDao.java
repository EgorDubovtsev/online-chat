package egor.online.dao;

import egor.online.dto.InterlocutorDto;

import java.util.List;

public interface SearchDao {
    List<InterlocutorDto> getMatchedUsers(String name);
}
