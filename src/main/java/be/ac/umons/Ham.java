package be.ac.umons;

public class Ham extends Ingredient {
    public Ham()
    {
        super(App.ingredients.get("Ham").getName(),App.ingredients.get("Ham").getPrice());
    }
}
