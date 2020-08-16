package oOPsConceptPart1;

public class CallByValAndCallByRef {

	int p;
	int q;

	public static void main(String[] args) {
		// Call by value and Call by ref program
		// Can we do call by ref in java??---yes we can with the help of obj ref

		CallByValAndCallByRef obj = new CallByValAndCallByRef();

		int x = 10;
		int y = 20;
		int z = obj.test(x, y);// Call by value or pass by value
		System.out.println("Call by value and its value is: " + z);

		obj.p = 60;
		obj.q = 70;

		// Before Swapping
		System.out.println("Values before Swapping");
		System.out.println("Value of p : " + obj.p);
		System.out.println("Value of Q :" + obj.q);
		obj.Swap(obj);

		// After Swapping
		System.out.println("Values After Swapping");
		System.out.println("Value of p : " + obj.p);
		System.out.println("Value of Q :" + obj.q);

	}

	public int test(int a, int b) {
		a = 45;
		b = 56;
		int c = a + b;
		return c;

	}

	// Call by Reference

	public void Swap(CallByValAndCallByRef t) {

		int temp;
		temp = t.p;
		t.p = t.q;
		t.q = temp;
	}

}
