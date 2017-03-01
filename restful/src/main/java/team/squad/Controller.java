package team.squad;

import org.springframework.web.bind.annotation.*;

/**
 * @author Team Squad Spring Squad
 */
@RestController
public class Controller {

    @CrossOrigin
    @RequestMapping(value = "/login", method = RequestMethod.POST, consumes = {"application/json"})
    public @ResponseBody User getUserStateWithPOST(@RequestBody User user) {
        return user;
    }
}
