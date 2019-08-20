package com.remind.me.dao;

import com.remind.me.entity.NotificationTable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface NotificationRepository extends CrudRepository<NotificationTable, Integer> {
    @Query("select n from NotificationTable n where n.userId = ?1")
    Collection<NotificationTable> findNotificationByUserID(String userId);


}
