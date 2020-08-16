package javaBasics;

public class StringConcatination {

	public static void main(String[] args) {

		int a = 100;
		int b = 200;
		String c = "Hello Harshil";
		String d = "Kapoor";

		System.out.println(a + b);
		System.out.println(c + d);
		System.out.println(a + b + c + d);
		System.out.println(c + d + a + b);
		System.out.println(d + a + c + b + a + d + c);// Kapoor100Hello Harshil200100KapoorHello Harshil

		// Difference between println and print
		// Println--print then cursor will automatically go to next line
		// print--it will simply print the output on the screen

		System.out.println(c+d);
		System.out.print(a);
		System.out.println(b);
		System.out.println("The Value of a is: "+a);
		System.out.println("The Value of b is: "+b);
	}

}
