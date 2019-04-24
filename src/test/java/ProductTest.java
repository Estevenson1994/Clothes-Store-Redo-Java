import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {

    public Product shoes;

    @Before
    public void beforeEachTestMethod() {
        shoes = new Product(1, "Almond Court Shoe");
    }

    @Test
    public void testProductHasIdAndName() {
        assertEquals(1, shoes.id);
        assertEquals("Almond Court Shoe", shoes.name);
    }



}