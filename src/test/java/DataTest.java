import org.json.JSONArray;
import org.junit.Test;

import static org.junit.Assert.*;

public class DataTest {

    @Test
    public void returnsProductData() throws Exception {
        JSONArray data = Data.returnProductJson();
        assertEquals(13, data.length());
    }

}