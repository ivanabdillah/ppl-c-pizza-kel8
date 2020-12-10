package Pizza;

public class Ham extends PizzaToppings{
    private Pizza pizza;

    public Ham(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Ham; Price: 5p";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 5;
    }
}
