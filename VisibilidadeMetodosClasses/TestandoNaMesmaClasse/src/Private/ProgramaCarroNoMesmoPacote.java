package Private;

public class ProgramaCarroNoMesmoPacote 
{
	//N�o ir� funcionar, o m�todo exibeVelocidade() n�o � vis�vel nesta classe.
	public static void main(String[] args) 
	{
		//Instancia o objeto
		Carro c = new Carro();
		
		//Atribui valor a v�riavel/atributo nome
		c.nome = "Ferrari";
		
		//Chama o m�todo
		c.exibeVelocidade();
	}
}