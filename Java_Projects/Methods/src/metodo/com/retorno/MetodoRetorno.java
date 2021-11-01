package metodo.com.retorno;

public class MetodoRetorno {
	
	public int atributo1;
	
	public boolean metodo1() {
		System.out.println("Chamou o metodo 1.");
		return atributo1 < 0;
	}
}