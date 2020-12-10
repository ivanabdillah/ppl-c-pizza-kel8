package Pizza;

public class Chicken extends PizzaToppings{
    private Pizza pizza;

    public Chicken(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Chicken; Price: 5p";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 5;
    }
}
