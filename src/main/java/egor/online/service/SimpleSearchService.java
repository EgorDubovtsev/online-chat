package egor.online.service;

import egor.online.dto.InterlocutorDto;
import egor.online.entity.User;

public interface SimpleSearchService {
    InterlocutorDto searchInterlocutor(String name);
}
