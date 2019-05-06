package com.hcl.ingfsa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.ingfsa.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
