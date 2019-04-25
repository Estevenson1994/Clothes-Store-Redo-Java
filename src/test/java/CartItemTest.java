import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CartItemTest {

    public CartItem shoes;


    @Before
    public void beforeEachTestMethod() {
        shoes = new CartItem(1, 1);

    }

    @Test
    public void testCartItemHasIdAndQuantity() {
        assertEquals(1, shoes.id);
        assertEquals(1, shoes.quantity);
    }

    @Test
    public void testCanIncreaseCartItemQuantity() {
        int initialQuantity = shoes.quantity;
        shoes.increaseQuantity();
        int finalQuantity = shoes.quantity;
        assertEquals(1, finalQuantity - initialQuantity);
    }


}