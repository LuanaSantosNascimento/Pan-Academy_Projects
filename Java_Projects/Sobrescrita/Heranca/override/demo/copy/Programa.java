package com.override.demo.copy;

public class Programa {

	public static void main(String[] args) {
		
		Veiculo carro = new Carro();
		carro.iniciar();
//		carro.iniciarCaminho();
		carro.frear();
		
		System.out.println();
		
		Veiculo moto = new Moto();
		moto.iniciar();
		moto.frear();
	}

}
