package com.spring.demo.MyApp.repository;

import com.spring.demo.MyApp.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
