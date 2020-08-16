package oOPsConceptPart1;

public class ThisClass {
//Global variable
	int age;
	String name;

	public ThisClass(int age, String name) {

		this.name = name;
		this.age = age;

		System.out.println(name);
		System.out.println(age);

	}

	public static void main(String[] args) {

		ThisClass th1 = new ThisClass(10, "Harsh");

//		System.out.println(th1.age);
//		System.out.println(th1.name);

	}

}
