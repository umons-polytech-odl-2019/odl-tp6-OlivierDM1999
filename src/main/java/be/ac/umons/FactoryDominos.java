package be.ac.umons;

public class FactoryDominos extends AbstractFactory {

    private static FactoryDominos instance=null;
    public static  FactoryDominos getFactory() {
        if (instance==null) {
            return new FactoryDominos();
        }
        return instance;

    }

    public static int stock[]={2,2,2,2};

    @Override
    public Pizza createPizza(String name) {
        if (name=="Prosciutto" && stock[0]>0){
            stock[0]=stock[0]-1;
            return new Prosciutto();
        }
        else if (name=="FruttiDiMare" && stock[1]>0){
            stock[1]=stock[1]-1;
            return new FruttiDiMare();
        }
        else if (name=="Carbonara" && stock[2]>0){
            stock[2]=stock[2]-1;
            return new Carbonara();
        }
        else if (name=="Margherita" && stock[3]>0){
            stock[3]=stock[3]-1;
            return new Margherita();
        }
        else{
            return null;
        }
    }
}
