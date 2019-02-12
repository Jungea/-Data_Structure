package lab6_2;

public class MyDoublyLinkedList {
	private Node head = null;

	private class Node { // private NodeŬ����
		int data;
		Node rlink;
		Node llink;

		public Node(int data) {
			this.data = data;
			rlink = null;
			llink = null;
		}
	}

	public void addFirst(int data) {
		Node t = new Node(data);
		if (head == null) { // ��尡 ���� ��
			head = t;
		} else {
			t.rlink = head;
			head.llink = t;
			head = t;
		}
	}

	@Override
	public String toString() {
		StringBuffer s = new StringBuffer();
		Node t = head;

		while (t != null) {// t�� ������ ���
			s.append(t.data);
			t = t.rlink;
			if (t != null) {
				s.append(", ");
			}
		}

		return "list = " + s.toString();
	}

	// ����� ��ũ�� ����� �����Ǿ������� Ȯ���ϱ� ���� ����Ʈ�� �պ��ϸ� ����ϴ� �޼ҵ�
	public void printList() {
		if (head == null) { // ��尡 ���� ��
			System.out.println("( )( )");
		} else {
			System.out.print("( ");
			Node t = head;

			while (t.rlink != null) {// t�� ������ ���
				System.out.print(t.data + " ");
				t = t.rlink;
			}
			System.out.print(t.data + " ) ( ");

			while (t != null) {// s�� ������ ���
				System.out.print(t.data + " ");
				t = t.llink;
			}
			System.out.print(")");
		}
	}
}
