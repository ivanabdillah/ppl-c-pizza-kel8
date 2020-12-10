package Pizza;

public abstract class PizzaToppings implements Pizza {
    @Override
    public String getDescription(){
        return "Toppings";
    }
}
