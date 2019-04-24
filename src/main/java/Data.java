import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;

public class Data {

    public static JSONArray returnProductJson() throws Exception {
        File file = new File("./production_data.json");
        String content = FileUtils.readFileToString(file, "utf-8");

        JSONObject obj = new JSONObject(content);

        return obj.getJSONArray("products");
    }
}
