package hw11_1;

import java.util.Scanner;

/*
 * �ۼ���: ������
 * �ۼ���: 2018.12.11.
 * ����: merge sort
 */

public class SortTest {
	public static void main(String[] args) {
		System.out.println("hw11_1: ������ \n");
		Scanner scan = new Scanner(System.in);

		System.out.print("���� ���� �Է�: ");
		int n = scan.nextInt();

		System.out.print(n + "���� ���� �Է�: ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = scan.nextInt();

		System.out.print("\n���� �� �迭 = ");
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");

		MyIntegerSort.mergeSort(a);

		System.out.print("\n���� �� �迭 = ");
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");

	}
}
