package com.spring.demo.MyApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyAppController {
    @RequestMapping("/")
    public String viewHomepage(Model model){
        return "index";
    }

    @RequestMapping("/account")
    String myHomePage(Model model){
        return "account";
    }
}
