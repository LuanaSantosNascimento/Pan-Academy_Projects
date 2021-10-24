package Private;

import java.lang.reflect.Method;

public class ProgramaCarroNoMesmoPacote {
	
	public static void main(String[] args) {
		Carro c = new Carro();
		c.setNome("Ferrari");
		
		//c.nome = "Ferrari"; 
		//System.out.println(c.getNome());
		
		//Mudando a visibilidade do método
		try {
			//Chama a classe e coloca ela no objetinho
			Object objetinho = Class.forName("Private.Carro").newInstance();

			//Chama o método e coloca ela no metodinho
			Method metodinho = objetinho.getClass().getDeclaredMethod("getNome", String.class);

			//Metodinho pode ser visto
			metodinho.setAccessible(true);

			String nome = (String) metodinho.invoke(objetinho,  "");
			System.out.println(nome);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}