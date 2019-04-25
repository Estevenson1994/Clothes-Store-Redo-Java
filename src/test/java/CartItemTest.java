import org.junit.Test;

import static org.junit.Assert.*;

public class CartItemTest {

    @Test
    public void testCartItemHasIdAndQuantity() {
        CartItem shoes = new CartItem(1, 1);
        assertEquals(1, shoes.id);
        assertEquals(1, shoes.quantity);
    }


}