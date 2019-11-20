package be.ac.umons;

public class Carbonara extends Pizza
{
    Carbonara(String name)
    {
        super(name);
        Ingredient pâte=new Ingredient();
        this.addIngredient(pâte);
        Ingredient crèmeblanche=new Ingredient();
        this.addIngredient(crèmeblanche);

    }


}
