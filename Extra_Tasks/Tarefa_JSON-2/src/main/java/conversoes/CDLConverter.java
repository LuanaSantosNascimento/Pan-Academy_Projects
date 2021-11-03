package conversoes;

import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONObject;

public class CDLConverter 
{
	public static void main(String[] args) 
	{
		CDLToExampleConversion();	 //Chama o m�todo
		CDLFromExampleConversion();	//Chama o m�todo
	}

	//M�todo que converte textos no formato JSON para CDL
	private static void CDLToExampleConversion() 
	{
		//A var�avel recebe um texto no formato JSON
		String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";

		//Instancia o JSONObject passando o par�mentro "string" no m�todo construtor
		JSONObject example = new JSONObject(string);	   

		//A var�avel recebe um texto no formato JSON
		String string2 = "{\"0\":\"value2\",\"1\":6,\"2\":-8.345E68,\"3\":false}";	

		//Instancia o JSONObject passando o par�mentro "string2" no m�todo construtor
		JSONObject example2 = new JSONObject(string2);		

		//Instancia um objeto JSONArray
		JSONArray array = new JSONArray();

		//Adiciona o JSONObjetc no array, atrav�s do m�todo ".put()"
		array.put(example);						 
		array.put(example2);					

		//Converte os valores do array para formato CDL e armazena na vari�vel output
		String output = CDL.toString(array);			

		//Imprime o valor da vari�vel output
		System.out.println("Final CDL: \r\n" + output);		
	}

	//M�todo que converte textos no formato CDL para JSONArray
	private static void CDLFromExampleConversion() 
	{
		//A var�avel recebe um texto no formato CDL
		String string = "0,1,2,3\n"
				+ "value,5,-2.345E+68,true\n"
				+ "value2,6,-8.345E+68,false";

		//Converte os valores da string para formato JSONArray e armazena na vari�vel output
		JSONArray output = CDL.toJSONArray(string);		

		//Imprime o valor da vari�vel output
		System.out.println("Final JSONArray: " + output);	
	}
}