package creatingDocument;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

public class JSONObjetcApp {

	public static void main(String[] args) 
	{
		System.out.println("-".repeat(10) + " Exemplo 1 " + "-".repeat(10)); //Imprime mensagem
		JSONExampleObject1();		//Chama o m�todo
		System.out.println();		//Pula linha
		
		System.out.println("-".repeat(10) + " Exemplo 2 " + "-".repeat(10)); //Imprime mensagem
		JSONExampleObject2();		//Chama o m�todo
		System.out.println();
		
		System.out.println("-".repeat(10) + " Exemplo 3 " + "-".repeat(10)); //Imprime mensagem
		JSONExampleObject3();		//Chama o m�todo
	}
	
											//M�todo que cria um JSONObject utilizando o construtor de classe
	private static void JSONExampleObject1() 
	{
		String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";	//Declara os valores do JSONObject em uma String
		JSONObject example = new JSONObject(string);						   //Instancia um objeto JSONObject passando o par�mentro "string" no m�todo construtor
		System.out.println("Final JSONObject:\t" + example);				  //Imprime o valor do objecto "example"	
	}
											//M�todo que cria um JSONObject sem utilizar o construtor de classe
	private static void JSONExampleObject2() 
	{
		JSONObject example = new JSONObject();		 //Instancia um objeto JSONObject
													//Adiciona os elementos no JASONObject atrav�s do m�todo ".put(chave, valor)"
		example.put("key", "value");			
		example.put("key2", 5);
		example.put("key3", -23.45e67);
		example.put("trueValue", true);
		
		/**
		 * N�o � permitido adiconar chaves ou valores nulos no objeto. Exemplos inv�lidos:
		 * example.put(null, null);
		 * example.put("nullValue", null);
		 * example.put(null, 456);
		 * */
		
		 System.out.println("Final JSONOBject:\t" + example);		//Imprime o valor do objeto "example"
	}

											//M�todo que cria um JSONObject utlizando Java Map
	private static void JSONExampleObject3() 
	{
		//Instancia o objeto, informando que o primeiro par�metro deve ser do tipo String e o segundo do tipo Double
		Map<String,Double> map = new HashMap<String, Double>();		
										//Adiciona os elementos no Map atrav�s do m�todo ".put(chave, valor)"
		map.put("key1", 1.0);
		map.put("key2", -23.45e67);

		/**
		 * A chave deve ser (neste caso) obrigatoriamente do tipo String e o valor do tipo Double. Exemplos inv�lidos:
		 * map.put(12, 4.6);
		 * map.put("12", "4.6");
		 * map.put(2.2, 4.0)
		 * */

		JSONObject example = new JSONObject(map);					//Instancia um objeto JSONObject passando o par�mentro "map" no m�todo construtor
		System.out.println("Final JSONOBject:\t" + example); 	   //Imprime o valor do objeto "example"
	}
}