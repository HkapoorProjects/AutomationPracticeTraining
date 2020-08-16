package javaBasics;

public class IncrementalAndDecrimentalConcept {

	public static void main(String[] args) {

		// ++i------pre Increment
		// i++------Post Increment
		// i-- -----Post Decrement
		// --i------Pre Decrement

		int i = 10;
		int j = ++i;
		System.out.println(i);
		System.out.println(j);

		System.out.println("***************");

		int k = 10;
		int l = k++;
		System.out.println(k);
		System.out.println(l);

		System.out.println("***************");

		int m = 10;
		int n = m--;
		System.out.println(m);
		System.out.println(n);

		System.out.println("***************");

		int o = 10;
		int p = --o;
		System.out.println(o);
		System.out.println(p);

	}

}
