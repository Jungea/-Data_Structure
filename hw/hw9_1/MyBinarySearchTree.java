package hw9_1;

import java.util.NoSuchElementException;

public class MyBinarySearchTree {
	// (1) 트리의 노드를 표현하는 private 클래스 Node - 필드(int형 key, leftChild, rightChild),
	// 생성자(key값을 매개변수로 받아 초기화)
	private class Node {
		int key;
		Node leftChild;
		Node rightChild;

		public Node(int key) {
			this.key = key;
		}
	}

	// (2) private 인스턴스 변수 트리의 루트 노드를 가킬 변수(root)를 선언하고 null로 초기화
	Node root = null;

	// 트리에 키값 key를 삽입하는 메소드
	public void insert(int key) {
		root = insertKey(root, key);
	}

	// p를 루트로 하는 트리에 키값 key를 삽입하고, 삽입 후 루트를 리턴하는 메소드(재귀 알고리즘)
	private Node insertKey(Node p, int key) {
		if (p == null) {
			Node newNode = new Node(key);
			return newNode;
		} else if (key < p.key) {
			p.leftChild = insertKey(p.leftChild, key);
			return p; // 루트 불변
		} else if (key > p.key) {
			p.rightChild = insertKey(p.rightChild, key);
			return p; // 루트 불변
		} else { // key = p.key 인 경우 삽입 실패
			System.out.println("삽입 실패. 중복된 키값이 존재합니다: " + key);
			return p; // 루트 불변
		}
	}

	// 트리를 중위순회하며 출력하는 메소드
	public void printInorder() {
		inorder(root);
		System.out.println();
	}

	// (3) p를 루트로 하는 트리를 중위 순회하며 키값을 출력하는 메소드(재귀 알고리즘)
	private void inorder(Node p) {
		if (p != null) {
			inorder(p.leftChild);
			System.out.print(p.key + " ");
			inorder(p.rightChild);
		}

	}

	// (4) 트리의 최대 키값을 리턴하는 메소드(반복 알고리즘) - 공백 트리인 경우 NoSuchElementException 예외 발생
	public int max() {
		if (root == null) {
			throw new NoSuchElementException();
		}
		Node t = root;
		while (t.rightChild != null) // rightChild의 맨 끝이 최대값
			t = t.rightChild;

		return t.key; // 임시로 추가한 문장임
	}

	// 트리가 키값 key를 포함하는지 여부를 리턴하는 메소드
	public boolean contains(int key) {
		return search(root, key);
	}

	// (5) p를 루트로 하는 트리에 키값 key가 존재하는지 여부를 리턴하는 메소드(재귀 알고리즘)
	private boolean search(Node p, int key) {
		if (p == null)
			return false;
		if (p.key == key)
			return true;
		else if (p.key > key)
			return search(p.leftChild, key);
		else
			return search(p.rightChild, key);

	}

	// (6) 트리에 키값 key를 삽입하는 메소드(반복 알고리즘) - 삽입 성공여부(true/false)를 리턴
	public boolean add(int key) {

		Node t = root; // 탐색할 노드
		Node s = null; // 삽입할 곳의 부모노드

		while (t != null) {
			if (t.key == key) // 이미 존재하는 경우 삽입 실패
				return false;
			s = t;
			if (t.key > key)
				t = t.leftChild;
			else if (t.key < key)
				t = t.rightChild;
		}

		Node newNode = new Node(key);
		if (root == null) // 빈 트리일 때
			root = newNode;
		else if (s.key > key)
			s.leftChild = newNode;
		else
			s.rightChild = newNode;

		return true;
	}

	public boolean remove(int key) {
		Node r = null; // 삭제할 노드의 부모 노드
		Node t = root; // 삭제할 노드

		while (t != null) { // 삭제할 노드 탐색
			if (t.key == key) // 해당 노드 찾음
				break;
			r = t;
			if (t.key > key)
				t = t.leftChild;
			else
				t = t.rightChild;
		}

		if (t == null) // 삭제할 노드가 없음.
			return false;

		if (t.leftChild == null && t.rightChild == null) { // t가 단말노드
			if (r == null) // t가 자식없는 루트
				root = null;
			else if (r.leftChild == t) // t가 왼쪽노드
				r.leftChild = null;
			else
				r.rightChild = null;

		} else if (t.leftChild == null || t.rightChild == null) { // t가 자식이 하나
			if (t.leftChild != null) { // 왼쪽자식이 있는 경우
				if (r == null) // t가 루트
					root = t.leftChild;
				else if (r.leftChild == t) // t가 왼쪽노드
					r.leftChild = t.leftChild;
				else
					r.rightChild = t.leftChild;

			} else { // 오른쪽자식이 있는 경우
				if (r == null)
					root = t.rightChild;
				else if (r.leftChild == t)
					r.leftChild = t.rightChild;
				else
					r.rightChild = t.rightChild;
			}

		} else { // t의 자식이 둘 (후계자)
			Node subMax = t.leftChild; // 왼쪽 서브 트리의 최대값
			while (subMax.rightChild != null)
				subMax = subMax.rightChild;
			int max = subMax.key;
			remove(subMax.key);
			t.key = max;
		}
		return true;

	}

}