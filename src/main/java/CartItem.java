public class CartItem {

    private int id;
    private int quantity;

    public CartItem(int id, int quantity) {
        this.id = id;
        this.quantity = quantity;
    }


    public void increaseQuantity() {
        this.quantity += 1;
    }

    public void decreaseQuantity() {
        this.quantity -= 1;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }
}
