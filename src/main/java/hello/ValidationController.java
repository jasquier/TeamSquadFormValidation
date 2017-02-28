package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidationController {

    @RequestMapping("/login")
    public User greeting(String name, String pw) {
        return new User(name, pw);
    }
}
