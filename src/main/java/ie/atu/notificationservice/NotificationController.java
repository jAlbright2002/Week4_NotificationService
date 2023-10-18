package ie.atu.notificationservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @PostMapping("/register")
    public String notifyUser (@RequestBody UserDetails userDetails){
        String notify = String.format("%s has registered! [%s]", userDetails.getName(), userDetails.getEmail());
        return notify;
    }

}
