package hw6_1;

//단순 연결리스트의 노드를 표현하는 노드 클래스
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
		Node t = new Node(data); // 노드 생성
		t.link = head; // 생성한 노드의 link에 head에 연결된 것 연결
		head = t; // head에 생성한 노드 연결
	}

	@Override
	public String toString() {
		StringBuffer output = new StringBuffer();
		Node t = head;

		while (t != null) {// t가 마지막 노드
			output.append(t.data);
			t = t.link;
			if (t != null) {
				output.append(", ");
			}
		}

		return output.toString();
	}

	public int size() { // 리스트의 길이를 리턴
		Node t = head;
		int num = 0;

		while (t != null) { // t가 마지막 노드
			t = t.link;
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
			while (t.link != null) {
				t = t.link;
			}
			// while문을 나오면 t가 마지막 노드
			t.link = new Node(data);
		}
	}

	// 리스트의 가장 앞 원소(정수값)을 삭제하여 리턴
	public int removeFirst() {
		int data = head.data;
		Node t = head.link;
		head = t;
		return data;
	}

	// 리스트의 마지막 원소(정수값)을 삭제하여 리턴
	public int removeLast() {
		Node t = head;
		Node s = head;
		int data;

		if (t.link == null) { // 노드가 1개인 경우
			data = t.data;
			head = null;
		} else {
			while (t.link != null) { // 노드가 2개 이상인 경우
				s = t;
				t = t.link;
			}
			// t는 마지막 노드 , s는 그 앞 노드
			data = t.data;
			s.link = null;
		}
		return data;
	}
}
