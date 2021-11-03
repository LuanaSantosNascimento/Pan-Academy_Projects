package conversoes;

import org.json.HTTP;
import org.json.JSONObject;

public class HTTPConverter 
{
	public static void main(String[] args) 
	{
		HTTPToExampleConversion();			  //Chama o método
		HTTPFromExampleConversion();		//Chama o método
		
	}
	 											//Método que converte textos no formato JSON para HTTP
	private static void HTTPToExampleConversion() 
	{
		//A varíavel recebe um texto no formato JSON, com os parâmetros necessários para criar uma requisição ou cabeçalho HTTP
		String string = "{\"Method\":\"POST\",\"Request-URI\":'/',\"HTTP-Version\":'HTTP/1.1',\"Value1\":true,\"Value2\":2,\"Value3\":-2.345E68}";

		//Instancia um objeto JSONObject passando o parâmentro "string" no método construtor
		JSONObject example = new JSONObject(string);	

		String output = HTTP.toString(example);			 //Converte a string para formato HTTP e armazena no objeto output
		System.out.println("Final HTTP: " + output);	//Imprime o valor da variável output
	}
	
													//Método que converte textos no formato HTTP para JSONObject
	private static void HTTPFromExampleConversion() 
	{
		//A varíavel recebe um texto no formato HTTP
		String string = "Final HTTP: POST '/' HTTP/1.1 Value3: -2.345E+68 Value1: true Value2: 2";

		JSONObject output = HTTP.toJSONObject(string);		 //Converte a string para formato JSONObject e armazena no objeto output
		System.out.println("Final JSONObject: " + output);	//Imprime o valor do objeto output
	}
}