/*
 * �ۼ���: ������
 * �ۼ���: 2018.10.04.
 * ����: ���������� ���� ���Ḯ��Ʈ�� ����Ͽ� ���� ����Ʈ�� �����ϴ� MyDoublyLinkedList Ŭ����
 */

package lab6_2;

public class MyDoublyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab6_2: ������ \n");

		// (1) MyDoublyLinkedList ��ü�� ����(list��� ����)
		MyDoublyLinkedList list = new MyDoublyLinkedList();

		System.out.println(list); // (2) list�� ���(toString ȣ��)
		list.addFirst(2); // (3) list�� 2�� �Ǿջ���
		list.addFirst(-3); // (4) list�� -3�� �Ǿջ���
		list.addFirst(0); // (5) list�� 0�� �Ǿջ���
		System.out.println(list); // (6) list�� ���(toString ȣ��)
		System.out.println();

		list.printList(); // (7) list�� �պ��ϸ� ���(printList ȣ��)
	}

}
