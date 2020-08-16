package oOPsConceptPart1;

public class Car {

	// creating class
	int mod;
	int wheel;

	public static void main(String[] args) {

		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		System.out.println("Before changing the reference");

		a.mod = 2019;
		a.wheel = 4;
		System.out.println(a.mod);
		System.out.println(a.wheel);

		System.out.println("***********");
		b.mod = 2018;
		b.wheel = 4;
		System.out.println(b.mod);
		System.out.println(b.wheel);
		System.out.println("***********");

		c.mod = 2016;
		c.wheel = 4;
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		System.out.println("After changing the reference");
		
		a=b;
		b=c;
		c=a;
		a.mod=10;
		System.out.println(a.mod);
		a.mod=20;
		System.out.println(a.mod);
		System.out.println(c.mod);
		

	}

}
