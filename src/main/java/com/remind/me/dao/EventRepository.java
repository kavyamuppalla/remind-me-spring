package com.remind.me.dao;

import com.remind.me.entity.EventTable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<EventTable,Integer> {

}
