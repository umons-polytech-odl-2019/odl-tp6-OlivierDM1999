package be.ac.umons;

public abstract class AbstractFactory
{
    String name;
    public static AbstractFactory getFactory(String name){
        if (name=="FactoryHut"){
            return new FactoryHut();
        }
        else if (name=="FactoryDominos"){
            return new FactoryDominos();
        }
        else{
            return null;
        }
    };
    public abstract Pizza createPizza(String name);
}
