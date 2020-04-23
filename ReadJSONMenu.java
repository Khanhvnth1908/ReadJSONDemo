import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class ReadJSONMenu {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try{
            Object object = parser.parse(new FileReader("menu.json"));
            JSONObject jsonObject = (JSONObject) object;
            String id = (String) jsonObject.get("id");
            System.out.println(id);
            String value = (String) jsonObject.get("value");
            System.out.println(value);

            JSONArray menuitem = (JSONArray) jsonObject.get("menuitem");
            Iterator iterator = menuitem.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
