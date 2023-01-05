package reviewspt;

public class Admin extends Moderator {
    
    public Admin(String username, Role role) {
        super(username, role);
        this.getRole().canWriteReview = true;
    }
   
}
