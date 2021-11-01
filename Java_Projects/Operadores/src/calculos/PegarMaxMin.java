package calculos;

public class PegarMaxMin {

	public static void main(String[] args) 
	{
																			//Informa o maior n�mero
		System.out.println("M�ximo: " + Math.max(5, 10));
																			//Informa o menor n�mero
		System.out.println("M�nimo: "+ Math.min(5, 10));
		
		double a = 3.15;
																			//Arredonda p/ cima
		System.out.println("Ceil arr. para cima: " + Math.ceil(a));
																			//Arredonda p/ baixo
		System.out.println("Ceil arr. para baixo: " + Math.floor(a));
																	
																			//Instanciou um vetor
		int[] arr = {4, 2, 5, 3, 6};
																			//Inicia com zero
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		
		System.out.println("M�ximo: " + max);
	}
}