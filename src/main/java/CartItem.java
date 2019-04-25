public class CartItem {

    public int id;
    public int quantity;

    public CartItem(int id, int quantity) {
        this.id = id;
        this.quantity = quantity;
    }


    public void increaseQuantity() {
        this.quantity += 1;
    }
}
