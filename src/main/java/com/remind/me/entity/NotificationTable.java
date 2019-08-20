package com.remind.me.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table(name = "NOTIFICATIONS",schema = "remindme")
public class NotificationTable {

    @Id
    @Column(name = "NOTIFICATION_ID")
    private int notificationId;
    @Column(name = "MESSAGE")
    private String message;
    @Column(name = "NOTIFICATION_TYPE")
    private String notificationType;
    @Column(name = "USER_ID")
    private String userId;
    @Column(name = "EVENT_ID")
    private int eventId;
    @Column(name = "NOTIFICATION_TIME")
    private Date notificationTime;
    @Column(name = "NOTIFICATION_STATUS")
    private String notificationStatus;
    @Column(name = "NOTIFICATION_TARGET")
    private String notificationTarget;

    public int getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public Date getNotificationTime() {
        return notificationTime;
    }

    public void setNotificationTime(Date notificationTime) {
        this.notificationTime = notificationTime;
    }

    public String getNotificationStatus() {
        return notificationStatus;
    }

    public void setNotificationStatus(String notificationStatus) {
        this.notificationStatus = notificationStatus;
    }

    public String getNotificationTarget() {
        return notificationTarget;
    }

    public void setNotificationTarget(String notificationTarget) {
        this.notificationTarget = notificationTarget;
    }
}
