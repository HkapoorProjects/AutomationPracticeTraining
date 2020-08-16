package oOPsConceptPart1;

public class ConstructorConcept {

	public ConstructorConcept() {
		System.out.println("Default constructor");

	}

	public ConstructorConcept(int i) {
		System.out.println("Single parameterised Constructor");
		System.out.println("The value of i :" + i);
	}

	public ConstructorConcept(int k, int l) {
		System.out.println("Double parameterized Constructor");
		System.out.println("The value of k is: " + k + " and l is: " + l + " and the sum is: " + (k + l));
	}

	public static void main(String[] args) {

		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(20, 30);

	}

}
