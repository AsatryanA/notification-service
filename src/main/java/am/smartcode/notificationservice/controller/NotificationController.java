package am.smartcode.notificationservice.controller;

import am.smartcode.notificationservice.model.NotificationDTO;
import am.smartcode.notificationservice.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification")
@RequiredArgsConstructor
public class NotificationController {
    private final NotificationService notificationService;
    @PostMapping
    public ResponseEntity<Void> notify(NotificationDTO notificationDTO){
        System.out.println(notificationDTO.getMessage());
        notificationService.notify(notificationDTO);
        return ResponseEntity.ok().build();
    }

}
