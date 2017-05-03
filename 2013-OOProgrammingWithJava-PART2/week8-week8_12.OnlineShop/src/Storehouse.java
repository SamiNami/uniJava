
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class Storehouse {

    private Map<String, Integer> storage = new HashMap<String, Integer>();
    private Map<String, Integer> stock = new HashMap<String, Integer>();

    public void addProduct(String product, int price, int stock) {
        this.storage.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {

        if (this.storage.containsKey(product)) {
            return this.storage.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (this.stock.containsKey(product)) {
            return this.stock.get(product);
        }
        return 0;
    }

    public boolean take(String product) {

        if (!this.stock.containsKey(product)) {
            return false;
        }

        if (this.stock.get(product) == 0) {
            return false;
        }

        int current = this.stock.get(product);
        current--;
        this.stock.put(product, current);
        return true;

    }

    public Set<String> products() {
        return this.stock.keySet();
    }

}
