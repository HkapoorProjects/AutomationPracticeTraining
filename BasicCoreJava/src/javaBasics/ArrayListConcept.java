package javaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		// Array List--COllection of array
		// Here size is not fixed and we can story any data

		ArrayList a1 = new ArrayList();
		a1.add(100);// 0
		a1.add(200);// 1
		a1.add(300);// 2
		System.out.println(a1.size());
		a1.add(500);// 3
		a1.add(800);// 4
		System.out.println(a1.size());
		a1.add("Harshil");// 5
		a1.add('H');// 6
		a1.add(12.34);// 7
		System.out.println(a1.size());
		System.out.println("######################");

		a1.add(34);// 8
		System.out.println(a1.size());
		a1.remove(8);
		System.out.println(a1.size());
		System.out.println("$$$$$$$$$$$$$$$$$$$$");

		// For finding the value at index level
		System.out.println(a1.get(4));
		System.out.println(a1.get(7));
		// System.out.println(a1.get(8));//java.lang.IndexOutOfBoundsException
		System.out.println("******************");

		// For getting the complete value of array list for loop
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}

	}

}
