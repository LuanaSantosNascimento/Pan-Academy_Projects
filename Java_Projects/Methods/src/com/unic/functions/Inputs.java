package com.unic.functions;

import javax.swing.JOptionPane;

public class Inputs 
{
	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("What's your name ?");
		int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you ?"));
		double weight = Double.parseDouble(JOptionPane.showInputDialog("How much do you weight ? (Kg)"));

		/* Formas de mostrar as informações passadas ´pelo usuário
		 * 
			 	JOptionPane.showInternalMessageDialog(null,"Name: "+ name +"\nAge: "+ age +"\nWeight: "+ weight);

				System.out.println("Name: "+ name);
				System.out.println("Age: "+ age);
				System.out.println("Weight: "+ weight);
		 */

		int a = JOptionPane.showConfirmDialog(null,"Name: "+ name +
				"\nAge: "+ age + " years" +
				"\nWeight: "+ weight+ "Kg\n" +
				"-".repeat(15) +
				"\n Is this information correct?",
				"Confirmation", JOptionPane.YES_NO_OPTION);
		
		switch(a){     
		case 0:     
			JOptionPane.showInternalMessageDialog(null, "Thank you for the informations !\n Have a great day !",
					"Thanks", JOptionPane.PLAIN_MESSAGE);     
			break;
		case 1:     
			JOptionPane.showInternalMessageDialog(null, "We're sorry for this. Restart the program and fill in the fields again.", "Sorry", JOptionPane.INFORMATION_MESSAGE);
			break;   
		default:      
			break;
		}
		
		System.exit(0);
	}
}