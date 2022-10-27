package com.spring.demo.MyApp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    private int accountNumber;
    private String title;
    private double balance;
//    @OneToMany
//    private List<Transaction> transaction ;

    public void deposit(double amount){
        balance=balance+amount;
    }
    public void withdrawn(double amount){
        if(balance>=amount)
            balance= balance-amount;
        else
            System.out.println("Insufficient balance");
    }



}
