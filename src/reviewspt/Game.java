package reviewspt;
import java.io.*;
import java.util.ArrayList;

public class Game implements Serializable {
    
    private String gameName;
    private String categoryName;
    private double price;
    
    private ArrayList<String> reviews = new ArrayList<String>();
    
    public Game(double price, String gameName, String categoryName) {
    
    this.gameName = gameName;
    this.categoryName = categoryName;
    this.price = price;
}
     public boolean equals(Game game){
        return (this.price == game.price && this.categoryName.equals(game.categoryName) && this.gameName.equals(game.gameName));
    }
    public String getGameName() {
        return gameName;
    }
    
    public void setGameName(String gameName) {
        this.gameName = gameName;
    }
    
    public String getCategoryName() {
        return categoryName;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(Double price){
        this.price = price;
    }
    
    public void AddReview(String review) {
        this.reviews.add(review);   
    } 
}

