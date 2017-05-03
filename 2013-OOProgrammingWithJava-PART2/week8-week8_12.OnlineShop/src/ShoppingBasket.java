
import java.util.Map;
import java.util.HashMap;

public class ShoppingBasket {

    private Map<String, Purchase> basket;

    public ShoppingBasket() {
        this.basket = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {

        if (basket.containsKey(product)) {
            basket.get(product).increaseAmount();
            return;
        }

        Purchase purchase = new Purchase(product, 1, price);
        basket.put(product, purchase);
    }

    public int price() {
        int price = 0;
        for (Purchase purchase : basket.values()) {
            price += purchase.price();
        }
        return price;
    }

    public void print() {
        for (Purchase purchase : basket.values()) {
            System.out.println(purchase);
        }
    }

}
