package pilhas;

import java.util.Stack;

public class Pilhas1 {
	
	//A pilha é um elemento que pode acoplar vários tipos de dados. "Primeiro a entrar é o último a sair / O último item que você coloca é a primeira coisa a pegar"
	
	public static void main(String[] args)
	{
		Stack<Integer> pilha = new Stack<>();
		
		boolean result = pilha.empty();
		System.out.println("A pilha está vazia ?\n:" + result);
		
		pilha.push(68); //Adiciona/injeta um item
		pilha.push(118);
		pilha.push(90);
		pilha.push(720);
		pilha.pop(); //Remove o último item adicionado, no caso 720
		
		System.out.println("\nElementos do meu stack:\n" + pilha);
		result = pilha.empty();
		System.out.println("\nEstá vazio ?\n:" + result);
	}
}