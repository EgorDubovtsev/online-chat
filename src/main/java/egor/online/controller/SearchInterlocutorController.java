package egor.online.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import egor.online.dto.InterlocutorDto;
import egor.online.service.SearchService;
import egor.online.service.SimpleSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
public class SearchInterlocutorController {//TODO: add simple to impl, not to interface
    @Autowired
    SimpleSearchService searchService;
    @Autowired
    ObjectMapper objectMapper;

    @RequestMapping("/api/interlocutors")
    public @ResponseBody
    String getInterlocutorsNames(@RequestParam String name){
        List<InterlocutorDto> interlocutors = searchService.searchInterlocutor(name);
        try{
            return objectMapper.writeValueAsString(interlocutors);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
