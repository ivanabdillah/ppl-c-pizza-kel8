package Pizza;

public class Tomatoe extends PizzaToppings{
    private Pizza pizza;

    public Tomatoe(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Tomatoe; Price: 1p";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 1;
    }
}
