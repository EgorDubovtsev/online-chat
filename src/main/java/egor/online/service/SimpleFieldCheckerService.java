package egor.online.service;

import egor.online.dto.RegisteredUserImpl;

public interface SimpleFieldCheckerService {
    boolean isEmpty(RegisteredUserImpl registeredUser);
    boolean isIncorrect(RegisteredUserImpl registeredUser);
}
