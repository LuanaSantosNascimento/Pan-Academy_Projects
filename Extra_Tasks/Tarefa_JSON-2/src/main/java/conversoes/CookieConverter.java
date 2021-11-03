package conversoes;

import org.json.Cookie;
import org.json.JSONObject;

public class CookieConverter 
{
	public static void main(String[] args)
	{
		CookieToExampleConversion();		  //Chama o método
		System.out.println(); 				 //Pula linha
		CookieFromExampleConversion();		//Chama o método
	}
												  //Método que converte textos no formato JSON para Cookie
	private static void CookieToExampleConversion() 
	{
		//A varíavel recebe um texto no formato JSON, com os parâmetros necessários para criar um cookie. O formato Cookie não suporta valores boleanos
		String string = "{\"name\":\"Cookie-Name\",\"value\":\"name\",\"1\":5,\"2\":-2.345E68,\"3\":'true'}";
		
		//Instancia um objeto JSONObject passando o parâmentro "string" no método construtor
		JSONObject example = new JSONObject(string);	   
		
		//Converte os valores do JSONObject para formato Cookie e armazena na variável output
		String output = Cookie.toString(example);		 
		System.out.println("Final Cookie: " + output);	//Imprime o valor da variável output
	}
	
													//Método que converte textos no formato Cookie para JSONObject
	private static void CookieFromExampleConversion() 
	{
		String string = "Cookie-Name=name;1=5;2=-2.345E%2b68;3=true";		//A varíavel recebe um texto no formato Cookie

		//Converte a string para formato JSONObject e armazena no objeto output
		JSONObject output = Cookie.toJSONObject(string);		 
		System.out.println("Final JSONObject: " + output);		//Imprime o valor do objeto output
	}
}