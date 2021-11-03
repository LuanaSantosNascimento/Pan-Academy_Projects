package conversoes;

import org.json.JSONObject;
import org.json.XML;

public class XMLConverter 
{
	public static void main(String[] args) 
	{
		//Chama os m�todos
		XMLToExampleConversion();
		XMLFromExampleConversion();
	}
	
	private static void XMLToExampleConversion() 
	{
		//A var�avel recebe um texto no formato JSON
		String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";		
		
		//Instancia um objeto JSONObject passando a var�avel String como parametro no m�todo construtor
		JSONObject example = new JSONObject(string);	

		//Converte os valores do objeto "example" para formato Properties e armazena na vari�vel output
		String output = XML.toString(example);		
		
		System.out.println("Final XML: " + output);	//Imprime o valor da vari�vel output
	}
	
	private static void XMLFromExampleConversion() 
	{
		//A var�avel recebe um texto no formato XML
		String string = "<0>value</0><1>5</1><2>-2.345E+68</2><3>true</3>"; 	
		
		//Instancia um objeto JSONObject passando a var�avel String como parametro no m�todo construtor
		JSONObject output = XML.toJSONObject(string); 
		
		System.out.println("Final JSONObject: " + output);	//Imprime o valor da vari�vel output
	}
}