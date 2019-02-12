package hw6_1;

//�ܼ� ���Ḯ��Ʈ�� ��带 ǥ���ϴ� ��� Ŭ����
public class MyLinkedList {
	Node head = null;

	private class Node {
		int data;
		Node link;

		public Node(int data) {
			this.data = data;
			link = null;
		}
	}

	public void addFirst(int data) {
		Node t = new Node(data); // ��� ����
		t.link = head; // ������ ����� link�� head�� ����� �� ����
		head = t; // head�� ������ ��� ����
	}

	@Override
	public String toString() {
		StringBuffer output = new StringBuffer();
		Node t = head;

		while (t != null) {// t�� ������ ���
			output.append(t.data);
			t = t.link;
			if (t != null) {
				output.append(", ");
			}
		}

		return output.toString();
	}

	public int size() { // ����Ʈ�� ���̸� ����
		Node t = head;
		int num = 0;

		while (t != null) { // t�� ������ ���
			t = t.link;
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
			while (t.link != null) {
				t = t.link;
			}
			// while���� ������ t�� ������ ���
			t.link = new Node(data);
		}
	}

	// ����Ʈ�� ���� �� ����(������)�� �����Ͽ� ����
	public int removeFirst() {
		int data = head.data;
		Node t = head.link;
		head = t;
		return data;
	}

	// ����Ʈ�� ������ ����(������)�� �����Ͽ� ����
	public int removeLast() {
		Node t = head;
		Node s = head;
		int data;

		if (t.link == null) { // ��尡 1���� ���
			data = t.data;
			head = null;
		} else {
			while (t.link != null) { // ��尡 2�� �̻��� ���
				s = t;
				t = t.link;
			}
			// t�� ������ ��� , s�� �� �� ���
			data = t.data;
			s.link = null;
		}
		return data;
	}
}
