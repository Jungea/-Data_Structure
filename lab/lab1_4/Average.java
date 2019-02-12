/*
 * 작성자: 정은애
 * 작성일: 2018.09.04.
 * 내용: 평균을 구하는 메소드 작성
 */

package lab1_4;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab1_4: 정은애 \n");

		Scanner scan = new Scanner(System.in);
		System.out.print("정수의 개수 입력: ");
		int n = scan.nextInt();

		int[] numArray = new int[n];
		System.out.print(n + "개의 정수 입력: ");
		for (int i = 0; i < n; i++)
			numArray[i] = scan.nextInt();

		double avg = getAverage(numArray); // 평균을 구하는 메소드 호출
		System.out.println("평균 = " + avg);

	}

	// 정수 배열 원소의 평균을 구하는 메소드
	public static double getAverage(int[] numArray) {
		double sum = 0; // 배열의 합
		for (int i = 0; i < numArray.length; i++)
			sum += numArray[i];

		return sum / numArray.length; // 배열의 평균 반환

	}

}
