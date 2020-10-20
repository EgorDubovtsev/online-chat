package egor.online.service;

import egor.online.dao.SearchDao;
import egor.online.dto.InterlocutorDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SearchService implements SimpleSearchService {
    @Autowired
    SearchDao searchDao;

    @Override
    public List<InterlocutorDto> searchInterlocutor(String name) {
        return searchDao.getMatchedUsers(name);
    }
}
