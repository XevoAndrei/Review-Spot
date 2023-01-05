package reviewspt;
import java.io.*;

public class Moderator implements Serializable {
    
    private String username;
    private int authority;
    private Role role;
    
    public Moderator(String username, Role role, int authority) {
        this.username = username;
        this.authority = authority;
        this.role = role;
        this.role.canExchange = true;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public int getAuthority() {
        return authority;
    }
    
    public void setAuthority(int authority) {
        this.authority = authority;
    }
    
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
