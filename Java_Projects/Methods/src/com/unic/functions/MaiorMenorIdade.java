package com.unic.functions;

import javax.swing.JOptionPane;

public class MaiorMenorIdade 
{
	public static void main(String[] args) 
	{
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));

		if(idade < 18) {
			//System.out.println("Menor de idade !\n Ano que vem será maior.");
			JOptionPane.showInternalMessageDialog(null, "Menor de idade !\nAno que vem será maior.");
		}
		else {
			System.out.println("Maior de idade!");
			JOptionPane.showInternalMessageDialog(null, "Maior");
		}
		
		System.exit(0);
	}	
}