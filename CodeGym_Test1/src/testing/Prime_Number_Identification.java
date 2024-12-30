package testing;

import java.util.Scanner;

public class Prime_Number_Identification {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many prime numbers would you like to find?");
		int myLeftHand = 0;
		int howMany = scanner.nextInt();
		for (int i = 1; i < Integer.MAX_VALUE; i++) {
			boolean isPrime = primeMachine(i);
			if (isPrime) {
				System.out.println(i);
				myLeftHand++;
				if (myLeftHand == howMany)
					break;
			}

		}
		System.out.println("Printed " + myLeftHand + " prime numbers");
	}

	private static boolean primeMachine(int input) {
		int whichNum = input;
		boolean isPrime = true;
		for (int i = 2; i < whichNum; i++) {
			if (whichNum % i == 0) {
				// System.out.println(whichNum + " is not a prime number");
				isPrime = false;
				return false;
				// break;

			}
		}
		if (isPrime) {
			// System.out.println(whichNum + " is a prime number");
			return true;
		}
		return false;
	}

}
