package team.squad;

import java.util.HashMap;

/**
 * @author Team Squad Spring Squad
 */
public class User {

    private String name;
    private String password;

    private HashMap<String, String> logins = new HashMap<String, String>() {{
        put("Andres", "123");
        put("Shilpa", "alwaysright");
        put("Hilary", "sustainablelearning");
        put("BBC", "CBB");
        put("John C", "hvacmaster");
        put("Randall", "stealyogirl");
        put("Squier", "BSinCS");
        put("Milton", "NASA");
    }};

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassWord(String password) {
        this.password = password;
    }

    public Boolean getIsPasswordValid() {
        if (logins.containsKey(name)) {
            String correctPassword = logins.get(name);
            if (password.equals(correctPassword)) {
                return true;
            }
            return false;
        }
        else {
            return false;
        }
    }
}
