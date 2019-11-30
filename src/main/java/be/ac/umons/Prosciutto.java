package be.ac.umons;


import java.util.Map;

public class Prosciutto extends Pizza{


    Prosciutto() {
        super("Prosciutto");
        addIngredient(new Dough());
        addIngredient(new TomatoSauce());
        addIngredient(new Cheese());
        addIngredient(new Ham());
    }
}
