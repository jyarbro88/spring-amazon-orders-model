package com.spring.amazondatamodel.repositories;

import com.spring.amazondatamodel.datalayer.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface AccountRepository extends JpaRepository<Account, Long> {

    //business logic goes here


}
