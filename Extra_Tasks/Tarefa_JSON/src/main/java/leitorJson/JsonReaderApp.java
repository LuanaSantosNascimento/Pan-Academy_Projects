package leitorJson;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JsonReaderApp 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(JsonReaderApp.class, args);

		try {
			FileReader caminho = new FileReader("./src/main/java/arquivos/meuArquivo.json");
			JSONParser jsonzinho = new JSONParser();
			JSONObject json = (JSONObject) jsonzinho.parse(caminho);

			System.out.println("-".repeat(20) + " Lendo o meu arquivo JSON " + "-".repeat(20) + "\n");
			System.out.println("Nome: " + json.get("Nome"));
			System.out.println("Idade: " + json.get("Idade"));
			System.out.println("Nacionalidade: " + json.get("Nacionalidade"));

			System.out.println("\nLocais onde gostaria de ir: ");
			JSONArray viagens = (JSONArray) json.get("Viagens");
			Iterator iterador = viagens.iterator();
			while (iterador.hasNext()) {
				System.out.println(iterador.next());
			}

			System.out.println("\nLivros que pretendo ler: ");
			JSONArray livros = (JSONArray) json.get("Livros");
			Iterator iterador2 = livros.iterator();
			while (iterador2.hasNext()) {
				System.out.println(iterador2.next());
			}

			System.out.println("\n" + "-".repeat(20) + " Leitura concluída ! " + "-".repeat(20));

		} catch (Exception e) {
			System.out.println("Infelizmente, houve um problema durante a leitura do arquivo.");
			e.printStackTrace();
		}
	}
}