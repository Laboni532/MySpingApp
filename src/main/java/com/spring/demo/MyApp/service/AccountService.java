package com.spring.demo.MyApp.service;

import com.spring.demo.MyApp.model.Account;
import com.spring.demo.MyApp.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;

    public void createAccount(Account account){
        accountRepository.save(account);
    }
    public List<Account> getAllAccounts(){
        return accountRepository.findAll();
    }
}
