package reviewspt;
import java.io.*;

public class Role implements Serializable {
    
    private String roleName;
    public boolean canExchange = false;
    public boolean canWriteReview = false;
    
    public Role (String roleName) {
        
        this.roleName = roleName;
        }
    
    public String getRoleName () {
        return roleName;
    }
}
