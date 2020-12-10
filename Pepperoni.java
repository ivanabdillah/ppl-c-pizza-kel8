package Pizza;

public class Pepperoni extends PizzaToppings{
    private Pizza pizza;

    public Pepperoni(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Pepperoni; Price: 4p";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 4;
    }
}