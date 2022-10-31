package com.spring.demo.MyApp.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    @Id
    private int tid;
    private String date;
    private double amount;
    private String type;
    //@ManyToOne
  //  private Account by;

    public void deposit(Account account, double amount){
        setType("deposit");
//        setBy(account);
        setAmount(amount);
        account.deposit(amount);
//        account.getTransaction().add(this);
    }
    public void withdrawn(Account account,double amount){
        setType("Withdrawn");
//        setBy(account);
        setAmount(amount);
        account.withdrawn(amount);
//        account.getTransaction().add(this);
    }
}
