package Pizza;

public class Cheese extends PizzaToppings{
    private Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese; Price: 1p";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 1;
    }
}