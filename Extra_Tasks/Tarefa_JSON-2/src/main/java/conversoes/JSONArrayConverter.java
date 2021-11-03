package conversoes;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONArrayConverter {

	public static void main(String[] args) 
	{
		JSONObjectToArray(); //Chama o m�todo
	}

	private static void JSONObjectToArray() 
	{
		//A var�avel recebe um texto no formato JSON
		String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";

		//Instancia um objeto JSONObject passando o par�mentro "string" no m�todo construtor
		JSONObject example = new JSONObject(string);		

		//O objeto "keyStrings" recebe um JSONArray de indices atrav�s do m�tdo listNumberArray(tamanho)
		JSONArray keyStrings = listNumberArray(example.length());	

		//Constr�i o JSONArray atrav�s dos objetos "example" e "keyStrings" (converte o JSONObject em JSONArray)
		JSONArray array = example.toJSONArray(keyStrings);	

		System.out.println("Final JSONArray: " + array);	//Imprime o valor do array
	}

	//M�todo que cria e retorna um JSONArray de indices.
	private static JSONArray listNumberArray(int max) 
	{	
		//Intancia um objeto JSONArray
		JSONArray res = new JSONArray();

		for (int i = 0; i < max; i++) 
		{								
			res.put(String.valueOf(i)); 	//Transforma o valor de "i" em String e adiciona no JSONArray
		}
		return res; 	//Retorna o JSONArray.
	}
}
