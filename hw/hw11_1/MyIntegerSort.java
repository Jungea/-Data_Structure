package hw11_1;

public class MyIntegerSort {

	public static void mergeSort(int[] a) {
		mergeSort(a, 0, a.length - 1);
	}

	public static void mergeSort(int[] a, int lb, int ub) {
		int middle;
		if (lb < ub) { // 원소가 1개라도 있을 때
			middle = (lb + ub) / 2;
			mergeSort(a, lb, middle);
			mergeSort(a, middle + 1, ub);
			merge(a, lb, middle, ub);
		}
	}

	public static void merge(int[] a, int lb, int middle, int ub) {
		int[] sorted = new int[ub - lb + 1]; // 임시 저장할 배열
		int i = lb;
		int j = middle + 1;
		int k = 0;

		while (i <= middle && j <= ub) { // 해당 범위까지
			if (a[i] <= a[j]) // 안전정렬
				sorted[k] = a[i++];
			else
				sorted[k] = a[j++];
			k++;
		}

		if (i > middle) { // lb..middle 이 끝났을 경우
			for (int t = j; t <= ub; t++, k++)
				sorted[k] = a[t];
		} else { // middle+1...ub 가 끝났을 경우
			for (int t = i; t <= middle; t++, k++)
				sorted[k] = a[t];
		}

		for (int l = lb; l <= ub; l++) // 덮어쓰기
			a[l] = sorted[l - lb];
	}
}
