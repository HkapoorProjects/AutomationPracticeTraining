package javaBasics;

public class TwoDimArray {

	public static void main(String[] args) {

		String H[][] = new String[3][5];
		// for getting the lenght of row and column of the mattrix
		System.out.println(H.length);
		System.out.println(H[0].length);
		System.out.println("***************");

		// 1st Row

		H[0][0] = "H";
		H[0][1] = "A";
		H[0][2] = "R";
		H[0][3] = "S";
		H[0][4] = "H";

		// 2nd Row

		H[1][0] = "H1";
		H[1][1] = "A1";
		H[1][2] = "R1";
		H[1][3] = "S1";
		H[1][4] = "H1";

		// 3rd Row

		H[2][0] = "H2";
		H[2][1] = "A2";
		H[2][2] = "R2";
		H[2][3] = "S2";
		H[2][4] = "H2";

		System.out.println(H[2][4]);
		System.out.println(H[1][0]);
		System.out.println(H[0][4]);
		System.out.println("***************");

		// for Getting all the values
		for (int row = 0; row < H.length; row++) {
			for (int col = 0; col < H[0].length; col++) {
				System.out.println(H[row][col]);
			}
		}

	}

}
