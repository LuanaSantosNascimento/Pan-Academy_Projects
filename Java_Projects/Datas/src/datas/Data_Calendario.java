package datas;

import java.util.Calendar;

public class Data_Calendario {

	public static void main(String[] args) {
		//create a new calendar
		Calendar calendario1 = Calendar.getInstance();
		Calendar calendario2 = (Calendar) Calendar.getInstance();
		Calendar calendario3 = (Calendar) Calendar.getInstance();
		
		//print the current date and time
		System.out.println("Calendário 1 antes " + calendario1.getTime());
		System.out.println("Calendário 2 antes " + calendario2.getTime());
		System.out.println("Calendário 3 antes " + calendario3.getTime());
		System.out.println("-".repeat(48) + "\n");
				
		calendario1.add((Calendar.MONTH),2);
		calendario2.add((Calendar.YEAR),5);
		calendario3.add((Calendar.DAY_OF_MONTH),10);
	
		System.out.println("Calendário 1 depois " + calendario1.getTime());
		System.out.println("Calendário 2 depois " + calendario2.getTime());
		System.out.println("Calendário 3 depois " + calendario3.getTime());
		System.out.println("-".repeat(48)+ "\n");
		
		System.exit(0);
	}
}