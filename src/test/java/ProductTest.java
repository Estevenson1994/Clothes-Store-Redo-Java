import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ProductTest {

    public Product shoes;
    public List<Product> products;

    @Before
    public void beforeEachTestMethod() {
        shoes = new Product(1, "Almond Court Shoe");
    }

    @Test
    public void testProductHasIdAndName() {
        assertEquals(1, shoes.id);
        assertEquals("Almond Court Shoe", shoes.name);
    }

    @Test
    public void testReturnAllProductsHasLength13() throws Exception {
        products = Product.allProducts();
        assertEquals(13, products.size());
    }

    @Test
    public void testFirstProductHasCorrectName() throws Exception {
        Product first = Product.allProducts().get(0);
        assertEquals(0, first.id);
        assertEquals("Almond Toe Court Shoes", first.name);

    }

    @Test
    public void testLastProductHasCorrectName() throws Exception {
        Product last = Product.allProducts().get(12);
        assertEquals(12, last.id);
        assertEquals("Mid Twist Cut-Out Dress", last.name);
    }

    @Test
    public void testFindReturnsCorrectProduct() throws Exception {
        Product dress = Product.find(11);
        assertEquals(11, dress.id);
        assertEquals("Bird Print Dress", dress.name);
    }


}