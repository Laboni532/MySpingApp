package com.spring.demo.MyApp.repository;

import com.spring.demo.MyApp.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}
