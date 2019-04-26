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
        assertEquals(1, shoes.getId());
        assertEquals(1, shoes.getQuantity());
    }

    @Test
    public void testCanIncreaseCartItemQuantity() {
        int initialQuantity = shoes.getQuantity();
        shoes.increaseQuantity();
        int finalQuantity = shoes.getQuantity();
        assertEquals(1, finalQuantity - initialQuantity);
    }

    @Test
    public void testCanDecreaseCartItemQuantity() {
        int initialQuantity = shoes.getQuantity();
        shoes.decreaseQuantity();
        int finalQuantity = shoes.getQuantity();
        assertEquals(-1, finalQuantity - initialQuantity);
    }

}