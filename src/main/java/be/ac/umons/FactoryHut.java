package be.ac.umons;

public class FactoryHut extends AbstractFactory {
    public static FactoryHut instance=null;
    public static FactoryHut getFactory(){
        if (instance==null){
            return new FactoryHut();
        }
        return instance;
    }
    static int stock []={2,2,2,2};

    @Override
    public Pizza createPizza(String name) {
        if (name=="Prosciutto" && stock[0]>0){
            stock[0]=stock[0]-1;
            Prosciutto tmp=new Prosciutto();
            tmp.addIngredient(new Olive());
            return tmp;
        }
        else if (name=="FruttiDiMare" && stock[1]>0){
            stock[1]=stock[1]-1;
            FruttiDiMare tmp=new FruttiDiMare();
            tmp.addIngredient(new Olive());
            return tmp;
        }
        else if (name=="Carbonara" && stock[2]>0){
            stock[2]=stock[2]-1;
            Carbonara tmp=new Carbonara();
            tmp.addIngredient(new Olive());
            return tmp;
        }
        else if (name=="Margherita" && stock[3]>0){
            stock[3]=stock[3]-1;
            Margherita tmp=new Margherita();
            tmp.addIngredient(new Olive());
            return tmp;
        }
        else{
            return null;
        }
    }
}
