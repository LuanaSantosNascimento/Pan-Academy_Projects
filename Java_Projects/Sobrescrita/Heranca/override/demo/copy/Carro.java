package com.override.demo.copy;

public class Carro extends Veiculo{
	
	//Paramos de sobrescrever
//	public void iniciar() {
//		System.out.println("Ligando carro.");
//	}
	
	//Se deixar estes dois m�todos, ele escolhe o iniciar
	@Override
	public void iniciarCaminho() {
		System.out.println("Ligando Carro.");
	}
	
	public void frear() {
		System.out.println("Freando carro.");
	}
}
