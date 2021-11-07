import org.junit.After;
import org.junit.Test;

public class FirstTest {
	/*
	 * A anota��o deve ser p�blica e n�o pode ter retorno.
	 * @Test ->informa ao JUnit que aquele m�todo � um teste
	 * N�o incluir a anota��o faz com que o metodo n�o seja "reconhecido/encontrado".
	 * Boas pr�ticas: o nome do m�todo deve ser auto-explicativo.
	 */

	@Test
	public void exemploDeTesteValido() {
		
	}
	
//	@Test 
	public String exemploDeTesteInvalidoReturnString() {
		return "Ol�";
		//Method exemploDeTesteInvalidoReturnString() should be void
	}   
	
//	@Test
	private void exemploDeTesteInvalidoMetodoPrivate() {
		//Method exemploDeTesteInvalidoMetodoPrivate() should be public
	}
	
//	@Test 
	protected void exemploDeTesteInvalidoMetodoProtected() {
		//Method  exemploDeTesteInvalidoMetodoProtected() should be public
	}
	
//	@Test
	@After
	public void exemploDeTesteImpressaoNaTela() {
		System.out.println("Teste 1: Ol�, esse m�todo � v�lido ! :)");
	}
	
	@Test
	public void exemploDeTesteImpressaoNaTela2() {
		System.out.println("Teste 2: Ol�, esse m�todo tamb�m � v�lido ! :)");
	}
	
//	N�o incluir a anota��o faz com que o m�todo seja ignorado pelo JUnit.
	public void metodoNaoETeste() {
		System.out.println("Essa mensagem n�o deve aparecer.");
	}	
}