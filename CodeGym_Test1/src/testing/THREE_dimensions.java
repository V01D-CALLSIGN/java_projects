package testing;

import java.util.Arrays;
import java.lang.Math;

public class THREE_dimensions {
	public static int[] array = new int[5];
	public static int valueStart = 10;
	public static int valueEnd = 13;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (array.length % 2 == 0) {
			Arrays.fill(array, 0, (array.length / 2), valueStart);
			Arrays.fill(array, (array.length / 2), array.length, valueEnd);
		} else {
			Arrays.fill(array, 0, (int) Math.round(array.length / 2)+1, valueStart);
			Arrays.fill(array, (int) Math.round(array.length / 2), array.length, valueEnd);
		}

		System.out.println(Arrays.toString(array));


	}

}
