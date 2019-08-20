package com.remind.me.dao;

import com.remind.me.entity.UserTable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserTable,String> {
    //queries
}
