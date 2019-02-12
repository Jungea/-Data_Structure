/*
 * �ۼ���: ������
 * �ۼ���: 2018.11.10.
 * ����: ���� �ڷᱸ�� ������� ������ ���� ť
 */

package hw8_1;

import java.util.Scanner;

public class MyCircularQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw8_1: ������ \n");

		MyCircularQueue q = new MyCircularQueue(5);
		Scanner scan = new Scanner(System.in);
		int opt;
		int data;

		do {
			System.out.print(" 1:���� 2:���� 3:��ȸ 4:ũ�� 5:��ü���� 6:����  --> ");
			opt = scan.nextInt();

			switch (opt) {
			case 1:
				System.out.println("�������� �Է¹޾� ť�� �� �ڿ� �����մϴ�.");
				System.out.print("������ : ");
				data = scan.nextInt();
				q.enQueue(data);
				break;
			case 2:
				System.out.println("ť�� �� �� ���Ҹ� �����Ͽ� ����մϴ�.");
				data = q.deQueue();
				System.out.println(data);
				break;
			case 3:
				System.out.println("ť�� �� �� ���Ҹ� ��ȸ�Ͽ� ����մϴ�.");
				data = q.peek();
				System.out.println(data);
				break;
			case 4:
				System.out.println("ť�� ����� ���� ���� �˾Ƴ��� ����մϴ�.");
				System.out.println(q.size());
				break;
			case 5:
				System.out.println("ť�� �� �������� ���Ҹ� �ϳ��� �����Ͽ� ��� ����մϴ�.");
				while (!q.isEmpty())
					System.out.print(q.deQueue() + " ");
				System.out.println();
				break;
			case 6:
				System.out.println("�����մϴ�.");
				break;
			default:
				System.out.println("���� �� �����Դϴ�.");

			}

		} while (opt != 6);

	}

}
