package com.spring.demo.MyApp.controller;

import com.spring.demo.MyApp.model.Account;
import com.spring.demo.MyApp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController {
 @Autowired
AccountService service;

 @RequestMapping("/new_account")
    public String showNewProductPage(Model model){
     Account account = new Account();
     model.addAttribute("account", account);
     return "new_account";

 }


}
