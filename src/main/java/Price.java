import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class Price {

    public int id;
    public List<Object> price;

    public Price(int id, List<Object> price) {
        this.id = id;
        this.price = price;
    }


    public static List<Price> allPrices() throws Exception {
        List<Price> prices = new ArrayList<>();

        JSONArray arr = Data.returnProductJson();
        for (int item = 0; item < arr.length(); item++) {
            JSONArray jsonItemPrices = arr.getJSONObject(item).getJSONArray("price");
            List<Object> itemPrices = getArrayListfromJsonArray(jsonItemPrices);
            prices.add(new Price(item, itemPrices));
        }
        return prices;

    }

    public static Price findPrice(int id) throws Exception {
        return allPrices().get(id);

    }

    private static List<Object> getArrayListfromJsonArray(JSONArray jsonItemPrices) {
        List<Object> itemPrices = new ArrayList<>();
        for (int i = 0; i < jsonItemPrices.length(); i++) {
            itemPrices.add(jsonItemPrices.get(i));
        }
        return itemPrices;
    }

}
