package pilhas;

import java.util.*;
import java.util.Set;

public class MostrarHashSet {

	public static void main(String[] args) {
		TreeSet<Integer> tree= new TreeSet<Integer>();
		tree.add(12);
		tree.add(63);
		tree.add(34); //Não pega dados duplicados
		tree.add(45);
		
		Iterator <Integer> iterator = tree.iterator();
		System.out.print("Tree set data: ");
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}
		
		System.out.println();
		
		HashSet<Integer> dset = new HashSet();
		dset.add(2);
		dset.add(12);
		dset.add(63);
		dset.add(34);
		
		Iterator <Integer> iterator1 = dset.iterator();
		System.out.print("HashSet: ");
		
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next() + " ");
		}

	}

}
