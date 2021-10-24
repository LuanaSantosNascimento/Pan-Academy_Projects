package com;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linked {
	public static void main(String[] args) {

		//ArrayList<String> cars = new ArrayList<String>();
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("EcoSport");
		cars.add("Mercedes");
		cars.add("Fox");
		cars.add("Gol");
		
		System.out.println(cars.contains("Gol"));
		cars.addFirst("Palio");
		cars.addLast("Mazda");
		cars.add("ônibus");
		//cars.removeLast();
		System.out.println(cars.get(0));
		System.out.println(cars.getLast());
		cars.clear();
		System.out.println(cars);

		LinkedList<String> list = new LinkedList<String>();
		list.add("Geeks");
		list.add("For");
		//Checa se contém "Geeks" na list
		System.out.println("Does the List contains 'Geeks': " + list.contains("Geeks"));
	}
}