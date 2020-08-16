package oOPsConceptPart1;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "200";
		System.out.println(x + 20);

		// Converting from string to int
		int y = Integer.parseInt(x);
		System.out.println(y + 20);

		// Converting from string to double
		String z = "12.99";
		System.out.println(z + 10);
		double k = Double.parseDouble(z);
		System.out.println(k + 10);

		// Converting from string to boolean

		String b = "True";
		boolean b1 = Boolean.parseBoolean(b);
		System.out.println(b1);

		// converting int to string
		int h = 10;
		System.out.println(h + 10);
		String s1 = String.valueOf(h);
		System.out.println(s1 + 10);

		/*
		 * // Getting exception if i convert from String to int and string value will
		 * be// // alphanumeric//Exception Name---------java.lang.NumberFormatException
		 * String t = "AAAA1"; int t1 = Integer.parseInt(t); System.out.println(t1);
		 */
	}

}
