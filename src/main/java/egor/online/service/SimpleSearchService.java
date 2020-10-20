package egor.online.service;

import egor.online.dto.InterlocutorDto;
import egor.online.entity.User;

import java.util.List;

public interface SimpleSearchService {
    List<InterlocutorDto> searchInterlocutor(String name);
}
