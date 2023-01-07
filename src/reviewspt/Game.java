package reviewspt;
import java.io.*;

public class Game implements Serializable {
    
    private String gameName;
    public boolean canMultiplayable = true;
    public boolean lowBudget = false;
    
    public Game (String gameName) {
        this.gameName = gameName;
    }
    public String getGameName() {
        return gameName;
    }  
}
