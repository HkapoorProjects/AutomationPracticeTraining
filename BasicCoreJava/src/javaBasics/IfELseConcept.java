package javaBasics;

public class IfELseConcept {

	public static void main(String[] args) {

		int a = 500;
		int b = 200;
		int c = 900;

		if (a > b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("b is greater than a");
		}

		// comparison operator
		// < > == != <= >=

		// Nested IFElse

		if (a > b & a > c) {
			System.out.println("A is Greatest");
		} else if (b > a & b > c) {
			System.out.println("B is Greatest");
		} else {
			System.out.println("C is Greatest");
		}

	}

}
