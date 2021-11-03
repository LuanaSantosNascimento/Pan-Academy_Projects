package creatingDocument;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.json.JSONWriter;

public class JSONWriterApp {

	public static void main(String[] args) 
	{
		System.out.println("-".repeat(10) + " Exemplo JSONWriter " + "-".repeat(10)); //Imprime mensagem
		JSONExamplWriter();			//Chama o m�todo
		System.out.println(); 	   //Pula linha

		System.out.println("-".repeat(10) + " Exemplo JSONOTokener " + "-".repeat(10)); //Imprime mensagem
		JSONExampleTokener();
	}
	
	//M�todo que cria um JSONWriter a partir de um StringBuilder
	private static void JSONExamplWriter() 
	{
		//Instancia um objeto StringBuilder
		StringBuilder write = new StringBuilder();		

		//Intancia um objeto JSONWriter, nesse caso o m�todo construtor PRECISA receber um par�metro e ele recebe o objeto "write"
		JSONWriter jsonWriter = new JSONWriter(write);	

		//Inicia o procedimento de adi��o de elementos com o m�todo ".object()"
		jsonWriter.object();		

		/**
		 * As linhas de c�digo seguintes adicionam os elementos no objeto "jsonWriter",
		 * o m�todo ".key(StringValue)" � utilizado para adicionar/informar a chave, 
		 * e o m�todo ".value(Valor) � utilizado para adicionar/informar o valor do texto.
		 * */
		jsonWriter.key("trueValue").value(true);
		jsonWriter.key("falseValue").value(false);
		jsonWriter.key("nullValue").value(null);
		jsonWriter.key("stringValue").value("hello world!");
		jsonWriter.key("complexStringValue").value("h\be\tllo w\u1234orld!");
		jsonWriter.key("intValue").value(42);
		jsonWriter.key("doubleValue").value(-23.45e67);

		//Finaliza/Termina o procedimento de adi��o de elementos com o m�todo ".endObject()"
		jsonWriter.endObject();		

		//Imprime o valor do objeto "write"
		System.out.println("JSON: " + write.toString()); 
	}
	
	//M�todo que utiliza um JSONTokener para criar JSONObject e JSONArray
	private static void JSONExampleTokener() 
	{
		//Atribuindo valor a vari�vel string
		String string = "1','this is not a valid JSON string";  
		
		//Instanciando um objeto JSONTokener, o m�todo construtor recebe "string" como par�metro
		JSONTokener token = new JSONTokener(string);	
		
		//O JSONTokener � utilizado da mesma forma para instanciar diferentes objetos
		JSONObject object = new JSONObject(token);
		JSONArray array = new JSONArray(token);
		/**
		 * O c�digo acima vai apontar um erro, porqu� o formato da String n�o � v�lido para um JSONObject e para o JSONArray.
		 * Para funcionar no JSONObject, � necess�rio que a String seja um texto JSON v�lido: String string = "{'1':'this is not a valid JSON string'}",
		 * para funcionar no JSONArray, � necess�rio que a String seja um texto array v�lido: String string = "['1','this is not a valid JSON string'].
		 * **/	
	}
}