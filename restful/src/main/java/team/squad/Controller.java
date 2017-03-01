package team.squad;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Team Squad Spring Squad
 */
@RestController
public class Controller {

    @RequestMapping("/login")
    public User getUserState(String name, String pw) {
        return new User(name, pw);
    }
}
