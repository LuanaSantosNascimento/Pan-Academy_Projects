package Atividade;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Livro  extends Produto{
	
	public void exibirDados() {
		System.out.println("---------Informações do Livro---------");
		System.out.println("Código: " + getCodigo());
		System.out.println("Descrição: " + getDescricao());
		NumberFormat formato = new DecimalFormat("R$ ###,##0.00");
		System.out.println("Preço: " + formato.format(getPreco()));
	}

}