package Pizza;

public class Pepper extends PizzaToppings{
    private Pizza pizza;

    public Pepper(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Pepper; Price: 2p";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 2;
    }
}
