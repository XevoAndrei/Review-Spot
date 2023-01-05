package reviewspt;
import java.io.*;

public class Role implements Serializable {
    
    private String roleName;
    private String authority;
    public boolean canExchange = false;
    public boolean canWriteReview = false;
    
    public Role (String roleName, String authority) {
        
        this.roleName = roleName;
        this.authority = authority;
        }
    
    public String getRoleName () {
        return roleName;
    }
    
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    
    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }  
}
