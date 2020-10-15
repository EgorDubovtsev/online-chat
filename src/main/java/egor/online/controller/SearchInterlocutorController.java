package egor.online.controller;

import egor.online.service.SearchService;
import egor.online.service.SimpleSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public class SearchInterlocutorController {//TODO: add simple to impl, not to interface
    @Autowired
    SimpleSearchService searchService;
    @RequestMapping("/api/Interlocutors")
    public @ResponseBody
    String getInterlocutorsNames(@RequestParam String name){//TODO:Add object mapper
        searchService.searchInterlocutor(name);//TODO: add realization
    }
}
