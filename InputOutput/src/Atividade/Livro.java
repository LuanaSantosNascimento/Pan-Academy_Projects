package Atividade;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Livro  extends Produto{
	
	public void exibirDados() {
		System.out.println("---------Informa��es do Livro---------");
		System.out.println("C�digo: " + getCodigo());
		System.out.println("Descri��o: " + getDescricao());
		NumberFormat formato = new DecimalFormat("R$ ###,##0.00");
		System.out.println("Pre�o: " + formato.format(getPreco()));
	}

}