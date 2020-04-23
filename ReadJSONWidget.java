import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSONWidget {
    public static void main(String[] args) {
        //JSON parser object to parse read file
        JSONParser jsonParser =  new JSONParser();
        try (FileReader reader = new FileReader("widget.json")){
            //Read JSON file
            Object object = jsonParser.parse(reader);

            JSONObject jsonObject = (JSONObject) object;
            String debut = (String) jsonObject.get("debug");
            System.out.println(debut);

            //window
            System.out.println("Window :");
            JSONObject windowObject = (JSONObject) object;
            window(windowObject);

            //image
            System.out.println("\nimage : ");
            JSONObject imageObject = (JSONObject) object;
            image(imageObject);

            //text
            System.out.println("\ntext :");
            JSONObject textObject = (JSONObject) object;
            text(textObject);

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ParseException e){
            e.printStackTrace();
        }
    }

    public static void window(JSONObject window){
        //Get employee object within list
        JSONObject windowOject = (JSONObject) window.get("window");

        String title = (String) windowOject.get("title");
        System.out.println(title);

        String name = (String) windowOject.get("name");
        System.out.println(name);

        String website = (String) windowOject.get("width");
        System.out.println(website);

        String height = (String) windowOject.get("height");
        System.out.println(height);
    }

    public static void image(JSONObject image){
        //Get employee object within list
        JSONObject imageObject = (JSONObject) image.get("image");

        String src = (String) imageObject.get("src");
        System.out.println(src);

        String name = (String) imageObject.get("name");
        System.out.println(name);

        String hOffset = (String) imageObject.get("hOffset");
        System.out.println(hOffset);

        String vOffset = (String) imageObject.get("vOffset");
        System.out.println(vOffset);
    }

    public static void text(JSONObject text){
        //Get employee object within list
        JSONObject textObject = (JSONObject) text.get("text");

        String data = (String) textObject.get("data");
        System.out.println(data);

        String size = (String) textObject.get("size");
        System.out.println(size);

        String style = (String) textObject.get("style");
        System.out.println(style);

        String name = (String) textObject.get("name");
        System.out.println(name);

        String hOffset = (String) textObject.get("hOffset");
        System.out.println(size);

        String vOffset = (String) textObject.get("vOffset");
        System.out.println(style);

        String alignment = (String) textObject.get("alignment");
        System.out.println(alignment);

        String onMouseUp = (String) textObject.get("onMouseUp");
        System.out.println(onMouseUp);

    }
}
