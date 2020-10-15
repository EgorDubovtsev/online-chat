package egor.online.dao;

import egor.online.dto.InterlocutorDto;

public class SearchDaoImpl implements SearchDao {
    @Override
    public InterlocutorDto getMatchedUsers(String name) {
        String getMatchedUsersSql="SELECT login, personal_name from personal_data where login like '%?%' or personal_name like '%?%'";
        //todo: add mapper for interlocutor dto
    }
}
