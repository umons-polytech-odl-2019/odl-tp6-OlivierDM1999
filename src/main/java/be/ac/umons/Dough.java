package be.ac.umons;

public class Dough extends Ingredient {
    public Dough (){
        super(App.ingredients.get("Dough").getName(),App.ingredients.get("Dough").getPrice());
    }
}
