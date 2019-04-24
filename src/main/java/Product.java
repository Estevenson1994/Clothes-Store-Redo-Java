import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;


public class Product {
    public int id;
    public String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static List<Product> allProducts() throws Exception {
        List<Product> products = new ArrayList<>();

        JSONArray arr = Data.returnProductJson();
        for (int i = 0; i < arr.length(); i++) {
            String name  = arr.getJSONObject(i).getString("name");
            products.add(new Product(i, name));
        }
        return products;
    }

    public static Product find(int id) throws Exception {
        return allProducts().get(id);
    }


}
