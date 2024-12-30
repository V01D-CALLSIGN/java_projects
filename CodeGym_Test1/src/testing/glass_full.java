package testing;

import java.util.Iterator;
import java.util.Scanner;

public class glass_full {
	public static void main(String[] args) {
		// write your code here
		Scanner scanner = new Scanner(System.in);
		// String[] array = new String [6];
		String[] strings = new String[6];
		for (int i = 0; i < 6; i++) {
			strings[i] = scanner.nextLine();
		}

		for (int i = 0; i < strings.length; i++) {
			String stringCurrently = strings[i];
			for (int j = 0; j < strings.length; j++) {
				if (stringCurrently == null) {
				break;
				}
				if (stringCurrently[i].equals(strings[j])) {
					stringCurrently[i] == null;
					strings[j] == null;
				}
				
			}
		}
		for (int i = 0; i < strings.length; i++) {
			System.out.print(strings[i] + ", ");
		}
	}
}
