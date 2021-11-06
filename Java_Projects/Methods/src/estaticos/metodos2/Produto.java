package estaticos.metodos2;

public class Produto 
{	
	public static int resultado(int arroz, int feijao) {
		return arroz + feijao;
	}
	
	public String mudeNomeProduto(String nomeProduto) {
		return nomeProduto;
	}
	
	public static String pegarCpf(String cpf) {
		//String tratei = cpf.strip(); //Java 11 estou no java 1.8
		String tratei = cpf.trim();
		return tratei;
	}
}