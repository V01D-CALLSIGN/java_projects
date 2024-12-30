package testing;

import java.util.Scanner;

public class Remove_Duplicate_Strings {
	public static void main(String[] args) {
		// write your code here
		/*
		 * Hello Hello World Java Tasks World
		 */
		System.out.println("How many words are you giving us?");
		Scanner scanner = new Scanner(System.in);
		// String[] array = new String [6];
		int N = scanner.nextInt();
		String[] strings = new String[N];
		System.out.print("Okay, keep writing, we will print the result once you have given us ");
		System.out.print(N);
		System.out.print(" number of words");
		scanner.nextLine();
		/*for (int i = 1; i < N; i++) {
			System.out.println("Next");	
			scanner.nextLine();
		}
		*/
		for (int i = 0; i < N; i++) {
			strings[i] = scanner.nextLine();
		}

		for (int i = 0; i < strings.length; i++) {
			String stringCurrently = strings[i];
			for (int j = 1 + i; j < strings.length; j++) {
				if (stringCurrently == null) {
					break;
				}
				if (stringCurrently.equals(strings[j])) {
					strings[i] = null;
					strings[j] = null;
				}

			}
		}
		for (int i = 0; i < strings.length; i++) {
			if (strings[i] == null) {
				// trolling
			} else {
				System.out.print(strings[i] + ", ");
			}
				
		}

	}
}
