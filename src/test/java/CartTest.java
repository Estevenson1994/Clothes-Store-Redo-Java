import org.junit.Test;

import static org.junit.Assert.*;

public class CartTest {

    @Test
    public void testCartInitiallyHasAnEmptyBasket() {
        Cart cart = new Cart();
        assertEquals(0, cart.basket.size());
    }



}