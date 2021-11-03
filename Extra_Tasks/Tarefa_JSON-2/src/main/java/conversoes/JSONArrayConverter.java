package conversoes;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONArrayConverter {

	public static void main(String[] args) 
	{
		JSONObjectToArray(); //Chama o método
	}

	private static void JSONObjectToArray() 
	{
		//A varíavel recebe um texto no formato JSON
		String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";

		//Instancia um objeto JSONObject passando o parâmentro "string" no método construtor
		JSONObject example = new JSONObject(string);		

		//O objeto "keyStrings" recebe um JSONArray de indices através do métdo listNumberArray(tamanho)
		JSONArray keyStrings = listNumberArray(example.length());	

		//Constrói o JSONArray através dos objetos "example" e "keyStrings" (converte o JSONObject em JSONArray)
		JSONArray array = example.toJSONArray(keyStrings);	

		System.out.println("Final JSONArray: " + array);	//Imprime o valor do array
	}

	//Método que cria e retorna um JSONArray de indices.
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
