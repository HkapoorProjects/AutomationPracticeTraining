package javaBasics;

public class ArrayConcept {

	public static void main(String[] args) {

		// Array Concept--We can store similar data type values inside the variable.
		// if we print the value which is not present inside the size of array will give
		// u ArrayIndexOutOfBoundsException.
		// Lowest index/value=0
		// Highest index/value='n-1', where n is the size of the array.
		// Disadvantage of Array--1. size is fixed---to overcome--collection
		// array---arraylist,Hashtable--Dynamic Array
		// 2. We can only store the similar data types--to overcome--we use object array

		// 1.Int Array

		int i[] = new int[4];
		i[0] = 0;
		i[1] = 2;
		i[2] = 10;
		i[3] = 15;
		// i[4]=9;
		// i[5]=2;
		System.out.println(i[0]);
		System.out.println(i[3]);
		// System.out.println(i[4]);// will get ArrayIndexOutOfBoundsException

		System.out.println("***********");

		// 2. char array
		char c[] = new char[3];
		c[0] = 'M';
		c[1] = '1';
		c[2] = ' ';
		System.out.println(c[1]);

		System.out.println("***********");

		// 3.Double Array
		double d[] = new double[2];
		d[0] = 99.99;
		d[1] = 10;
		System.out.println(d[1]);
		System.out.println("***********");

		// 4.Boolean Array
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;

		System.out.println(b[0]);
		System.out.println("***********");

		// 5. String Array

		String s[] = new String[3];
		s[0] = "Harshil";
		s[1] = "Future";
		s[2] = "Automation Tester";

		// to get all the values of string--we need to use For loop concept
		// for getting the size of the of the string we need to use length method

		System.out.println(s.length);
		for (int j = 0; j < s.length; j++) {
			System.out.println(s[j]);
		}
		System.out.println("***********");

		// 6. Object Array--object is a super class--it is used to store the different
		// data type values

		
		
		
		Object ob[] = new Object[5];
		ob[0] = "Harshil";
		ob[1] = 19.99;
		ob[2] = 'M';
		ob[3] = "22/11/1995";
		ob[4] = 10;

		System.out.println(ob.length);
		for (int k = 0; k < ob.length; k++) {
			System.out.println(ob[k]);
		}
	}

}
