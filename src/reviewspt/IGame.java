package reviewspt;


public class IGame extends SPGame {
    
    public IGame (String gameName, Game game) {
        super(gameName, game);
        this.getGame().lowBudget = true;
       
    }
    
}
