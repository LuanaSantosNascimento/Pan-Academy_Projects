package creatingDocument;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

public class JSONObjetcApp {

	public static void main(String[] args) 
	{
		System.out.println("-".repeat(10) + " Exemplo 1 " + "-".repeat(10)); //Imprime mensagem
		JSONExampleObject1();		//Chama o método
		System.out.println();		//Pula linha
		
		System.out.println("-".repeat(10) + " Exemplo 2 " + "-".repeat(10)); //Imprime mensagem
		JSONExampleObject2();		//Chama o método
		System.out.println();
		
		System.out.println("-".repeat(10) + " Exemplo 3 " + "-".repeat(10)); //Imprime mensagem
		JSONExampleObject3();		//Chama o método
	}
	
											//Método que cria um JSONObject utilizando o construtor de classe
	private static void JSONExampleObject1() 
	{
		String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";	//Declara os valores do JSONObject em uma String
		JSONObject example = new JSONObject(string);						   //Instancia um objeto JSONObject passando o parâmentro "string" no método construtor
		System.out.println("Final JSONObject:\t" + example);				  //Imprime o valor do objecto "example"	
	}
											//Método que cria um JSONObject sem utilizar o construtor de classe
	private static void JSONExampleObject2() 
	{
		JSONObject example = new JSONObject();		 //Instancia um objeto JSONObject
													//Adiciona os elementos no JASONObject através do método ".put(chave, valor)"
		example.put("key", "value");			
		example.put("key2", 5);
		example.put("key3", -23.45e67);
		example.put("trueValue", true);
		
		/**
		 * Não é permitido adiconar chaves ou valores nulos no objeto. Exemplos inválidos:
		 * example.put(null, null);
		 * example.put("nullValue", null);
		 * example.put(null, 456);
		 * */
		
		 System.out.println("Final JSONOBject:\t" + example);		//Imprime o valor do objeto "example"
	}

											//Método que cria um JSONObject utlizando Java Map
	private static void JSONExampleObject3() 
	{
		//Instancia o objeto, informando que o primeiro parâmetro deve ser do tipo String e o segundo do tipo Double
		Map<String,Double> map = new HashMap<String, Double>();		
										//Adiciona os elementos no Map através do método ".put(chave, valor)"
		map.put("key1", 1.0);
		map.put("key2", -23.45e67);

		/**
		 * A chave deve ser (neste caso) obrigatoriamente do tipo String e o valor do tipo Double. Exemplos inválidos:
		 * map.put(12, 4.6);
		 * map.put("12", "4.6");
		 * map.put(2.2, 4.0)
		 * */

		JSONObject example = new JSONObject(map);					//Instancia um objeto JSONObject passando o parâmentro "map" no método construtor
		System.out.println("Final JSONOBject:\t" + example); 	   //Imprime o valor do objeto "example"
	}
}