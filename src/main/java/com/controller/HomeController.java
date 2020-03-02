package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller //чтобы он стал Bean
public class HomeController {
    //GetMapping в новых реализациях
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getIndex() {
        return "index";
    }

    @RequestMapping("/welcome")
    public String getWelcome() {
        return "welcome";
    }



}
