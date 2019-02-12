/*
 * 작성자: 정은애
 * 작성일: 2018.09.11.
 * 내용: 재귀 알고리즘
 */

package course2;

import java.util.Scanner;

public class RecursionTest {

	public static void main(String[] args) {
		System.out.println("course2 : 정은애");

		Scanner input = new Scanner(System.in);
		System.out.print("양의 정수 입력: ");
		int number = input.nextInt();

		System.out.println(sum(number));
		System.out.println(iterativeSum(number));

		System.out.println(factorial(number));
		System.out.println(iterativeFactorial(number));

		f(number);
		System.out.println();

		g(number);
		System.out.println();
	}

	// (1) 반복 알고리즘을 이용하여 1부터 n까지의 합을 구하는 메소드
	private static int iterativeSum(int n) {
		int sum = 0;
		for (int i = 0; i < n + 1; i++)
			sum += i;

		return sum;
	}

	// 재귀 알고리즘을 이용하여 1부터 n까지의 합을 구하는 메소드
	private static int sum(int n) {
		if (n <= 0)
			return 0;
		else
			return n + sum(n - 1);
	}

	// 반복 알고리즘을 이용하여 1부터 n까지의 곱을 구하는 메소드
	private static int iterativeFactorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}

	// (2) 재귀 알고리즘을 이용하여 1부터 n까지의 곱을 구하는 메소드
	private static int factorial(int n) {
		if (n <= 1)
			return n;
		else
			return n * factorial(n - 1);
	}

	// 재귀 알고리즘을 이용하여 n 부터 1까지 출력하는 메소드
	private static void f(int n) {
		if (n > 0) {
			System.out.print(n + " ");
			f(n - 1);
		}
	}

	// (3) 재귀 알고리즘을 이용하여 1 부터 n까지 출력하는 메소드
	private static void g(int n) {
		if (n >0) {
			g(n - 1);
			System.out.print(n + " ");
		}
		
	}
}
