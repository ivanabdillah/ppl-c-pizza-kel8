package Pizza;

public class Pineapple extends PizzaToppings{
    private Pizza pizza;

    public Pineapple(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Pineapple; Price: 2p";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 2;
    }
}
