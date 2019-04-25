import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class PriceTest {

    public Price price;
    public List<Price> prices;

    @Test
    public void testPriceHasIdAndPrice() {
        List<Object> itemPrices = new ArrayList<>( Arrays.asList(90.00));
        price = new Price(1, itemPrices);
        assertEquals(1, price.id);
        assertEquals(itemPrices, price.price);
    }


}