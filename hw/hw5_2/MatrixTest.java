/*
 * 작성자: 정은애
 * 작성일: 2018.09.20.
 * 내용: 행렬곱
 */

package hw5_2;

public class MatrixTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw5_2: 정은애 \n");

		// 행렬 x, y의 곱을 구하여 출력
		int[][] x = { { 4, 4, 4, 4, 4, 4 }, { 4, 4, 4, 4, 4, 4 }, { 4, 4, 4, 4, 4, 4 }, { 4, 4, 4, 4, 4, 4 },
				{ 4, 4, 4, 4, 4, 4 }, { 4, 4, 4, 4, 4, 4 } };

		int[][] y = { { 2, 2, 2, 2, 2, 2 }, { 2, 2, 2, 2, 2, 2 }, { 2, 2, 2, 2, 2, 2 }, { 2, 2, 2, 2, 2, 2 },
				{ 2, 2, 2, 2, 2, 2 }, { 2, 2, 2, 2, 2, 2 } };

		int[][] z = MyMatrixService.multiply(x, y);
		MyMatrixService.print(z);
		System.out.println();

		// 행렬 a, b의 곱을 구하여 출력
		int[][] a = { { 1, 1, 1 }, { 2, 2, 2 }, { 1, 2, 3 }, { 4, 5, 6 } };

		int[][] b = { { 1, 1, 1, 1, -3 }, { 1, 2, 3, 4, 5 }, { -2, 0, 6, 9, 12 } };

		int[][] c = MyMatrixService.multiply(a, b);
		MyMatrixService.print(c);
	}
}

class MyMatrixService {
	// (1) 정적 메소드 multiply를 작성하시오.
	// 이차원 정수 배열로 표현된 두개의 행렬을 매개변수로 받아 곱을 구해 결과를 이차원 정수 배열로 표현하여 리턴
	// 매개변수로 받은 두 행렬은 곱을 구하기에 타당한 크기라고 가정해도 됨
	public static int[][] multiply(int[][] a, int[][] b) {
		int[][] result = new int[a.length][b[0].length];

		int sum;
		for (int i = 0; i < a.length; i++) { // a의 행이동
			for (int j = 0; j < b[0].length; j++) { // b의 열이동
				sum = 0;
				for (int k = 0; k < a[i].length; k++) // a는 열이동, b는 행이동
					sum += a[i][k] * b[k][j];
				result[i][j] = sum;
			}
		}

		return result;
	}

	// (2) 정적 메소드 print를 작성하시오.
	// 이차원 정수 배열로 표현된 하나의 행렬을 매개변수로 받아 한 줄에 한 행씩 출력
	public static void print(int[][] c) {
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++)
				System.out.print(c[i][j] + " ");
			System.out.println();
		}

	}

}
