package jOptionPane;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Leitura {

	public static void main(String[] args) {
		JOptionPane.showInternalMessageDialog(null, "Calculando Parcelas");
		double valorTotal = Double.parseDouble(JOptionPane.showInputDialog("Qual é o valor do produto?"));
		int numParcelas = Integer.parseInt(JOptionPane.showInputDialog("Em quantas parcelas ?"));
		double valorParcela = valorTotal / numParcelas;
		NumberFormat formato = new DecimalFormat("R$ ###,##0.00");
		JOptionPane.showInternalMessageDialog(null,  "O valor de cada parcela é: " + formato.format(valorParcela));
	}
}