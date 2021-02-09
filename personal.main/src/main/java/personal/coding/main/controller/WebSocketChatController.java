package personal.coding.main.controller;

import org.springframework.web.bind.annotation.RestController;
import persional.coding.dao.util.ActiveUserChangeListener;

import java.util.HashSet;
import java.util.Set;

@RestController
public class WebSocketChatController implements ActiveUserChangeListener {
    @Override
    public void notifyActiveUserChange() {
        Set<String> activeUsers = new HashSet<>();
    }
}
