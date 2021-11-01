package Private;

public class ProgramaCarroNoMesmoPacote 
{
	//Não irá funcionar, o método exibeVelocidade() não é visível nesta classe.
	public static void main(String[] args) 
	{
		//Instancia o objeto
		Carro c = new Carro();
		
		//Atribui valor a váriavel/atributo nome
		c.nome = "Ferrari";
		
		//Chama o método
		c.exibeVelocidade();
	}
}