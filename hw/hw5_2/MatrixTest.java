/*
 * �ۼ���: ������
 * �ۼ���: 2018.09.20.
 * ����: ��İ�
 */

package hw5_2;

public class MatrixTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw5_2: ������ \n");

		// ��� x, y�� ���� ���Ͽ� ���
		int[][] x = { { 4, 4, 4, 4, 4, 4 }, { 4, 4, 4, 4, 4, 4 }, { 4, 4, 4, 4, 4, 4 }, { 4, 4, 4, 4, 4, 4 },
				{ 4, 4, 4, 4, 4, 4 }, { 4, 4, 4, 4, 4, 4 } };

		int[][] y = { { 2, 2, 2, 2, 2, 2 }, { 2, 2, 2, 2, 2, 2 }, { 2, 2, 2, 2, 2, 2 }, { 2, 2, 2, 2, 2, 2 },
				{ 2, 2, 2, 2, 2, 2 }, { 2, 2, 2, 2, 2, 2 } };

		int[][] z = MyMatrixService.multiply(x, y);
		MyMatrixService.print(z);
		System.out.println();

		// ��� a, b�� ���� ���Ͽ� ���
		int[][] a = { { 1, 1, 1 }, { 2, 2, 2 }, { 1, 2, 3 }, { 4, 5, 6 } };

		int[][] b = { { 1, 1, 1, 1, -3 }, { 1, 2, 3, 4, 5 }, { -2, 0, 6, 9, 12 } };

		int[][] c = MyMatrixService.multiply(a, b);
		MyMatrixService.print(c);
	}
}

class MyMatrixService {
	// (1) ���� �޼ҵ� multiply�� �ۼ��Ͻÿ�.
	// ������ ���� �迭�� ǥ���� �ΰ��� ����� �Ű������� �޾� ���� ���� ����� ������ ���� �迭�� ǥ���Ͽ� ����
	// �Ű������� ���� �� ����� ���� ���ϱ⿡ Ÿ���� ũ���� �����ص� ��
	public static int[][] multiply(int[][] a, int[][] b) {
		int[][] result = new int[a.length][b[0].length];

		int sum;
		for (int i = 0; i < a.length; i++) { // a�� ���̵�
			for (int j = 0; j < b[0].length; j++) { // b�� ���̵�
				sum = 0;
				for (int k = 0; k < a[i].length; k++) // a�� ���̵�, b�� ���̵�
					sum += a[i][k] * b[k][j];
				result[i][j] = sum;
			}
		}

		return result;
	}

	// (2) ���� �޼ҵ� print�� �ۼ��Ͻÿ�.
	// ������ ���� �迭�� ǥ���� �ϳ��� ����� �Ű������� �޾� �� �ٿ� �� �྿ ���
	public static void print(int[][] c) {
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++)
				System.out.print(c[i][j] + " ");
			System.out.println();
		}

	}

}
