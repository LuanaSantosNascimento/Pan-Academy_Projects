package programa;

import java.util.Stack;

public class ProgramaPilha extends PilhaRepo{
	public static void main(String[] args) {
		Stack<String> pilhinha = new Stack();
		System.out.println("Stack: " + pilhinha);
		
		inserindoPush(pilhinha, "Caixa ac�stica 110");
		inserindoPush(pilhinha, "Caixa ac�stica 210");
		inserindoPush(pilhinha, "Note");
		deletandoPop(pilhinha);
		deletandoPop(pilhinha);
	}

}
