package jsonSimple;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJSONExample
{
	@SuppressWarnings("unchecked")
	public static void main( String[] args )
	{
		JSONObject employeeDetails = new JSONObject();			 //Instancia um objeto do tipo JSONObject
																//O método ".put(chave, valor)" adiciona elementos no objeto
		employeeDetails.put("firstName", "Lokesh");
		employeeDetails.put("lastName", "Gupta");
		employeeDetails.put("website", "howtodoinjava.com");
		
		JSONObject employeeObject = new JSONObject(); 			 //Instancia outro objeto do tipo JSONObject
		employeeObject.put("employee", employeeDetails);		//Adiciona o objeto "employeeDetails" no objeto "employeeObject", ambos do tipo JSONObject

		JSONObject employeeDetails2 = new JSONObject();			 //Instancia outro objeto do tipo JSONObject
																//Adicionando elemtos no objeto "employeeDetails2"
		employeeDetails2.put("firstName", "Brian");				
		employeeDetails2.put("lastName", "Schultz");
		employeeDetails2.put("website", "example.com");

		JSONObject employeeObject2 = new JSONObject(); 				 //Instancia outro objeto do tipo JSONObject
		employeeObject2.put("employee", employeeDetails2);			//Adiciona o objeto "employeeDetails2" no objeto "employeeObject", ambos do tipo JSONObject

		JSONArray employeeList = new JSONArray();					 //Instancia um objeto do tipo JSONArray
																	//Adicionando objetos do tipo JSONObject no JSONArray "employeeList"
		employeeList.add(employeeObject);
		employeeList.add(employeeObject2);

		//Escrevendo o arquivo Json
		try (FileWriter file = new FileWriter("./src/main/java/jsonSimple/employees.json")) 
		{
			 //Acima, o objeto do tipo FileWriter é instanciado, recebendo o caminho do arquivo como parâmetro no método construtor
			//Converte o objeto "employeeList" do tipo JSONArray para String e escreve/armazena os dados no buffer desse fluxo
			file.write(employeeList.toJSONString()); 
			
			//Faz com que o conteúdo do buffer seja escrito em disco
			file.flush();

		} catch (IOException e) {
			//Caso alguma exceção seja disparada, mostra o rastreamento de pilha do erro
			e.printStackTrace();
		}
	}
}