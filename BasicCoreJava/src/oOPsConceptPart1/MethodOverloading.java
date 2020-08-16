package oOPsConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(20.9);
		obj.sum(20, 30);
		obj.main(99);
		obj.main("Harshil Kapoor the best learner");

	}
	// Can we overload main method???--------yes we can

	public static void main(int h) {
		System.out.println("Yes we can overload main method");
		System.out.println(h);
	}

	public static void main(String s) {
		System.out.println("Harshil Kapoor the future automation tester");
		System.out.println(s);
	}

	// we can not write method inside method
	// same method name are not acceptable untill u use with different parameter
	// when we use same method name with different arguments then it is called
	// method overloading.

	public void sum() {
		System.out.println("Sum Method---with zero parameter");
	}

	public void sum(int x) {
		System.out.println("sum method----with single parameter");
		System.out.println(x);
	}

	public void sum(double y) {
		System.out.println("sum method with double argument");
		System.out.println(y);
	}

	public void sum(int z, int k) {
		System.out.println("sum method---with two parameter");
		System.out.println(z + k);
	}

}
