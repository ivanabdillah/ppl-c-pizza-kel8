package Pizza;

public class Tuna extends PizzaToppings{
    private Pizza pizza;

    public Tuna(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Tuna; Price: 4p";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 4;
    }
}
