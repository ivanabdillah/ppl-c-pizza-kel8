package Pizza;

public class BasePizza implements Pizza{
    @Override
    public String getDescription(){
        return "Bahan Dasar, Price = 5p";
    }

    public int getPrice(){
        return 5;
    }
}
