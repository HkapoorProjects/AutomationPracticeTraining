package javaBasics;

import java.util.Hashtable;

public class HashTableoncept {

	public static void main(String[] args) {

		// Declaration of hash table
		Hashtable h = new Hashtable();

		h.put("H", "Harshil");
		h.put("K", "Kapoor");
		h.put("Name", "Harshil Kapoor");
		System.out.println(h.size());

		h.put(1, 300);
		h.put(2, 900);
		System.out.println(h.size());

		// Fetching the value with the help of get method

		System.out.println(h.get("H"));
		System.out.println(h.get("K"));
		System.out.println(h.get("Name"));
		System.out.println(h.get(1));
		System.out.println(h.get(2));

		// How to keep restriction on Hashtable
		Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>();
		h1.put(9, 700);
		System.out.println(h1.get(9));
		//h1.put("J", 5);// Reason is we restricted on Integer as key and Integer as value only

	}

}
