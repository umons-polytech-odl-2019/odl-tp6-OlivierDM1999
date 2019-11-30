package be.ac.umons;

public class Cheese extends Ingredient {
    public Cheese(){
        super(App.ingredients.get("Cheese").getName(),App.ingredients.get("Cheese").getPrice());
    }
}
