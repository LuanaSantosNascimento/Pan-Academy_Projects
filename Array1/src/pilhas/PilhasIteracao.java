package pilhas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class PilhasIteracao {

	public static void main(String[] args) {
		
		Stack<Integer> pilhasList = new Stack<>();
		pilhasList.push(68); //Adiciona/injeta um item
		pilhasList.push(118);
		pilhasList.push(90);
		pilhasList.push(720);
		pilhasList.pop();
		
		ArrayList<String> listArray = new ArrayList<>();
		listArray.add("ArrayList 1");
		listArray.add("ArrayList 2");
		
		List<String> listaList= new ArrayList<>();
		listaList.add("Lista 1");
		listaList.add("Lista 2");
		
		//Iterando
		System.out.println("Iterar Pilha");
		Iterator<Integer> iterPilha = pilhasList.iterator();
		while(iterPilha.hasNext()) {
			Integer iterado = iterPilha.next();
			System.out.println(iterado);
		}
		
		System.out.println("-".repeat(15));
		
		System.out.println("Iterar Array");
		Iterator<String> iterArray = listArray.iterator();
		while(iterArray.hasNext()) {
			String iterado = iterArray.next();
			System.out.println(iterado);
		}
		
		System.out.println("-".repeat(15));
		
		System.out.println("Iterar lista");
		Iterator<String> iterList = listaList.iterator();
		while(iterList.hasNext()) {
			String iterado = iterList.next();
			System.out.println(iterado);
		}
	}
	
	/*O iterator pode ler vários tipos de "array's"*/
}