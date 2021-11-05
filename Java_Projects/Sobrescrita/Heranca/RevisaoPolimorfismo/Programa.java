package RevisaoPolimorfismo;

public class Programa {

	public void fazerAnimalComer(Animal animal) {
		animal.comer();
	}
	
	public static void main(String[] args) {

		Programa p = new Programa();
		p.fazerAnimalComer(new Animal());
		p.fazerAnimalComer(new Cao());
		p.fazerAnimalComer(new Leao());
	}

}
