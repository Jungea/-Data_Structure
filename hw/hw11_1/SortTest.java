package hw11_1;

import java.util.Scanner;

/*
 * 작성자: 정은애
 * 작성일: 2018.12.11.
 * 내용: merge sort
 */

public class SortTest {
	public static void main(String[] args) {
		System.out.println("hw11_1: 정은애 \n");
		Scanner scan = new Scanner(System.in);

		System.out.print("정수 갯수 입력: ");
		int n = scan.nextInt();

		System.out.print(n + "개의 정수 입력: ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = scan.nextInt();

		System.out.print("\n정렬 전 배열 = ");
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");

		MyIntegerSort.mergeSort(a);

		System.out.print("\n정렬 후 배열 = ");
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");

	}
}
