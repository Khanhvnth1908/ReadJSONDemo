import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSONTest {
    public static void main(String[] args) {
        //JSON parser object to parse read file
        JSONParser jsonParser =  new JSONParser();
        try (FileReader reader = new FileReader("employee.json")){
            //Read JSON file
            Object object = jsonParser.parse(reader);

            JSONArray employeeList = (JSONArray) object;
            System.out.println(employeeList);

            //Iterate over employee
            employeeList.forEach( emp-> parseEmployeeObject((JSONObject) emp));

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
    public static void parseEmployeeObject(JSONObject employee){
        //Get employee object within list
        JSONObject employeeObject = (JSONObject) employee.get("employee");

        String fistName = (String) employeeObject.get("fistName");
        System.out.println(fistName);

        String lastName = (String) employeeObject.get("lastName");
        System.out.println(lastName);

        String website = (String) employeeObject.get("website");
        System.out.println(website);
    }
}
