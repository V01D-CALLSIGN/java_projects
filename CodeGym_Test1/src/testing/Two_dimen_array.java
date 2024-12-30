package testing;

import java.util.Scanner;

public class Two_dimen_array {
	public static int[][] multiArray;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int R = Integer.parseInt(scanner.nextLine());
		multiArray = new int[R][];
		for (int i = 0; i < R; i++) {
			int brackets = Integer.parseInt(scanner.nextLine());
			multiArray[i] = new int[brackets];
			
		}

	}

}
