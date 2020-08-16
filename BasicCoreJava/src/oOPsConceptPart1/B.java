package oOPsConceptPart1;

public class B extends A {

	public B() {
		System.out.println("Child class");
	}
	
	public B(int k) {
		super(k);
	}
	
	public B(int k, int l) {
		super(k,l);
	}

	public static void main(String[] args) {

		B obj = new B();
		B obj1 = new B(50);
		B obj2 = new B(60,70);
		

	}

}
