package com.remind.me.service;

import com.remind.me.dao.NotificationRepository;
import com.remind.me.entity.NotificationTable;
import com.remind.me.model.NotificationJson;
import com.remind.me.model.NotificationsJson;
import com.remind.me.model.UserJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class NotificationService {
    @Autowired
    private NotificationRepository notificationRepository;

  public void createNotification(NotificationJson notificationJson, String userId) {
      NotificationTable notificationTable = new NotificationTable();
      notificationTable.setUserId(userId);
      notificationTable.setMessage(notificationJson.getMessage());
      notificationTable.setNotificationTime(notificationJson.getNotificationTime());
      notificationTable.setEventId(notificationJson.getEventId());
      notificationTable.setNotificationType(notificationJson.getNotificationType());
      notificationTable.setNotificationTarget(notificationJson.getNotificationTarget());

      notificationRepository.save(notificationTable);

  }

  /*public VideoComments getVideoComments(int videoId){
        Collection<Comment> comments = repository.findCommentByVideoId(videoId);
        //converting database to JSON
        List<UserComment> userComments = new ArrayList<>();
        for(Comment comment : comments) {
            UserComment userComment = new UserComment();
            userComment.setUserId(comment.getUserId());
            userComment.setText(comment.getCommentText());
            userComment.setCreatedDate(comment.getCreateDate().toString());
            userComments.add(userComment);
        }
        VideoComments videoComments = new VideoComments();
        videoComments.setVideoId(videoId);
        videoComments.setComments(userComments);
        return videoComments;
    }*/

  public NotificationsJson getNotifications(String userId) {

      NotificationsJson notificationsJson = new NotificationsJson();
      Collection<NotificationTable> notificationTableCollection = notificationRepository.findNotificationByUserID(userId);

      List<NotificationJson> notificationJsons = new ArrayList<>();
      for(NotificationTable notificationTable : notificationTableCollection) {
        NotificationJson notificationJson = new NotificationJson();
        notificationJson.setEventId(notificationTable.getEventId());
        notificationJson.setMessage(notificationTable.getMessage());
        notificationJson.setNotificationTarget(notificationTable.getNotificationTarget());
        notificationJson.setNotificationTime(notificationTable.getNotificationTime());
        notificationJson.setNotificationType(notificationTable.getNotificationType());

        notificationJsons.add(notificationJson);
      }
      notificationsJson.setNotificationJsons(notificationJsons);
      notificationsJson.setUserId(userId);

      return notificationsJson;
  }

}
