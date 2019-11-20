package be.ac.umons;

public class Margherita extends Pizza {

    Margherita(String name)
    {
        super(name);
        Ingredient pâte=new Ingredient();
        this.addIngredient(pâte);
        Ingredient saucetomate=new Ingredient();
        this.addIngredient(saucetomate);
        Ingredient fromage=new Ingredient();
        this.addIngredient(fromage);
    }
}
