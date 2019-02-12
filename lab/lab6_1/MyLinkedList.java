package lab6_1;

//�ܼ� ���Ḯ��Ʈ�� ��带 ǥ���ϴ� ��� Ŭ����
public class MyLinkedList {
	Node head = null;

	public void addFirst(int data) {
		Node t = new Node(data);  //��� ����
		t.link = head;  //������ ����� link�� head�� ����� �� ����
		head = t;  //head�� ������ ��� ����
	}

	@Override
	public String toString() {
		StringBuffer output = new StringBuffer();
		Node t = head;

		while (t != null) {// t�� ������ ���
			output.append(t.data+" ");
			t=t.link;
		}
		
		return "list = "+output.toString();
	}

	private class Node {
		int data;
		Node link;

		public Node(int data) {
			this.data = data;
			link = null;
		}
	}
}
