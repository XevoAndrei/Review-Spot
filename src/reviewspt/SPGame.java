package reviewspt;
import java.io.*;

public class SPGame implements Serializable {
    
    private String category;
    private Game game;
    
    public SPGame(String gamename, Game game) {
        this.category = category;
        this.game = game;
        this.game.canMultiplayable = false;
    }
    
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
