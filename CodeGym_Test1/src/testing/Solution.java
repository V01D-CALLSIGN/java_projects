package testing;

/* 
Last digit of a number


*/
import java.lang.Math;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int w = console.nextInt();
		int x = 1;
		for (int i = w; i > 0; i--) {
			
			x = x * i;

		}
		System.out.println(w + " factorial is: " + x);
	}
}
