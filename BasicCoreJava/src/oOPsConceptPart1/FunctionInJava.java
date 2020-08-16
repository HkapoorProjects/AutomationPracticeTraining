package oOPsConceptPart1;

public class FunctionInJava {

	public static void main(String[] args) {

		FunctionInJava obj = new FunctionInJava();
		// we are creating object and obj is a ref value
		// here all non static function is available to obj and also accessed by obj ref
		obj.a();
		int sum = obj.b();
		System.out.println("Sum is: " + sum);
		String value = obj.c();
		System.out.println("value is: " + value);
		int division = obj.d(20, 10);
		System.out.println("division is: " + division);

	}

	// Non static Method
	public void a() { // no input.no output
		System.out.println("A Method");
	}

	public int b() { // no input but some output
		System.out.println("B Method");
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;

	}

	public String c() { // no input but some output
		System.out.println("C Method");
		String S = "Harshil";
		return S;

	}

	public int d(int x, int y) {
		System.out.println("D Method");
		int z = x / y;
		return z;

	}

}
