package conversoes;

import org.json.HTTP;
import org.json.JSONObject;

public class HTTPConverter 
{
	public static void main(String[] args) 
	{
		HTTPToExampleConversion();			  //Chama o m�todo
		HTTPFromExampleConversion();		//Chama o m�todo
		
	}
	 											//M�todo que converte textos no formato JSON para HTTP
	private static void HTTPToExampleConversion() 
	{
		//A var�avel recebe um texto no formato JSON, com os par�metros necess�rios para criar uma requisi��o ou cabe�alho HTTP
		String string = "{\"Method\":\"POST\",\"Request-URI\":'/',\"HTTP-Version\":'HTTP/1.1',\"Value1\":true,\"Value2\":2,\"Value3\":-2.345E68}";

		//Instancia um objeto JSONObject passando o par�mentro "string" no m�todo construtor
		JSONObject example = new JSONObject(string);	

		String output = HTTP.toString(example);			 //Converte a string para formato HTTP e armazena no objeto output
		System.out.println("Final HTTP: " + output);	//Imprime o valor da vari�vel output
	}
	
													//M�todo que converte textos no formato HTTP para JSONObject
	private static void HTTPFromExampleConversion() 
	{
		//A var�avel recebe um texto no formato HTTP
		String string = "Final HTTP: POST '/' HTTP/1.1 Value3: -2.345E+68 Value1: true Value2: 2";

		JSONObject output = HTTP.toJSONObject(string);		 //Converte a string para formato JSONObject e armazena no objeto output
		System.out.println("Final JSONObject: " + output);	//Imprime o valor do objeto output
	}
}