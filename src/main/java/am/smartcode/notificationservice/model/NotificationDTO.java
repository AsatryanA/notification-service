package am.smartcode.notificationservice.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NotificationDTO {
    private String message;
}
