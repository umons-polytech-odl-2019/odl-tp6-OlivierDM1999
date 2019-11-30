package be.ac.umons;

public class Seafood extends Ingredient {
    public Seafood()
    {
        super(App.ingredients.get("Seafood").getName(),App.ingredients.get("Seafood").getPrice());
    }
}
