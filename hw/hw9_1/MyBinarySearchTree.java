package hw9_1;

import java.util.NoSuchElementException;

public class MyBinarySearchTree {
	// (1) Ʈ���� ��带 ǥ���ϴ� private Ŭ���� Node - �ʵ�(int�� key, leftChild, rightChild),
	// ������(key���� �Ű������� �޾� �ʱ�ȭ)
	private class Node {
		int key;
		Node leftChild;
		Node rightChild;

		public Node(int key) {
			this.key = key;
		}
	}

	// (2) private �ν��Ͻ� ���� Ʈ���� ��Ʈ ��带 ��ų ����(root)�� �����ϰ� null�� �ʱ�ȭ
	Node root = null;

	// Ʈ���� Ű�� key�� �����ϴ� �޼ҵ�
	public void insert(int key) {
		root = insertKey(root, key);
	}

	// p�� ��Ʈ�� �ϴ� Ʈ���� Ű�� key�� �����ϰ�, ���� �� ��Ʈ�� �����ϴ� �޼ҵ�(��� �˰���)
	private Node insertKey(Node p, int key) {
		if (p == null) {
			Node newNode = new Node(key);
			return newNode;
		} else if (key < p.key) {
			p.leftChild = insertKey(p.leftChild, key);
			return p; // ��Ʈ �Һ�
		} else if (key > p.key) {
			p.rightChild = insertKey(p.rightChild, key);
			return p; // ��Ʈ �Һ�
		} else { // key = p.key �� ��� ���� ����
			System.out.println("���� ����. �ߺ��� Ű���� �����մϴ�: " + key);
			return p; // ��Ʈ �Һ�
		}
	}

	// Ʈ���� ������ȸ�ϸ� ����ϴ� �޼ҵ�
	public void printInorder() {
		inorder(root);
		System.out.println();
	}

	// (3) p�� ��Ʈ�� �ϴ� Ʈ���� ���� ��ȸ�ϸ� Ű���� ����ϴ� �޼ҵ�(��� �˰���)
	private void inorder(Node p) {
		if (p != null) {
			inorder(p.leftChild);
			System.out.print(p.key + " ");
			inorder(p.rightChild);
		}

	}

	// (4) Ʈ���� �ִ� Ű���� �����ϴ� �޼ҵ�(�ݺ� �˰���) - ���� Ʈ���� ��� NoSuchElementException ���� �߻�
	public int max() {
		if (root == null) {
			throw new NoSuchElementException();
		}
		Node t = root;
		while (t.rightChild != null) // rightChild�� �� ���� �ִ밪
			t = t.rightChild;

		return t.key; // �ӽ÷� �߰��� ������
	}

	// Ʈ���� Ű�� key�� �����ϴ��� ���θ� �����ϴ� �޼ҵ�
	public boolean contains(int key) {
		return search(root, key);
	}

	// (5) p�� ��Ʈ�� �ϴ� Ʈ���� Ű�� key�� �����ϴ��� ���θ� �����ϴ� �޼ҵ�(��� �˰���)
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

	// (6) Ʈ���� Ű�� key�� �����ϴ� �޼ҵ�(�ݺ� �˰���) - ���� ��������(true/false)�� ����
	public boolean add(int key) {

		Node t = root; // Ž���� ���
		Node s = null; // ������ ���� �θ���

		while (t != null) {
			if (t.key == key) // �̹� �����ϴ� ��� ���� ����
				return false;
			s = t;
			if (t.key > key)
				t = t.leftChild;
			else if (t.key < key)
				t = t.rightChild;
		}

		Node newNode = new Node(key);
		if (root == null) // �� Ʈ���� ��
			root = newNode;
		else if (s.key > key)
			s.leftChild = newNode;
		else
			s.rightChild = newNode;

		return true;
	}

	public boolean remove(int key) {
		Node r = null; // ������ ����� �θ� ���
		Node t = root; // ������ ���

		while (t != null) { // ������ ��� Ž��
			if (t.key == key) // �ش� ��� ã��
				break;
			r = t;
			if (t.key > key)
				t = t.leftChild;
			else
				t = t.rightChild;
		}

		if (t == null) // ������ ��尡 ����.
			return false;

		if (t.leftChild == null && t.rightChild == null) { // t�� �ܸ����
			if (r == null) // t�� �ڽľ��� ��Ʈ
				root = null;
			else if (r.leftChild == t) // t�� ���ʳ��
				r.leftChild = null;
			else
				r.rightChild = null;

		} else if (t.leftChild == null || t.rightChild == null) { // t�� �ڽ��� �ϳ�
			if (t.leftChild != null) { // �����ڽ��� �ִ� ���
				if (r == null) // t�� ��Ʈ
					root = t.leftChild;
				else if (r.leftChild == t) // t�� ���ʳ��
					r.leftChild = t.leftChild;
				else
					r.rightChild = t.leftChild;

			} else { // �������ڽ��� �ִ� ���
				if (r == null)
					root = t.rightChild;
				else if (r.leftChild == t)
					r.leftChild = t.rightChild;
				else
					r.rightChild = t.rightChild;
			}

		} else { // t�� �ڽ��� �� (�İ���)
			Node subMax = t.leftChild; // ���� ���� Ʈ���� �ִ밪
			while (subMax.rightChild != null)
				subMax = subMax.rightChild;
			int max = subMax.key;
			remove(subMax.key);
			t.key = max;
		}
		return true;

	}

}