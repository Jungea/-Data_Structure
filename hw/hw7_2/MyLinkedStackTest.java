/*
 * �ۼ���: ������
 * �ۼ���; 2018.10.19.
 * ����: �ܼ����Ḯ��Ʈ�� ���� Ŭ���� ����
 */

package hw7_2;

import java.util.Scanner;

public class MyLinkedStackTest {
	public static void main(String[] args) {
		System.out.println("hw7_2: ������ \n");
		MyLinkedStack stack = new MyLinkedStack();
		Scanner scan = new Scanner(System.in);
		int opt;
		int data;

		do {
			System.out.print(" 1:���� 2:���� 3:��ȸ 4:�հ� 5:����  --> ");
			opt = scan.nextInt();

			switch (opt) {
			case 1:
				System.out.println("�������� �Է¹޾� ���ÿ� �����մϴ�.");
				System.out.print("������ : ");
				data = scan.nextInt();
				stack.push(data);
				break;
			case 2:
				System.out.println("���ÿ��� �����Ͽ� ���ϵ� ���� ����մϴ�.");
				data = stack.pop();
				System.out.println(data);
				break;
			case 3:
				System.out.println("���ÿ��� ��ȸ�Ͽ� ���ϵ� ���� ����մϴ�.");
				data = stack.peek();
				System.out.println(data);
				break;
			case 4:
				System.out.println("������ �� �������� ��� �����Ͽ� ���� ����մϴ�.");
				int sum = 0;
				while (!stack.isEmpty())
					sum += stack.pop();
				System.out.println(sum);
				break;
			case 5:
				System.out.println("�����մϴ�.");
				break;
			default:
				System.out.println("���� �� �����Դϴ�.");

			}

		} while (opt != 5);
	}

}
