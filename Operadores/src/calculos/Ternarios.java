package calculos;

public class Ternarios {
	
	public static void main(String[] args) {
		
		//Tern�rios economizam quebras de linha e facilitam a leitura, s�o utilizados como if e else.
		int hora = 20;
								//	if(true)		else		
		String result = (hora < 18) ? "Good day !" : "Boa tarde !";
		System.out.println(result);
	}
}