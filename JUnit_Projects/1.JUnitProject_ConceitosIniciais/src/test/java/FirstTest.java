import org.junit.After;
import org.junit.Test;

public class FirstTest {
	/*
	 * A anotação deve ser pública e não pode ter retorno.
	 * @Test ->informa ao JUnit que aquele método é um teste
	 * Não incluir a anotação faz com que o metodo não seja "reconhecido/encontrado".
	 * Boas práticas: o nome do método deve ser auto-explicativo.
	 */

	@Test
	public void exemploDeTesteValido() {
		
	}
	
//	@Test 
	public String exemploDeTesteInvalidoReturnString() {
		return "Olá";
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
		System.out.println("Teste 1: Olá, esse método é válido ! :)");
	}
	
	@Test
	public void exemploDeTesteImpressaoNaTela2() {
		System.out.println("Teste 2: Olá, esse método também é válido ! :)");
	}
	
//	Não incluir a anotação faz com que o método seja ignorado pelo JUnit.
	public void metodoNaoETeste() {
		System.out.println("Essa mensagem não deve aparecer.");
	}	
}