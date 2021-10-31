package IBMPractice;

public class SecondLowestNum {
	public static int secLow(int arr[]) {
		int firLow = Integer.MAX_VALUE;
		int secLowe = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (firLow > arr[i]) {
				secLowe = firLow;
				firLow = arr[i];
			} else if (firLow < arr[i] && secLowe > arr[i]) {
				secLowe = arr[i];
			}
		}
		if (secLowe == Integer.MAX_VALUE) {
			System.out.println("no sec Low");
			return 0;
		}
		return secLowe;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 1, 8, 2 };
		System.out.println(secLow(arr));
	}
}
