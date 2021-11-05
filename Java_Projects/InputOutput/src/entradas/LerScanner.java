package entradas;

import java.util.Scanner;

public class LerScanner {
	public static void main(String[] args) 
	{
		Scanner myObj = new Scanner(System.in); //Create a Scanner object.
		
		System.out.println("Enter username: ");
		String userName = myObj.nextLine(); //Read user input
		
		System.out.println("How old are you?");
		int userAge = myObj.nextInt();
		
		System.out.println("What's the year of your birth ?");
		int userYear = myObj.nextInt();
		
		System.out.println("Username is: " + userName); //Output user input
		System.out.println("Age is: " + userAge);
		
		
	}
}