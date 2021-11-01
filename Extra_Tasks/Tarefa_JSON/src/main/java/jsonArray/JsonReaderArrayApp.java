package jsonArray;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

public class JsonReaderArrayApp {

	public static void main(String[] args)
	{
		try {
			FileReader caminho = new FileReader("./src/main/java/arquivos/jsonLivros.json");
			JSONParser jsonzinho = new JSONParser();
			JSONArray arrayJsonLivros = (JSONArray) jsonzinho.parse(caminho);

			Iterator iterador = arrayJsonLivros.iterator();
			Map hashMap;
			Iterator contador;

			System.out.println("-".repeat(20) + " Lendo o arquivo JSON " + "-".repeat(20));
			System.out.println("-".repeat(27) + " Livros " + "-".repeat(27) + "\n");

			while (iterador.hasNext()) {
				hashMap = (Map) iterador.next();
				contador = hashMap.entrySet().iterator();
				while (contador.hasNext()) {
					String valor = contador.next().toString();
					String str = valor.replace("=", ": ");
					System.out.println(str);
				}
				System.out.println();
			}
			System.out.println("-".repeat(19) + " Leitura concluída !" + "-".repeat(19));

		} catch (Exception e) {
			System.out.println("Infelizmente houve um problema durante a leitura do arquivo.");
			e.printStackTrace();
		}

	}
}
