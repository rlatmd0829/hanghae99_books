package com.hanghae99.books.repository;

import com.hanghae99.books.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByUsername(String username);
}
