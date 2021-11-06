package estaticos.atributos;

public class Programa 
{
	public static void main(String[] args) 
	{
		// Não precisa inicializar
		Time.professor= "Master Coach Gilberto";
		//Time.aluno = "Julia";
		
		Time atleta1_do_time = new Time();
		atleta1_do_time.atleta = "Júlia";
		System.out.println("Atleta: " + atleta1_do_time.atleta);
		System.out.println("Coach: " + atleta1_do_time.professor);
		
		Time atleta2_do_time = new Time();
		atleta2_do_time.atleta = "Marcela";
		System.out.println("Atleta :" + atleta2_do_time.atleta);
		System.out.println("Coach: " + atleta2_do_time.professor);	
	}
}