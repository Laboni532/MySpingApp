package com.spring.demo.MyApp.repository;

import com.spring.demo.MyApp.model.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {
    Optional<Account> findById(Long id);

    Account findAllById(long id);
}
