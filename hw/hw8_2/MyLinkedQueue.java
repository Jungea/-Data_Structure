package hw8_2;

import java.util.NoSuchElementException;

public class MyLinkedQueue {
	private int number; // 큐에 저장된 원소 수
	private Node front;
	private Node rear;

	class Node { // 노드 클래스
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

	public void enQueue(int item) { // 맨 뒤 삽입
		Node t = new Node(item);
		if (isEmpty()) { // 빈 큐일때
			front = t;
			rear = t;
		} else {
			rear.link = t;
			rear = t;
		}
		number++;

		System.out.println(item + " 삽입");
	}

	public int deQueue() { // 맨 앞 삭제
		if (isEmpty())
			throw new NoSuchElementException();
		else {
			int data = front.data;
			front = front.link;
			number--;
			if (isEmpty()) // 노드가 1였을 때
				rear = null;

			return data;
		}
	}

	public int peek() { // 맨 앞 출력
		if (isEmpty())
			throw new NoSuchElementException();
		else
			return front.data;
	}

	public int size() { // 크기
		return number;
	}
}
