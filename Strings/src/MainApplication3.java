public class MainApplication3
{
	public static void main(String[] args) 
	{
		//Criando a string
        String str = "   Hello World !!   ";
  
        //Mostra a string sem nenhuma fun��o
        System.out.println("A string �:");
        System.out.println("#" + str + "#");						//#   Hello World !!   #
        System.out.println("-".repeat(25) + "\n");
  
        //strip() - Remove os espa�os em branco iniciais e finais da string.
        System.out.println("Usando o m�todo strip():");
        System.out.println("#" + str.strip() + "#");				//#Hello World !!#
        System.out.println("-".repeat(25) + "\n");
  
        //stripLeading() - Remove os espa�os em branco iniciais da string.
        System.out.println("Usando o m�todo stripLeading():");
        System.out.println("#" + str.stripLeading() + "#");			//#Hello World !!   #
        System.out.println("-".repeat(25)  + "\n");
  
        //stripLeading() - Remove os espa�os em branco finais da string.
        System.out.println("Usando o m�todo stripTrailing():");
        System.out.println("#" + str.stripTrailing() + "#");		//#   Hello World !!#
	}
}