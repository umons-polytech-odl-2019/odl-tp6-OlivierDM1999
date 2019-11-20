package be.ac.umons;


public class Prosciutto extends Pizza{


    Prosciutto(String name) {
        super(name);
        Ingredient pâte=new Ingredient();
        this.addIngredient(pâte);
        Ingredient saucetomate=new Ingredient();
        this.addIngredient(saucetomate);
        Ingredient fromage=new Ingredient();
        this.addIngredient(fromage);
        Ingredient jambon=new Ingredient();
        this.addIngredient(jambon);
    }
}
