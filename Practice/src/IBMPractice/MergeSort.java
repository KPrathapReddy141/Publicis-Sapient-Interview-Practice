package IBMPractice;

public class MergeSort {
	public static int[] mergeSort(int sort[], int p, int r) {
		if (p < r) {
			int q = (p + r) / 2;
			mergeSort(sort, p, q);
			mergeSort(sort, q + 1, r);
			merge(sort, p, q, r);
		}

		return sort;
	}

	public static void merge(int sort[], int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;
		int lt[] = new int[n1];
		int rt[] = new int[n2];
		for (int i = 0; i < n1; i++) {
			lt[i] = sort[p + i];
		}
		for (int i = 0; i < n2; i++) {
			rt[i] = sort[q + i + 1];
		}
		int l = 0;
		int t = 0;
		int k = p;
		while (l < n1 && t < n2) {
			if (lt[l] <= rt[t]) {
				sort[k] = lt[l];
				l++;
			} else {
				sort[k] = rt[t];
				t++;
			}
			k++;

		}
		while (l < n1) {
			sort[k] = lt[l];
			l++;
			k++;
		}
		while (t < n2) {
			sort[k] = rt[t];
			t++;
			k++;
		}

	}

	public static void main(String[] args) {
		int sort[] = { 3, 2, 5, 1, 7, 9, 4 };
		int p = 0;
		int r = sort.length - 1;
		sort = mergeSort(sort, p, r);
		for (int i : sort) {
			System.out.print(i);
		}
	}
}
