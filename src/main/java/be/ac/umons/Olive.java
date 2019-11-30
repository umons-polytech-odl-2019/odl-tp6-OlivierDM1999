package be.ac.umons;

public class Olive extends Ingredient
{
    public Olive()
    {
        super(App.ingredients.get("Olive").getName(),App.ingredients.get("Olive").getPrice());
    }


}
