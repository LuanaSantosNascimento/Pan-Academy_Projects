package conversoes;

import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONObject;

public class CDLConverter 
{
	public static void main(String[] args) 
	{
		CDLToExampleConversion();	 //Chama o método
		CDLFromExampleConversion();	//Chama o método
	}
												//Método que converte textos no formato JSON para CDL
	private static void CDLToExampleConversion() 
	{
		String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}"; //A varíavel recebe um texto no formato JSON
		JSONObject example = new JSONObject(string);	   //Instancia o JSONObject passando o parâmentro "string" no método construtor
		
		String string2 = "{\"0\":\"value2\",\"1\":6,\"2\":-8.345E68,\"3\":false}";	//A varíavel recebe um texto no formato JSON
		JSONObject example2 = new JSONObject(string2);							   //Instancia o JSONObject passando o parâmentro "string2" no método construtor

		JSONArray array = new JSONArray();		  //Instancia o JSONArray
		array.put(example);						 //Adiciona o JSONObjetc no array, através do método ".put()"
		array.put(example2);					//Adiciona o JSONObjetc no array, através do método ".put()"
		
		String output = CDL.toString(array);				 //Converte os valores do array para formato CDL e armazena na variável output
		System.out.println("Final CDL: \r\n" + output);		//Imprime o valor da variável output
	}
	
											//Método que converte textos no formato CDL para JSONArray
	private static void CDLFromExampleConversion() 
	{
											//A varíavel recebe um texto no formato CDL
		String string = "0,1,2,3\n"
				+ "value,5,-2.345E+68,true\n"
				+ "value2,6,-8.345E+68,false";

		JSONArray output = CDL.toJSONArray(string);			 //Converte os valores da string para formato JSONArray e armazena na variável output
		System.out.println("Final JSONArray: " + output);	//Imprime o valor da variável output
	}
}