package hw6_2;

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
		StringBuffer output = new StringBuffer();
		Node t = head;

		while (t != null) {// t�� ������ ���
			output.append(t.data);
			t = t.rlink;
			if (t != null) {
				output.append(", ");
			}
		}

		return "list = " + output.toString();
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
			System.out.println(")");
		}
	}

	public int size() { // ����Ʈ�� ���̸� ����
		Node t = head;
		int num = 0;

		while (t != null) { // t�� ������ ���
			t = t.rlink;
			num++;
		}

		return num;
	}

	// �������� �Ű������� �޾� ����Ʈ�� �������� ����
	public void addLast(int data) {
		Node t = head;

		if (t == null) // ��尡 0���� ���
			head = new Node(data);
		else { // ��尡 1�� �̻��� ���
			while (t.rlink != null) {
				t = t.rlink;
			}
			// while���� ������ t�� ������ ���
			t.rlink = new Node(data);
			t.rlink.llink = t;
		}
	}

	// ����Ʈ�� ���� �� ����(������)�� �����Ͽ� ����
	public int removeFirst() {
		int data = head.data;
		if (head.rlink == null)
			head = null;
		else {
			head = head.rlink;
			head.llink = null;
		}
		return data;
	}

	// ����Ʈ�� ������ ����(������)�� �����Ͽ� ����
	public int removeLast() {
		Node t = head;
		int data;

		if (t.rlink == null) { // ��尡 1���� ���
			data = t.data;
			head = null;
		} else {
			while (t.rlink != null) { // ��尡 2�� �̻��� ���
				t = t.rlink;
			}
			// t�� ������ ���
			data = t.data;
			t.llink.rlink = null;
		}
		return data;
	}

	public boolean remove(int data) {
		int check = 0; // ���� ���Ḯ��Ʈ �ȿ� �ش� ������ ī��Ʈ
		Node t = head;

		while (t != null) {
			if (t.data == data) {
				check++;
				break;
			}
			t = t.rlink;
		}

		if (check == 1) { // ���� ���Ḯ��Ʈ �ȿ� ����
			if (t.llink == null) { // �� �� ���
				head = t.rlink;
				if (t.rlink != null) // ��� 2���̻�
					t.rlink.llink = null;
			} else {
				t.llink.rlink = t.rlink;
				if (t.rlink != null) // �ǵ� ���
					t.rlink.llink = t.llink;
			}
			return true;
		} else
			return false;

	}
}
