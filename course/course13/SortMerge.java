package course13;

import java.util.Arrays;
import java.util.Random;

/*
 * ���ϸ�: SortMerge.java
 * �ۼ���: 2018.12.11.
 * �ۼ���: ������
 * ����: �������İ� ������ �����ϰ� �̿��ϴ� ���α׷�
 */

public class SortMerge {

	public static void main(String[] args) {
		System.out.println("course13: ������ \n");
		Random generator = new Random();

		// array1, array2�� ���� ����(1~10)�� ���� ���Ұ�(0~99)���� �ʱ�ȭ
		int[] array1 = new int[generator.nextInt(10) + 1];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = generator.nextInt(100);
		}
		int[] array2 = new int[generator.nextInt(10) + 1];
		for (int i = 0; i < array2.length; i++) {
			array2[i] = generator.nextInt(100);
		}

		// array1�� array2�� ����
		insertionSort(array1); // (2) insertionSort ȣ��
		insertionSort(array2);
		System.out.println(" ���� ���:");
		System.out.println("array1 = " + Arrays.toString(array1));
		System.out.println("array2 = " + Arrays.toString(array2));

		// array1�� array2�� ������ ����� array3�� ���� ���
		int[] array3 = mergeArrays(array1, array2); // (1) mergeArrays ȣ��
		System.out.println(" �� �迭�� ���� ���:");
		System.out.println("array3 = " + Arrays.toString(array3));
	}

	// (1) ���ĵ� �� �迭�� �����Ͽ� ���ο� �迭�� ��� �޼ҵ�
	private static int[] mergeArrays(int[] array1, int[] array2) {
		int[] a = new int[array1.length + array2.length];

		int i = 0, j = 0, k = 0;

		while (i < array1.length && j < array2.length) {
			if (array1[i] <= array2[j]) // ��������
				a[k] = array1[i++];
			else
				a[k] = array2[j++];
			k++;
		}

		if (i > array1.length - 1) { // array1�� ������ array2�� ����.
			for (int t = j; t < array2.length; t++, k++)
				a[k] = array2[t];
		} else { // array2�� ������ array1�� ����.
			for (int t = i; t < array1.length; t++, k++)
				a[k] = array1[t];
		}

		return a;
	}

	// (2) ���� ���� �˰����� �̿��Ͽ� �迭�� ���ҵ��� ������������ �����ϴ� �޼ҵ�
	private static void insertionSort(int[] array) {
		int j, temp;
		for (int i = 1; i < array.length; i++) { // 1��° �ε������� ������ �ε�������
			temp = array[i]; // �ش� ���� ������ ����
			j = i; // �ش� �ε���
			while ((j > 0) && (array[j - 1] > temp)) { // 0���� ũ�鼭 ������ �ش� ������ ũ��
				array[j] = array[j - 1]; // �ڸ� ��ü
				j--; // �� ��������
			}
			array[j] = temp; // �� �ձ��� �˻��ϰų� ������ �ش� ������ ũ�� ���� ��
		}

	}
}
