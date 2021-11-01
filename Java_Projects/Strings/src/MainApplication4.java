public class MainApplication4 
{
    public static void main(String[] args) 
    {
    	//isEmpty - Retorna  true se o comprimento da string for igual a 0 -> ""
    	//isBlack - Retorna true se não houver caracteres na string ou se houver apenas espaços em branco-> "" ou "   "
    	
        System.out.println("ABC".isBlank());      //false
        System.out.println("  ".isBlank());       //true
 
        System.out.println("ABC".isEmpty());      //false
        System.out.println("  ".isEmpty());       //false
        
        System.out.println("".isBlank());      //true
        System.out.println("".isEmpty());      //true
    }
}