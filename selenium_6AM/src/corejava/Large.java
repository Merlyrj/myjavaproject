package corejava;

public class Large {
	public static void main(String[] args) {
		int[] arr = new int[] { 23, 56, 84, 10, 9898, 65468, 12 };

		int max = arr[0];
		int min = arr[0];
		// arr.length: 7
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[i] > max) {
					max = arr[i];

				} else if (arr[j] < min) {
					min = arr[j];
				}
			} // j for loop end
		} // i for loop end
		System.out.println("The largest number in given array: " + max);
		System.out.println("The smallest number in given array:" + min);

	}
}
