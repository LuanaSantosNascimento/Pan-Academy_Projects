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
		//Instancia um objeto do tipo JSONParser
		JSONParser jsonParser = new JSONParser(); 

		try (FileReader reader = new FileReader("./src/main/java/jsonSimple/employees.json"))
		{
			//Acima, o objeto do tipo FileReader é instanciado, recebendo o caminho do arquivo como parâmetro no método construtor
			//Converte o objeto reader do tipo FileReader para Object
			Object obj = jsonParser.parse(reader);		

			//Converte o objeto obj do tipo Object para JSONArray
			JSONArray employeeList = (JSONArray) obj;

			//Imprime o valor do objeto "employeeList"
			System.out.println(employeeList);			

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
		//Pega o objeto "employee"
		JSONObject employeeObject = (JSONObject) employee.get("employee");		

		//Pega o valor do elemento "firstName" do objeto "employeeObject"
		String firstName = (String) employeeObject.get("firstName");

		//Imprime o valor de firstName
		System.out.println(firstName);										

		//Pega o valor do elemento "lastName" do objeto "employeeObject"
		String lastName = (String) employeeObject.get("lastName");
		
		//Imprime o valor de lastName
		System.out.println(lastName);									

		//Pega o valor do elemento "website" do objeto "employeeObject"
		String website = (String) employeeObject.get("website");     
		
		//Imprime o valor de website
		System.out.println(website);								
	}
}