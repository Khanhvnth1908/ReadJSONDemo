import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class WriteJSONTest {
    @SuppressWarnings("unchecked")

    public static void main(String[] args) {
        //FistEmployee
        JSONObject employeeDetails = new JSONObject();
        employeeDetails.put("fistName","Vuong");
        employeeDetails.put("lastName","Ngoc Khanh");
        employeeDetails.put("website","CodeLearn.vn");

        JSONObject employeeObject = new JSONObject();
        employeeObject.put("employee",employeeDetails);
        //SecondEmployee
        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("fistName","Code");
        employeeDetails2.put("lastName","Learn");
        employeeDetails2.put("website","CodeLearn.com");

        JSONObject employeeObject2 = new JSONObject();
        employeeObject2.put("employee",employeeDetails2);


        //Add employee to List
        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(employeeObject2);

        //Write JSON File
        try(FileWriter file = new FileWriter("employee.json")){
            file.write(employeeList.toJSONString());
            file.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
