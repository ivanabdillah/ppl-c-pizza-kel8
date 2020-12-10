package Pizza;

public class Olive extends PizzaToppings{
    private Pizza pizza;

    public Olive(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Olive; Price: 4p";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 4;
    }
}
