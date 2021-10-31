package IBMPractice;

public class SecondHighestNum {
	public static int secHig(int arr[]) {
		int firHig = Integer.MIN_VALUE;
		int secHigh = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (firHig < arr[i]) {
				secHigh = firHig;
				firHig = arr[i];
			} else if (firHig > arr[i] && secHigh < arr[i]) {
				secHigh = arr[i];
			}
		}
		if (secHigh == Integer.MIN_VALUE) {
			System.out.println("no Second High");
			return 0;
		}
		return secHigh;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 9, 8 };
		System.out.println(secHig(arr));
	}
}
