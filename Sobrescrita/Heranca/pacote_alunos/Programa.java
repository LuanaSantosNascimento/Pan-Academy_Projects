package pacote_alunos;

public class Programa {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		Professor professor1 = new Professor();
		
		aluno1.setNome("J�lia");
		aluno1.setCurso("Portugu�s");
		
		System.out.println(aluno1.getCurso());
		System.out.println(aluno1.getNome());
		
		professor1.setSalario(1000.00);
		System.out.println(professor1.getSalario());

	}

}
