package oOPsConceptPart2;

public class RunClass {

	public static void main(String[] args) {

		// Static Polymorphishm---compile time polymorphism

		BMW b = new BMW();
		b.start();
		b.SafetyTheift();
		b.stop();
		b.Refuel();
		b.engine();
		System.out.println("**********");

		Car c = new Car();
		c.start();
		c.stop();
		c.Refuel();

		// Top Casting
		Car c1 = new BMW();// Child class object can be referred by the parent class reference variable
							// --Dynamic polymorphism--Run time polymorphism
		c1.start();
		c1.stop();
		c1.Refuel();

		// Down Casting
		BMW b1 = (BMW) new Car();//ClassCastException

		
	}

}
