package egor.online.dao;

import egor.online.dto.InterlocutorDto;

public interface SearchDao {
    InterlocutorDto getMatchedUsers(String name);
}
