package course11;

/*
 * 파일명: MyTreeMap2.java
 * 작성일: 2018.11.27
 * 작성자: 정은애
 * 설명: String-String 쌍을 저장하는 저장하는 이진탐색트리를 연결자료구조로 구현한 클래스
 */

class MyTreeMap2 {
	// 트리의 노드를 표현하는 private 클래스 Node
	private class Node {
		String key;
		String value;
		Node leftChild = null;
		Node rightChild = null;

		Node(String key, String value) {
			this.key = key;
			this.value = value;
		}
	}

	// private 인스턴스 변수 트리의 루트 노드를 가킬 변수(root)를 선언하고 null로 초기화
	private Node root = null;

	// (1) 위의 get 메소드 대신, 재귀 알고리즘을 이용한 get 메소드를 작성하시오.(위의 get 메소드는 삭제할 것)
	public String get(String key) {
		return reculGet(root, key);
	}

	private String reculGet(Node p, String key) {
		if (p == null)
			return null;
		else if (key.compareTo(p.key) < 0)
			return reculGet(p.leftChild, key);
		else if (key.compareTo(p.key) > 0)
			return reculGet(p.rightChild, key);
		else
			return p.value;
	}

	// (2) (옵션) 위의 두 메소드 put, insertKey 대신, 반복 알고리즘을 이용한 put 메소드를 작성하시오.(위의 put,
	// insertKey 메소드는 삭제할 것)
	public void put(String key, String value) {
		Node p = root; //
		Node r = null; // 해당 키가 없을 경우

		while (p != null) {
			if (key.compareTo(p.key) == 0) { // 이미 존재하는 경우
				p.value = value;
				break;
			}
			r = p;
			if (key.compareTo(p.key) < 0)
				p = p.leftChild;
			else
				p = p.rightChild;

		}
		Node newNode = new Node(key, value);
		if (root == null) // 빈Map
			root = newNode;
		else if (p == null) { // 노드가 존재하지 않을 경우
			if (key.compareTo(r.key) < 0)
				r.leftChild = newNode;
			else
				r.rightChild = newNode;
		}

	}

}