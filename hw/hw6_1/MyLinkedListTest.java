/*
 * �ۼ���: ������
 * �ۼ���: 2018.09.28.
 * ����: ���� ����Ʈ�� �����ϴ� MyLinkedList Ŭ����
 */

package hw6_1;

import java.util.Scanner;

public class MyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw6_1: ������ \n");

		// (1) MyLinkedList ��ü�� ����(list��� ����)
		MyLinkedList list = new MyLinkedList();
		Scanner scan = new Scanner(System.in);

		int opt; // �޴� ����
		int data; // ������ �Է�

		do {
			System.out.print(" 1:��ü��ȸ 2:������ȸ 3:�Ǿջ��� 4:�ǵڻ��� 5:�Ǿջ��� 6:�ǵڻ��� 7:���� -----> ");
			opt = scan.nextInt();

			switch (opt) {
			case 1:
				System.out.println("list�� ��ü ������ ����մϴ�.");
				System.out.println("[" + list + "]");
				break;
			case 2:
				System.out.println("list�� ���̸� ����մϴ�.");
				System.out.println(list.size());
				break;
			case 3:
				System.out.println("������ list�� �� �տ� �����մϴ�.");
				System.out.print("������ �Է�: ");
				data = scan.nextInt();
				list.addFirst(data);
				break;
			case 4:
				System.out.println("������ list�� �� �ڿ� �����մϴ�.");
				System.out.print("������ �Է�: ");
				data = scan.nextInt();
				list.addLast(data);
				break;
			case 5:
				System.out.println("list�� �� ���� ������ �����մϴ�.");
				data = list.removeFirst();
				System.out.println(data);
				break;
			case 6:
				System.out.println("list�� �� ���� ������ �����մϴ�.");
				data = list.removeLast();
				System.out.println(data);
				break;
			case 7:
				System.out.println("�����մϴ�.");
				break;
			default:
				System.out.println("�޴� ���� ����: �ٽ� �����ϼ���.");
			}
		} while (opt != 7);
	}

}
