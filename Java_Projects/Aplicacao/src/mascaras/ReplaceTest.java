package mascaras;

public class ReplaceTest 
{
	//https://www.alura.com.br/artigos/trocando-caracteres-de-uma-string-no-java
	public static void main(String[] args) 
	{
		String str = "1.500.00";
		String str2 = "1.200,67";
		String b = str2.replaceAll(".",""); //Vai substituir tudo
		String a = str.replace(".","");
		
		System.out.println("Com 'replace': " + a);
		System.out.println("Com 'replaceAll':" + b);
		System.out.println("-".repeat(30) + "\n");

		str = "1.870,00";
		a = str.replaceAll("\\.",""); 	//Não vai substituir tudo, apenas os pontos
		
		str2 = "1.299,67";
		b = str2.replaceAll("\\.","");	//Substitui apenas os pontos
		b = b.replaceAll(",", "");		//Substitui apenas as vírgulas
		
		
		System.out.println("A: " + a);	//1870,00
		System.out.println("B:" + b);	//129967
		System.out.println("-".repeat(30) + "\n");
	}
}