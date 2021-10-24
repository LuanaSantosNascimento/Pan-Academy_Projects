package pilhas;

import java.util.HashSet;

public class HashSets 
{	
	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<String>();
		cars.add("Gol");
		cars.add("Fox");
		cars.add("Gol"); //Não pega dados duplicados
		cars.add("BMW");
		cars.add("Eco");
		
		for(String i : cars)
			System.out.println(i);
		
		System.out.println();
		
		for(String i : cars) {
			if(i.contains("Eco"))
				System.out.println(i);
		}
	}
}