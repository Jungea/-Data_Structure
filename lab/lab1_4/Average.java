/*
 * �ۼ���: ������
 * �ۼ���: 2018.09.04.
 * ����: ����� ���ϴ� �޼ҵ� �ۼ�
 */

package lab1_4;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab1_4: ������ \n");

		Scanner scan = new Scanner(System.in);
		System.out.print("������ ���� �Է�: ");
		int n = scan.nextInt();

		int[] numArray = new int[n];
		System.out.print(n + "���� ���� �Է�: ");
		for (int i = 0; i < n; i++)
			numArray[i] = scan.nextInt();

		double avg = getAverage(numArray); // ����� ���ϴ� �޼ҵ� ȣ��
		System.out.println("��� = " + avg);

	}

	// ���� �迭 ������ ����� ���ϴ� �޼ҵ�
	public static double getAverage(int[] numArray) {
		double sum = 0; // �迭�� ��
		for (int i = 0; i < numArray.length; i++)
			sum += numArray[i];

		return sum / numArray.length; // �迭�� ��� ��ȯ

	}

}
