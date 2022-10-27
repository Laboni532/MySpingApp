package com.spring.demo.MyApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("my/app")
public class MyAppController {

    @GetMapping
    String myHomePage(Model model){
        return "index";
    }
}
