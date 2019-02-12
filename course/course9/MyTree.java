package course9;

//정수 데이터를 저장하기 위해 연결자료구조로 구현한 이진 트리 클래스
import java.util.NoSuchElementException;

public class MyTree {
// 트리 노드 클래스
	private class Node {
		int data;
		Node leftChild;
		Node rightChild;
	}

// 트리의 루트 노드를 가리키는 인스턴스 변수 root
	Node root = null;

// 공백 트리로 초기화 하는 생성자
	public MyTree() {
		root = null;
	}

// 루트 노드의 데이터가 data이고, leftSubtree, rightSubtree를 좌우 서브트리로 하도록 트리를 초기화 하는 생성자
	public MyTree(int data, MyTree leftSubtree, MyTree rightSubtree) {
		root = new Node();
		root.data = data;

		if (leftSubtree == null)
			root.leftChild = null;
		else
			root.leftChild = leftSubtree.root;

		if (rightSubtree == null)
			root.rightChild = null;
		else
			root.rightChild = rightSubtree.root;
	}

// 노드 갯수를 리턴하는 메소드
	public int size() {
		return count(root);
	}

// (1) p를 루트로 하는 트리의 노드 갯수를 리턴하는 메소드 **** 재귀 알고리즘으로 작성할 것
	private int count(Node p) {
		if (p == null)
			return 0;
		else
			return count(p.leftChild) + count(p.rightChild) + 1;

	}

// (2) 가장 하위 오른쪽 자식의 값을 리턴하는 메소드 **** 반복 알고리즘으로 작성할 것
	public int getRight() {
// 공백 트리인 경우 예외 발생
		if (root == null)
			throw new NoSuchElementException();
		else {
			Node t = root;
			while (t.rightChild != null)
				t = t.rightChild;
			return t.data;
		}
	}
}