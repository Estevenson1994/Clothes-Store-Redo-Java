import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class PriceTest {

    public Price price;
    public List<Price> prices;
    public List<Object> firstItemPrices;
    public List<Object> lastItemPrices;

    @Before
    public void beforeEachTestMethod() throws Exception {
        prices = Price.allPrices();
        firstItemPrices = new ArrayList<>( Arrays.asList(99.00));
        lastItemPrices = new ArrayList<>( Arrays.asList(540.00));
    }

    @Test
    public void testPriceHasIdAndPrice() {
        price = new Price(1, firstItemPrices);
        assertEquals(1, price.id);
        assertEquals(firstItemPrices, price.price);
    }


    @Test
    public void testAllPriceMethodReturns13Prices() {

        assertEquals(13, prices.size());
    }

    @Test
    public void testFirstPriceIsCorrect() {
        Price firstPrice = prices.get(0);
        assertEquals(0, firstPrice.id);
        assertEquals(firstItemPrices, firstPrice.price);
    }

    @Test
    public void testLastPrice() {
        Price lastPrice = prices.get(12);
        assertEquals(12, lastPrice.id);
        assertEquals(lastItemPrices, lastPrice.price);
    }



}