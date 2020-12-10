package Pizza;

public class Mushroom extends PizzaToppings{
    private Pizza pizza;

    public Mushroom(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Mushroom; Price: 3p";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 3;
    }
}
