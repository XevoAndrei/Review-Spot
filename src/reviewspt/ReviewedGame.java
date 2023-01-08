package reviewspt;
import java.io.*;

public class ReviewedGame implements Serializable {
    
    private String review;
    private Game game;
    
    public ReviewedGame(String review, Game game){
        this.review = review;
        this.game = game;
    }
    
    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
