package reviewspt;
import java.io.*;

public class Game implements Serializable {
    
    private String gameName;
    private String categoryName;
    private double price;
    
    public Game (String gameName, String categoryName, double price) {
        this.gameName = gameName;
        this.categoryName = categoryName;
        this.price = price;
    }
     public boolean equals(Game game){
        return (this.price == game.price && this.gameName.equals(game.gameName) && this.categoryName.equals(game.categoryName));
    }
    public String getGameName() {
        return gameName;
    }  
    public void setGameName (String gameName) {
        this.gameName = gameName;   
    }
    public String getCategoryName(){
        return categoryName;
    }
    public void setCategoryName(String categoryName){
        this.categoryName = categoryName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
