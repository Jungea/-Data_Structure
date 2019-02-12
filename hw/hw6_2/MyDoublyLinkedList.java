package hw6_2;

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
		StringBuffer output = new StringBuffer();
		Node t = head;

		while (t != null) {// t가 마지막 노드
			output.append(t.data);
			t = t.rlink;
			if (t != null) {
				output.append(", ");
			}
		}

		return "list = " + output.toString();
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
			System.out.println(")");
		}
	}

	public int size() { // 리스트의 길이를 리턴
		Node t = head;
		int num = 0;

		while (t != null) { // t가 마지막 노드
			t = t.rlink;
			num++;
		}

		return num;
	}

	// 정수값을 매개변수로 받아 리스트의 마지막에 삽입
	public void addLast(int data) {
		Node t = head;

		if (t == null) // 노드가 0개인 경우
			head = new Node(data);
		else { // 노드가 1개 이상인 경우
			while (t.rlink != null) {
				t = t.rlink;
			}
			// while문을 나오면 t가 마지막 노드
			t.rlink = new Node(data);
			t.rlink.llink = t;
		}
	}

	// 리스트의 가장 앞 원소(정수값)을 삭제하여 리턴
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

	// 리스트의 마지막 원소(정수값)을 삭제하여 리턴
	public int removeLast() {
		Node t = head;
		int data;

		if (t.rlink == null) { // 노드가 1개인 경우
			data = t.data;
			head = null;
		} else {
			while (t.rlink != null) { // 노드가 2개 이상인 경우
				t = t.rlink;
			}
			// t는 마지막 노드
			data = t.data;
			t.llink.rlink = null;
		}
		return data;
	}

	public boolean remove(int data) {
		int check = 0; // 이중 연결리스트 안에 해당 정수값 카운트
		Node t = head;

		while (t != null) {
			if (t.data == data) {
				check++;
				break;
			}
			t = t.rlink;
		}

		if (check == 1) { // 이중 연결리스트 안에 존재
			if (t.llink == null) { // 맨 앞 노드
				head = t.rlink;
				if (t.rlink != null) // 노드 2개이상
					t.rlink.llink = null;
			} else {
				t.llink.rlink = t.rlink;
				if (t.rlink != null) // 맨뒤 노드
					t.rlink.llink = t.llink;
			}
			return true;
		} else
			return false;

	}
}
