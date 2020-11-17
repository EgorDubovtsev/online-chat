package egor.online.configuration;

import egor.online.dao.*;
import egor.online.mapper.AuthorizedUserMapper;
import egor.online.mapper.ChatMapper;
import egor.online.mapper.InterlocutorMapper;
import egor.online.mapper.MessageMapper;
import egor.online.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
public class WebConfiguration {
    @Bean
    public UserDetailsService userDetailsService() {
        return new UserDetailsServiceMapper();
    }

    @Bean
    UserDaoImpl userDao() {
        return new UserDaoImpl();
    }

    @Bean
    public AuthorizedUserMapper userMapper() {
        return new AuthorizedUserMapper();
    }

    @Bean
    public SimpleUserService simpleUserService() {
        return new UserService();
    }

    @Bean
    public SimpleSearchService searchService() {
        return new SearchService();
    }

    @Bean
    public SearchDao searchDao() {
        return new SearchDaoImpl();
    }

    @Bean
    public InterlocutorMapper interlocutorMapper() {
        return new InterlocutorMapper();
    }

    @Bean
    public MessageMapper messageMapper() {
        return new MessageMapper();
    }

    @Bean
    public MessagesDao messagesDao() {
        return new MessagesDaoImpl();
    }

    @Bean
    public ChatDao chatDao() {
        return new ChatDaoImpl();
    }

    @Bean
    public ChatMapper chatMapper() {
        return new ChatMapper();
    }

    @Bean
    public SimpleMessageService simpleMessageService() {
        return new MessageService();
    }

    @Bean
    public SimpleFieldCheckerService simpleFieldCheckerService() {
        return new FieldCheckerService();
    }
}
