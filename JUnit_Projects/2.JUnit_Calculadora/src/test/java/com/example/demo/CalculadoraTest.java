package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSomar() {
		System.out.println("Somar");
		int n1 = 5;
		int n2 = 5;
		Calculadora calculadoraTest = new Calculadora();
		double resultadoEsperado = 10.0;
		double result = calculadoraTest.aumentar(n1, n2);
		assertEquals(resultadoEsperado, result, 0);
	}
	
	@Test
	void testDiminuir() {
		System.out.println("Subtrair");
		int n1 = 5;
		int n2 = 3;
		Calculadora calculadoraTest = new Calculadora();
		double resultadoEsperado = 2;
		double result = calculadoraTest.diminuir(n1, n2);
		assertEquals(resultadoEsperado, result, 0);
	}
	
	@Test
	void testMultiplicar() {
		System.out.println("Multiplicar");
		int n1 = 5;
		int n2 = 3;
		Calculadora calculadoraTest = new Calculadora();
		double resultadoEsperado = 15;
		double result = calculadoraTest.multiplicar(n1, n2);
		assertEquals(resultadoEsperado, result, "Erro Multiplicar");
	}
	
	@Test
	void testDividir() {
		System.out.println("Dividir");
		int n1 = 10;
		int n2 = 2;
		Calculadora calculadoraTest = new Calculadora();
		double resultadoEsperado = 5;
		double result = calculadoraTest.dividir(n1, n2);
		assertEquals(resultadoEsperado, result, 0);
	}
	
	@Test
	void testQuadradoN1() {
		System.out.println("Quadrado de N1");
		int n1 = 10;
		Calculadora calculadoraTest = new Calculadora();
		double resultadoEsperado = 100;
		double result = calculadoraTest.quadradoN1(n1);
		assertEquals(resultadoEsperado, result, 0);
	}

}
