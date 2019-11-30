package be.ac.umons;

public class TomatoSauce extends Ingredient {
    public TomatoSauce()
    {
        super(App.ingredients.get("TomatoSauce").getName(),App.ingredients.get("TomatoSauce").getPrice());
    }
}
