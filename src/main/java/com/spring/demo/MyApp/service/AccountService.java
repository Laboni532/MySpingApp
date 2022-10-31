package com.spring.demo.MyApp.service;

import com.spring.demo.MyApp.model.Account;
import com.spring.demo.MyApp.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;

    public List<Account> getAllAccounts(){
        return (List<Account>) accountRepository.findAll();
    }
    public void save(Account account){
        accountRepository.save(account);
    }

    public void createAccount(Account account){
        accountRepository.save(account);
    }
    public Account get(long id){
        return (Account) accountRepository.findAllById(id);
    }
    public void delete(long id){
        accountRepository.deleteById(id);
    }
}
