package creatingDocument;

import org.json.JSONObject;
import org.json.JSONStringer;

public class JSONStringerApp {

	public static void main(String[] args) 
	{
		System.out.println("-".repeat(10) + " Exemplo " + "-".repeat(10)); //Imprime mensagem
		JSONExampleStringer();		//Chama o m?todo

	}

	//M?todo que cria um JSONObject a partir de uma JSONStringer
	private static void JSONExampleStringer() 
	{		
		//Instancia um objeto JSONStringer
		JSONStringer jsonStringer = new JSONStringer();

		//Inicia o procedimento de adi??o de elementos com o m?todo ".object()"
		jsonStringer.object();								

		/**
		 * As linhas de c?digo seguintes adicionam os elementos no objeto "jsonStringer",
		 * o m?todo ".key(StringValue)" ? utilizado para adicionar/informar a chave, 
		 * e o m?todo ".value(Valor) ? utilizado para adicionar/informar o valor do texto.
		 * */
		jsonStringer.key("trueValue").value(true);
		jsonStringer.key("falseValue").value(false);
		jsonStringer.key("nullValue").value(null);
		jsonStringer.key("stringValue").value("hello world!");
		jsonStringer.key("complexStringValue").value("h\be\tllo w\u1234orld!");
		jsonStringer.key("intValue").value(42);
		jsonStringer.key("doubleValue").value(-23.45e67);

		//Finaliza/Termina o procedimento de adi??o de elementos com o m?todo ".endObject()"
		jsonStringer.endObject();		

		//Retorna o texto JSON e armazena na var?avel str do tipo String
		String str = jsonStringer.toString();				

		//Instancia um objeto JSONObject passando o par?mentro "str" no m?todo construtor
		JSONObject jsonObject = new JSONObject(str);					

		//Imprime o valor do objecto "example"
		System.out.println("Final JSONOBject:\n" + jsonObject);		 
	}
}