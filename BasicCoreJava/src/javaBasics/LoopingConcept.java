package javaBasics;

public class LoopingConcept {

	public static void main(String[] args) {

		// While Loop
		// Disadvantage:- if we forgot to write increment/Decrement part inside the
		// body, loop will run till infinite
		int i = 1; // Initializing
		while (i <= 10) { // Condition
			System.out.println(i);
			i++; // Incremental/Decremental
		}

		System.out.println("******************");

		int j = 10;
		while (j >= 0) {
			System.out.println(j);
			j--;
		}

		System.out.println("*******************");

		// 2. For Loop

		for (int k = 1; k < 10; k++) { //initialization;condition;inc/dec
			System.out.println(k);
		}
	}

}
