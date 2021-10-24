package pilhas;

import java.util.Stack;

public class Pilhas1 {
	
	//A pilha � um elemento que pode acoplar v�rios tipos de dados. "Primeiro a entrar � o �ltimo a sair / O �ltimo item que voc� coloca � a primeira coisa a pegar"
	
	public static void main(String[] args)
	{
		Stack<Integer> pilha = new Stack<>();
		
		boolean result = pilha.empty();
		System.out.println("A pilha est� vazia ?\n:" + result);
		
		pilha.push(68); //Adiciona/injeta um item
		pilha.push(118);
		pilha.push(90);
		pilha.push(720);
		pilha.pop(); //Remove o �ltimo item adicionado, no caso 720
		
		System.out.println("\nElementos do meu stack:\n" + pilha);
		result = pilha.empty();
		System.out.println("\nEst� vazio ?\n:" + result);
	}
}