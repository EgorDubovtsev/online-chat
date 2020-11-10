package egor.online.service;

import egor.online.dto.RegisteredUserImpl;

public class FieldCheckerService implements SimpleFieldCheckerService {
    @Override
    public boolean isEmpty(RegisteredUserImpl registeredUser) {
        return registeredUser.getLogin().trim().equals("") ||
                registeredUser.getAge().trim().equals("") ||
                registeredUser.getName().trim().equals("") ||
                registeredUser.getPassword().trim().equals("");
    }

    @Override
    public boolean isIncorrect(RegisteredUserImpl registeredUser) {
        String pattern = "\\W";


        return (registeredUser.getName().matches(pattern) ||
                registeredUser.getPassword().matches(pattern) ||
                registeredUser.getAge().matches(pattern) ||
                registeredUser.getLogin().matches(pattern));
    }
}
