package testing;

import java.util.Iterator;
import java.util.Scanner;

public class MULTIPLICATION_TABLE {
	public static int[][] MULTIPLICATION_TABLE;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		// TODO Auto-generated method stub
		MULTIPLICATION_TABLE = new int[N][N];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				MULTIPLICATION_TABLE[i-1][j-1] = i*j;
				System.out.print(MULTIPLICATION_TABLE[i-1][j-1]);
				System.out.print(" ");
			}
			System.out.println();
		}
		

	}

}
