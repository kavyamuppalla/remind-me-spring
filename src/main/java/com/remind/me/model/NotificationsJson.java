package com.remind.me.model;

import java.util.List;

public class NotificationsJson {

    private String userId;
    private List<NotificationJson> notificationJsons;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<NotificationJson> getNotificationJsons() {
        return notificationJsons;
    }

    public void setNotificationJsons(List<NotificationJson> notificationJsons) {
        this.notificationJsons = notificationJsons;
    }
}
