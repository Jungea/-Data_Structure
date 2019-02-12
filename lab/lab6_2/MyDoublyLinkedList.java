package lab6_2;

public class MyDoublyLinkedList {
	private Node head = null;

	private class Node { // private Node클래스
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
		if (head == null) { // 노드가 없을 때
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

		while (t != null) {// t가 마지막 노드
			s.append(t.data);
			t = t.rlink;
			if (t != null) {
				s.append(", ");
			}
		}

		return "list = " + s.toString();
	}

	// 양방향 링크가 제대로 구성되었는지를 확인하기 위해 리스트를 왕복하며 출력하는 메소드
	public void printList() {
		if (head == null) { // 노드가 없을 때
			System.out.println("( )( )");
		} else {
			System.out.print("( ");
			Node t = head;

			while (t.rlink != null) {// t가 마지막 노드
				System.out.print(t.data + " ");
				t = t.rlink;
			}
			System.out.print(t.data + " ) ( ");

			while (t != null) {// s가 마지막 노드
				System.out.print(t.data + " ");
				t = t.llink;
			}
			System.out.print(")");
		}
	}
}
