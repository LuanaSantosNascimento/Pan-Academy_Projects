package datas;

import java.util.Calendar;

import javax.swing.JOptionPane;

public class Data_Calendario2 
{
	public static void main(String[] args) 
	{
		//Instanciou
		Calendar calendario1 = Calendar.getInstance();
		int ano = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o ano de nascimento: "));
		int ano_atual = calendario1.get(Calendar.YEAR);
		
		if(ano <= ano_atual) {
			int idade = ano_atual - ano;
			
			//System.out.println("Você tem "+ idade + " anos")
			JOptionPane.showInternalMessageDialog(null, "Você tem "+ idade + " anos", "Idade", JOptionPane.INFORMATION_MESSAGE);
		}
		else
			JOptionPane.showInternalMessageDialog(null, "Ainda estamos em 2021 !", "AVISO", JOptionPane.WARNING_MESSAGE);
		
		System.exit(0);
	}
}