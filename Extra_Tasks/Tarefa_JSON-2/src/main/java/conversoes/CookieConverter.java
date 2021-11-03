package conversoes;

import org.json.Cookie;
import org.json.JSONObject;

public class CookieConverter 
{
	public static void main(String[] args)
	{
		CookieToExampleConversion();		  //Chama o m�todo
		System.out.println(); 				 //Pula linha
		CookieFromExampleConversion();		//Chama o m�todo
	}

	//M�todo que converte textos no formato JSON para Cookie
	private static void CookieToExampleConversion() 
	{
		//A var�avel recebe um texto no formato JSON, com os par�metros necess�rios para criar um cookie. O formato Cookie n�o suporta valores boleanos
		String string = "{\"name\":\"Cookie-Name\",\"value\":\"name\",\"1\":5,\"2\":-2.345E68,\"3\":'true'}";

		//Instancia um objeto JSONObject passando o par�mentro "string" no m�todo construtor
		JSONObject example = new JSONObject(string);	   

		//Converte os valores do JSONObject para formato Cookie e armazena na vari�vel output
		String output = Cookie.toString(example);	

		//Imprime o valor da vari�vel output
		System.out.println("Final Cookie: " + output);	
	}

	//M�todo que converte textos no formato Cookie para JSONObject
	private static void CookieFromExampleConversion() 
	{
		//A var�avel recebe um texto no formato Cookie
		String string = "Cookie-Name=name;1=5;2=-2.345E%2b68;3=true";		

		//Converte a string para formato JSONObject e armazena no objeto output
		JSONObject output = Cookie.toJSONObject(string);	

		//Imprime o valor do objeto output
		System.out.println("Final JSONObject: " + output);		
	}
}