import java.util.ArrayList;
import java.util.List;

public class Cart {

    public List<CartItem> basket;

    public Cart() {
        this.basket = new ArrayList<>();
    }


    public void addItem(CartItem item) {
        this.basket.add(item);
    }

    public void removeItem(CartItem item) {
        this.basket.remove(item);
    }



}
