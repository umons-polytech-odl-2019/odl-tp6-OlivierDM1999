package be.ac.umons;

public class WhiteCream extends Ingredient {
    public WhiteCream()
    {
        super(App.ingredients.get("WhiteCream").getName(),App.ingredients.get("WhiteCream").getPrice());
    }
}
