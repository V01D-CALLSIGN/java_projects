package testing;

/* 
Last digit of a number


*/
// TASK FIND THE FIRST 10 NUMBERS' FACTORIAL using method concept shown in prime number identification 
import java.lang.Math;
import java.util.Iterator;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("How many numbers are you going to give me?");
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] array = new int[N];
		for (int i = 0; i < N; i++) {
			System.out.println("Insert the next number");
			array[i] = scanner.nextInt();

		}
		/*
		 * for (int i = 0; i < array.length; i++) { System.out.println(array[i]); }
		 */
		int min = array[0];

		for (int i = 0; i < N; i++) {
			if (array[i] < min)

				min = array[i];
		}
		System.out.println("The Minimum is:");
		System.out.println(min);

		int max = array[0];

		for (int i = 0; i < N; i++) {
			if (max < array[i])

				max = array[i];
		}
		System.out.println("The Max is:");
		System.out.println(max);

		/*
		 * array = new int[N]; for (int i = 0; i < N; i++) { array[i] =
		 * scanner.nextInt(); System.out.println(array[i]); }
		 */
	}
}
