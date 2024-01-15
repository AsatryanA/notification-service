package am.smartcode.notificationservice.service;

import am.smartcode.notificationservice.model.NotificationDTO;

public interface NotificationService {
    void notify(NotificationDTO notificationDTO);
}
