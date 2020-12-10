package Pizza;

public class main {
    public static void main(String[] args) {
        Pizza pizza = new BasePizza();

        pizza = new Ham(pizza);
        pizza = new Onion(pizza);
        pizza = new Mushroom(pizza);
        pizza = new Pineapple(pizza);

        System.out.println("Deskripsi Pesanan: " + pizza.getDescription());
        System.out.println("Harga: " + pizza.getPrice() + "p");
    }
}
