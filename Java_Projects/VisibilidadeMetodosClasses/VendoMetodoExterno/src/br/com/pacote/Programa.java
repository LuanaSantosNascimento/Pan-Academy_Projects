package br.com.pacote;

import java.lang.reflect.Method;

public class Programa {
	public static void main(String[] args) {
		try {
			//Chama a classe e coloca ela no objetinho
			Object objetinho = Class.forName("br.com.pacote.Pessoa").newInstance(); // Classe pessoa passa a se chamar objetinho / instanciando a classe no objeto objetinho

			//Chama o m�todo e coloca ela no metodinho
			Method metodinho = objetinho.getClass().getDeclaredMethod("getNome", String.class);//Entra na classe -> pega o m�todo da classe

			//Metodinho pode ser visto
			metodinho.setAccessible(true); // define o acesso do metodo informado "V�sivel e n�o v�sivel"

			String MetodoQueChamaNome = (String) metodinho.invoke(objetinho,  ""); //trouxe o retorno do metodo
			System.out.println(MetodoQueChamaNome);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}