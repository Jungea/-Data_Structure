/*
 * �ۼ���: ������
 * �ۼ���: 2018.09.27.
 * ����: ���� ����Ʈ�� �����ϴ� MyLinkedList Ŭ����
 */

package lab6_1;

public class MyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab6_1: ������ \n");

		// (1) MyLinkedList ��ü�� ����(list��� ����)
		MyLinkedList list = new MyLinkedList();

		System.out.println(list); // (2) list�� ���

		list.addFirst(2); // (3) list�� 2�� �Ǿջ���
		list.addFirst(-3); // (4) list�� -3�� �Ǿջ���
		list.addFirst(0); // (5) list�� 0�� �Ǿջ���

		System.out.println(list); // (6) list�� ���
	}

}
