package hw11_1;

public class MyIntegerSort {

	public static void mergeSort(int[] a) {
		mergeSort(a, 0, a.length - 1);
	}

	public static void mergeSort(int[] a, int lb, int ub) {
		int middle;
		if (lb < ub) { // ���Ұ� 1���� ���� ��
			middle = (lb + ub) / 2;
			mergeSort(a, lb, middle);
			mergeSort(a, middle + 1, ub);
			merge(a, lb, middle, ub);
		}
	}

	public static void merge(int[] a, int lb, int middle, int ub) {
		int[] sorted = new int[ub - lb + 1]; // �ӽ� ������ �迭
		int i = lb;
		int j = middle + 1;
		int k = 0;

		while (i <= middle && j <= ub) { // �ش� ��������
			if (a[i] <= a[j]) // ��������
				sorted[k] = a[i++];
			else
				sorted[k] = a[j++];
			k++;
		}

		if (i > middle) { // lb..middle �� ������ ���
			for (int t = j; t <= ub; t++, k++)
				sorted[k] = a[t];
		} else { // middle+1...ub �� ������ ���
			for (int t = i; t <= middle; t++, k++)
				sorted[k] = a[t];
		}

		for (int l = lb; l <= ub; l++) // �����
			a[l] = sorted[l - lb];
	}
}
