/*
 * �ۼ���: ������
 * �ۼ���: 2017.10.20.
 * ����: ����ǥ�� ���� ���
 */

package hw7_4;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Postfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw7_4: ������ \n");

		Scanner scan = new Scanner(System.in);

		// ����ǥ�� ������ �Է¹޴´�.
		System.out.print("����ǥ����� �Է�: ");
		String p = scan.nextLine();
		try {
			double result = postfixCalcul(p);
			System.out.printf("��� = %.1f \n", result);
		} catch (Exception e) { // NotEmptyStackException�� EmptyStackException
			System.out.println("�߸��� �����Դϴ�.");
		}

	}

	public static double postfixCalcul(String p) throws NotEmptyStackException {
		Stack<Double> stack = new Stack<Double>();
		String[] pSplit = p.split(" ");

		for (int i = 0; i < pSplit.length; i++) {
			String t = pSplit[i];
			if (t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")) { // �������� ��
				double n2 = stack.pop(); // �ǿ����� 2
				double n1 = stack.pop(); // �ǿ����� 1
				switch (t) { // ����� �ٽ� push
				case "+":
					stack.push(n1 + n2);
					break;
				case "-":
					stack.push(n1 - n2);
					break;
				case "*":
					stack.push(n1 * n2);
					break;
				case "/":
					stack.push(n1 / n2);
					break;
				}
			} else {
				stack.push(Double.parseDouble(t)); // �ǿ������� ��
			}
		}

		double finNum = stack.pop(); // ���� ��� ��
		if (stack.isEmpty()) // �� �迭�� ��
			return finNum;
		else // ���� ������� pop�ص� ��迭�� �ƴ� �� ����� ���� ���� �߻�
			throw new NotEmptyStackException();

	}

}

class NotEmptyStackException extends Exception { // ����� pop�� �ص� ��迭�� �ƴ� ��� ���ܹ߻�
}
