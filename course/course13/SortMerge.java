package course13;

import java.util.Arrays;
import java.util.Random;

/*
 * 파일명: SortMerge.java
 * 작성일: 2018.12.11.
 * 작성자: 정은애
 * 설명: 삽입정렬과 병합을 구현하고 이용하는 프로그램
 */

public class SortMerge {

	public static void main(String[] args) {
		System.out.println("course13: 정은애 \n");
		Random generator = new Random();

		// array1, array2를 랜덤 길이(1~10)와 랜덤 원소값(0~99)으로 초기화
		int[] array1 = new int[generator.nextInt(10) + 1];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = generator.nextInt(100);
		}
		int[] array2 = new int[generator.nextInt(10) + 1];
		for (int i = 0; i < array2.length; i++) {
			array2[i] = generator.nextInt(100);
		}

		// array1과 array2를 정렬
		insertionSort(array1); // (2) insertionSort 호출
		insertionSort(array2);
		System.out.println(" 정렬 결과:");
		System.out.println("array1 = " + Arrays.toString(array1));
		System.out.println("array2 = " + Arrays.toString(array2));

		// array1과 array2를 병합한 결과인 array3을 구해 출력
		int[] array3 = mergeArrays(array1, array2); // (1) mergeArrays 호출
		System.out.println(" 두 배열의 병합 결과:");
		System.out.println("array3 = " + Arrays.toString(array3));
	}

	// (1) 정렬된 두 배열을 병합하여 새로운 배열을 얻는 메소드
	private static int[] mergeArrays(int[] array1, int[] array2) {
		int[] a = new int[array1.length + array2.length];

		int i = 0, j = 0, k = 0;

		while (i < array1.length && j < array2.length) {
			if (array1[i] <= array2[j]) // 안전정렬
				a[k] = array1[i++];
			else
				a[k] = array2[j++];
			k++;
		}

		if (i > array1.length - 1) { // array1이 끝나고 array2가 남음.
			for (int t = j; t < array2.length; t++, k++)
				a[k] = array2[t];
		} else { // array2가 끝나고 array1이 남음.
			for (int t = i; t < array1.length; t++, k++)
				a[k] = array1[t];
		}

		return a;
	}

	// (2) 삽입 정렬 알고리즘을 이용하여 배열의 원소들을 오름차순으로 정렬하는 메소드
	private static void insertionSort(int[] array) {
		int j, temp;
		for (int i = 1; i < array.length; i++) { // 1번째 인덱스부터 마지막 인덱스까지
			temp = array[i]; // 해당 값을 저장해 놓고
			j = i; // 해당 인덱스
			while ((j > 0) && (array[j - 1] > temp)) { // 0보다 크면서 전값이 해당 값보다 크면
				array[j] = array[j - 1]; // 자리 교체
				j--; // 그 전값으로
			}
			array[j] = temp; // 맨 앞까지 검사하거나 전값이 해당 값보다 크지 않을 때
		}

	}
}
