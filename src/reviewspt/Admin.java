package reviewspt;

public class Admin extends Moderator {
    
    public Admin(String username, Role role, int authority) {
        super(username, role, authority);
        this.getRole().canWriteReview = true;
    }
   
}
