package testing;

import java.util.Scanner;

public class Fibonnaci {

	public static void main(String[] args) {
		System.out.println("How many Fibonnaci numbers would you like to print? (Keep it less than 40)");
		Scanner scanner = new Scanner(System.in);
		int howMany = scanner.nextInt();
		int firstNum = 0;
		int secondNum = 1;
		for (int i = 0; i < howMany; i++) {
			System.out.println(firstNum);
			int thirdNum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = thirdNum;

		}
	}

}
