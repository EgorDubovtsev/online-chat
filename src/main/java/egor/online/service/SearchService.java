package egor.online.service;

import egor.online.dao.SearchDao;
import egor.online.dto.InterlocutorDto;
import egor.online.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

public class SearchService implements SimpleSearchService {
    @Autowired
    SearchDao searchDao;

    @Override
    public InterlocutorDto searchInterlocutor(String name) {
        searchDao
        return null;
    }
}
