package be.ac.umons;

public class FruttiDiMare extends Pizza {

    FruttiDiMare(String name)
    {
        super(name);
        Ingredient pâte=new Ingredient();
        this.addIngredient(pâte);
        Ingredient saucetomate=new Ingredient();
        this.addIngredient(saucetomate);
        Ingredient fromage=new Ingredient();
        this.addIngredient(fromage);
        Ingredient fruitsdemer=new Ingredient();
        this.addIngredient(fruitsdemer);

    }

}
