package reviewspt;
import java.io.*;

public class Moderator implements Serializable {
    
    private String username;
    private Role role;
    
    public Moderator(String username, Role role) {
        this.username = username;
        this.role = role;
        this.role.canExchange = true;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
