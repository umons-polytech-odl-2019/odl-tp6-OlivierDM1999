package be.ac.umons;
import java.math.BigDecimal;

public class Ingredient implements PizzaComponent{
    private String name;
    private BigDecimal price;

    public Ingredient() {

    }
    public Ingredient(String name,BigDecimal price) {
        this.name=name;
        this.price=price;

    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString()
    {

        return (this.name+" "+this.price.toString());
    }

}
