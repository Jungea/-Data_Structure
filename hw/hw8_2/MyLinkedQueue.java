package hw8_2;

import java.util.NoSuchElementException;

public class MyLinkedQueue {
	private int number; // ť�� ����� ���� ��
	private Node front;
	private Node rear;

	class Node { // ��� Ŭ����
		int data;
		Node link;

		public Node(int data) {
			this.data = data;
			link = null;
		}
	}

	public MyLinkedQueue() {
		number = 0;
		front = null;
		rear = null;
	}

	public boolean isEmpty() {
		return (number == 0);
	}

	public void enQueue(int item) { // �� �� ����
		Node t = new Node(item);
		if (isEmpty()) { // �� ť�϶�
			front = t;
			rear = t;
		} else {
			rear.link = t;
			rear = t;
		}
		number++;

		System.out.println(item + " ����");
	}

	public int deQueue() { // �� �� ����
		if (isEmpty())
			throw new NoSuchElementException();
		else {
			int data = front.data;
			front = front.link;
			number--;
			if (isEmpty()) // ��尡 1���� ��
				rear = null;

			return data;
		}
	}

	public int peek() { // �� �� ���
		if (isEmpty())
			throw new NoSuchElementException();
		else
			return front.data;
	}

	public int size() { // ũ��
		return number;
	}
}
