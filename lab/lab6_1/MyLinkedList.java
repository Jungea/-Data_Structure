package lab6_1;

//단순 연결리스트의 노드를 표현하는 노드 클래스
public class MyLinkedList {
	Node head = null;

	public void addFirst(int data) {
		Node t = new Node(data);  //노드 생성
		t.link = head;  //생성한 노드의 link에 head에 연결된 것 연결
		head = t;  //head에 생성한 노드 연결
	}

	@Override
	public String toString() {
		StringBuffer output = new StringBuffer();
		Node t = head;

		while (t != null) {// t가 마지막 노드
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
