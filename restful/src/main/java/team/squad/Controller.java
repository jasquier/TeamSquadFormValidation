package team.squad;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Team Squad Spring Squad
 * // TODO use marshalling to allow POST calls instead of GET
 */
@RestController
public class Controller {

    @CrossOrigin
    @RequestMapping("/login")
    public User getUserState(String name, String pw) {
        return new User(name, pw);
    }
}
