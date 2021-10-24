public class MainApplication3
{
	public static void main(String[] args) 
	{
		//Criando a string
        String str = "   Hello World !!   ";
  
        //Mostra a string sem nenhuma função
        System.out.println("A string é:");
        System.out.println("#" + str + "#");						//#   Hello World !!   #
        System.out.println("-".repeat(25) + "\n");
  
        //strip() - Remove os espaços em branco iniciais e finais da string.
        System.out.println("Usando o método strip():");
        System.out.println("#" + str.strip() + "#");				//#Hello World !!#
        System.out.println("-".repeat(25) + "\n");
  
        //stripLeading() - Remove os espaços em branco iniciais da string.
        System.out.println("Usando o método stripLeading():");
        System.out.println("#" + str.stripLeading() + "#");			//#Hello World !!   #
        System.out.println("-".repeat(25)  + "\n");
  
        //stripLeading() - Remove os espaços em branco finais da string.
        System.out.println("Usando o método stripTrailing():");
        System.out.println("#" + str.stripTrailing() + "#");		//#   Hello World !!#
	}
}