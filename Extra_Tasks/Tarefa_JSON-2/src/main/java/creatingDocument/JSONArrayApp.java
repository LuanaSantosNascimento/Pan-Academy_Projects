package creatingDocument;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONArrayApp 
{
	public static void main(String[] args) 
	{
		System.out.println("-".repeat(10) + " Exemplo 1 " + "-".repeat(10)); //Imprime mensagem
		
		JSONExampleArray1();		 //Chama o m�todo
		System.out.println();		//Pula linha
		
		System.out.println("-".repeat(10) + " Exemplo 2 " + "-".repeat(10));
		JSONExampleArray2();	//Chama o m�todo
	}
												//M�todo que cria um JSONObject a partir de uma String contendo um array usando JSONArray
	private static void JSONExampleArray1() 
	{
		// Declara um array em uma String
		String arrayStr = "[" + "true," + "false," + "\"true\"," + "\"false\"," + "\"hello\"," + "23.45e-4,"
				+ "\"23.45\"," + "42," + "\"43\"," + "[" + "\"world\"" + "]," + "{" + "\"key1\":\"value1\","
				+ "\"key2\":\"value2\"," + "\"key3\":\"value3\"," + "\"key4\":\"value4\"" + "}," + "0," + "\"-1\""
				+ "]";
													
		JSONArray array = new JSONArray(arrayStr);			//Intancia um objeto JSONArray, o m�todo construtor recebe "arrayStr" como par�metro		
		System.out.println("Values array:\n" + array);	   //Imprime o valor do objeto "array"
		System.out.println();

		JSONArray list = listNumberArray(array.length());	       //O objeto "list" recebe um JSONArray de indices atrav�s do m�tdo listNumberArray(tamanho)
		System.out.println("Label Array:\n" + list.toString());	  //Imprime o valor do objeto "list"
		System.out.println();
		
		//Constr�i um objeto JSONObject atrav�s dos objetos "array" e "list" (converte o JSONArray em JSONObject)
		JSONObject object = array.toJSONObject(list);		    
		System.out.println("Final JSONOBject:\n" + object);	   //Imprime o valor do objeto "object"
	}

											  //M�todo que cria um JSONArray e converte em JSONObject
	private static void JSONExampleArray2() 
	{
		JSONArray array = new JSONArray(); //Intancia um objeto JSONArray
										  //Adiciona os elementos no JASONArray atrav�s do m�todo ".put()"
		array.put("value");
		array.put(5);
		array.put(-23.45e67);
		array.put(true);
		
		System.out.println("Array:\n" + array);				  //Imprime o valor do objeto "array"
		System.out.println();

		JSONArray list = listNumberArray(array.length());	//O objeto "list" recebe um JSONArray de indices atrav�s do m�tdo listNumberArray(tamanho)
		System.out.println("List:\n" + list);			   //Imprime o valor do objeto "list"
		System.out.println();
		
		//Constr�i um objeto JSONObject atrav�s dos objetos "array" e "list" (converte o JSONArray em JSONObject)
		JSONObject object = array.toJSONObject(list);						
		System.out.println("Final JSONOBject:\n" + object); //Imprime o valor do objeto "object"
	}

												 //M�todo que cria e retorna um JSONArray de indices.
	private static JSONArray listNumberArray(int max) 
	{	
		JSONArray res = new JSONArray(); 	  //Intancia um objeto JSONArray
		for (int i = 0; i < max; i++) {								
			res.put(String.valueOf(i)); 	//Transforma o valor de "i" em inteiro e adiciona no JSONArray
		}
		return res; 					  //Retorna o JSONArray.
	}
}