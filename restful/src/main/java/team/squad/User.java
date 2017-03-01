package team.squad;

import java.util.HashMap;

/**
 * @author Team Squad Spring Squad
 */
public class User {

    private String username;
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

    public User() { }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getIsPasswordValid() {
        boolean result = false;
        if (logins.containsKey(username)) {
            String correctPassword = logins.get(username);
            if (password.equals(correctPassword)) {
                result = true;
            }
        }
        return result;
    }
}
