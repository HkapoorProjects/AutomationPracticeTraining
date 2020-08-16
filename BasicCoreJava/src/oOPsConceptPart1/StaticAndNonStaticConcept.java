package oOPsConceptPart1;

public class StaticAndNonStaticConcept {

	// Global variable---Scope of this will be available throughout the function
	// with some condition
	String name = "Harshil Kapoor";

	static int age = 24;

	public static void main(String[] args) {

		// How to call Static method and variable??
		// 1. Direct Calling.
		sendMail();
		// 2. call through class name
		StaticAndNonStaticConcept.sendMail();

		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);

		// How to call non Static method and variable??
		// We have to create and object and call from object
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sum();
		System.out.println(obj.name);
		//System.out.println(obj.age);// Getting warning saying we can use static way too
		//obj.sendMail();// Getting warning saying we can use static way too

	}

	public void sum() {
		System.out.println("Sum Method");
	}

	public static void sendMail() {
		System.out.println("Sending Mail Method");
	}

}
