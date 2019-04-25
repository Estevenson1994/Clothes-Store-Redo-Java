import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class CartTest {

    private Cart cart;

    @Mock
    private CartItem mockedCartItem;


    @Before
    public void beforeEachTestMethod() {
        cart = new Cart();
        mockedCartItem = mock(CartItem.class);
    }


    @Test
    public void testCartInitiallyHasAnEmptyBasket() {
        assertEquals(0, cart.basket.size());
    }

    @Test
    public void testCartCanHadAnItemToBasket() {
        cart.addItem(mockedCartItem);
        assertThat(cart.basket, hasItems(mockedCartItem));
        assertEquals(1, cart.basket.size());

    }

    @Test
    public void testCartCanRemoveItemFromBasket() {
        cart.addItem(mockedCartItem);
        cart.removeItem(mockedCartItem);
        assertThat(cart.basket, not(hasItems(mockedCartItem)));
        assertEquals(0, cart.basket.size());
    }

}