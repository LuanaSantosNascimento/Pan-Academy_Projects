package jsonArray;

import java.io.PrintWriter;
import java.util.Scanner;

import org.json.simple.JSONObject;

public class BuildingJsonArrayApp {

	public static void main(String[] args) {

		try {
			Scanner tec = new Scanner(System.in);
			JSONObject jsonzinho = new JSONObject();
			PrintWriter salvar = new PrintWriter("./src/main/java/arquivos/jsonLivros.json");

			System.out.println("\n" + "-".repeat(20) + " Montando o seu arquivo JSON | Livros " + "-".repeat(20) + "\n");
			System.out.println("Quantas livros deseja inserir no arquivo ? ");
			int qtdLivros = Integer.parseInt(tec.nextLine());

			if (qtdLivros > 1)
				salvar.write("[");

			for (int i = 0; i < qtdLivros; i++) {
				System.out.print("Nome: ");
				String nome = tec.nextLine();

				System.out.print("Autor: ");
				String autor = tec.nextLine();

				System.out.print("Gênero: ");
				String genero = tec.nextLine();

				System.out.print("Editora: ");
				String editora = tec.nextLine();

				jsonzinho.put("Editora", editora);
				jsonzinho.put("Genero", genero);
				jsonzinho.put("Autor", autor);
				jsonzinho.put("Nome", nome);

				salvar.write(jsonzinho.toJSONString());

				if (!(i + 1 == qtdLivros))
					salvar.write(",");

				System.out.println(jsonzinho + "\n");
			}
			
			if (qtdLivros > 1)
				salvar.write("]");

			salvar.flush();
			salvar.close();
			tec.close();

			System.out.println("-".repeat(23) + " Seu arquivo JSON foi montado ! " + "-".repeat(23) + "\n");
		} catch (Exception e) {
			System.out.println("Infelizmente não conseguimos montar o seu arquivo.");
			e.printStackTrace();
		}
	}
}