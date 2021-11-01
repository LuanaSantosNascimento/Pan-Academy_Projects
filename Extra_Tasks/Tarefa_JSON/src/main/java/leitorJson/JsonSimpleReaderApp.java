package leitorJson;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonSimpleReaderApp {

	public static void main(String[] args) {
		try {
			FileReader caminho = new FileReader("./src/main/java/arquivos/arquivoSimples.json");
			JSONParser objetinho = new JSONParser();
			JSONObject jsonzinho = (JSONObject) objetinho.parse(caminho);
			Iterator iterador = jsonzinho.keySet().iterator();

			System.out.println("-".repeat(10) + " Lendo o arquivo JSON " + "-".repeat(10));
			System.out.println();

			while (iterador.hasNext()) {
				Object id = iterador.next();
				Object valor = jsonzinho.get(id);
				System.out.println(id + ": " + valor);
			}
			
			System.out.println();
			System.out.println("-".repeat(9) + " Leitura concluída ! " + "-".repeat(9));
		} catch (Exception e) {
			System.out.println("Infelizmente houve um problema durante a leitura do arquivo.");
			e.printStackTrace();
		}

	}
}