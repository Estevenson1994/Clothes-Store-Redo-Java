import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PriceTest {

    public Price price;

    @Test
    public void testPriceHasIdAndPrice() {
        price = new Price(1, (float) 90.00);
        assertEquals(1, price.id);
        assertEquals(90.00, price.price, 0.001);
    }

}