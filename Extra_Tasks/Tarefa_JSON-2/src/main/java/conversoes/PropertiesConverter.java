package conversoes;

import java.util.Properties;

import org.json.JSONObject;
import org.json.Property;

public class PropertiesConverter 
{
	public static void main(String[] args) 
	{
		PropertyFromExampleConversion(); //Chama o método
	}

	private static Properties PropertyToExampleConversion() 
	{
		//A varíavel recebe um texto no formato JSON
		String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";	
		
		//Instancia um objeto JSONObject passando a varíavel String como parametro no método construtor
		JSONObject example = new JSONObject(string);	

		//Converte os valores do objeto "example" para formato Properties e armazena na variável output
		Properties output = Property.toProperties(example);	
		System.out.println("Final Properties: " + output);	//Imprime o valor da variável output
		return output;	//Retorna o objeto
	}

	private static void PropertyFromExampleConversion() 
	{
		//O objeto input do tipo Properties recebe um objeto retornado pelo método "PropertyToExampleConversion();"
		Properties input = PropertyToExampleConversion();	

		//Converte os valores do objeto "input" para formato JSONObject e armazena na variável output
		JSONObject output = Property.toJSONObject(input);
		
		System.out.println("Final JSONObject: " + output);	//Imprime o valor da variável output
	}
}