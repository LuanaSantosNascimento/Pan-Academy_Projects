package conversoes;

import java.util.Properties;

import org.json.JSONObject;
import org.json.Property;

public class PropertiesConverter 
{
	public static void main(String[] args) 
	{
		PropertyFromExampleConversion(); //Chama o m�todo
	}

	private static Properties PropertyToExampleConversion() 
	{
		//A var�avel recebe um texto no formato JSON
		String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";	
		
		//Instancia um objeto JSONObject passando a var�avel String como parametro no m�todo construtor
		JSONObject example = new JSONObject(string);	

		//Converte os valores do objeto "example" para formato Properties e armazena na vari�vel output
		Properties output = Property.toProperties(example);	
		System.out.println("Final Properties: " + output);	//Imprime o valor da vari�vel output
		return output;	//Retorna o objeto
	}

	private static void PropertyFromExampleConversion() 
	{
		//O objeto input do tipo Properties recebe um objeto retornado pelo m�todo "PropertyToExampleConversion();"
		Properties input = PropertyToExampleConversion();	

		//Converte os valores do objeto "input" para formato JSONObject e armazena na vari�vel output
		JSONObject output = Property.toJSONObject(input);
		
		System.out.println("Final JSONObject: " + output);	//Imprime o valor da vari�vel output
	}
}