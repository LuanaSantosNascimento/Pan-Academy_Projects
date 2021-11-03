package jsonSimple;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
 
public class ReadJSONExample 
{
    @SuppressWarnings("unchecked")
    public static void main(String[] args) 
    {
        JSONParser jsonParser = new JSONParser(); //Instancia um objeto do tipo JSONParser
         
        try (FileReader reader = new FileReader("./src/main/java/jsonSimple/employees.json"))
        {
        	//Acima, o objeto do tipo FileReader é instanciado, recebendo o caminho do arquivo como parâmetro no método construtor
        	
            Object obj = jsonParser.parse(reader);		//Converte o objeto reader do tipo FileReader para Object
 
            JSONArray employeeList = (JSONArray) obj;	 //Converte o objeto obj do tipo Object para JSONArray
            System.out.println(employeeList);			//Imprime o valor do objeto "employeeList"
             
            //Itera o array
            employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
      //Acima, caso alguma exceção seja disparada, mostra o rastreamento de pilha do erro.
    }
 
    private static void parseEmployeeObject(JSONObject employee) 
    {
        JSONObject employeeObject = (JSONObject) employee.get("employee");		//Pega o objeto "employee"
         
        String firstName = (String) employeeObject.get("firstName");   		  //Pega o valor do elemento "firstName" do objeto "employeeObject"
        System.out.println(firstName);										//Imprime o valor de firstName
         
        String lastName = (String) employeeObject.get("lastName");		 //Pega o valor do elemento "lastName" do objeto "employeeObject"
        System.out.println(lastName);									//Imprime o valor de lastName
      
        String website = (String) employeeObject.get("website");     //Pega o valor do elemento "website" do objeto "employeeObject"
        System.out.println(website);								//Imprime o valor de website
    }
}