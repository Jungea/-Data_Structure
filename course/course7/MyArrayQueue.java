package course7;

import java.util.NoSuchElementException;

public class MyArrayQueue {
	// (1) private �ν��Ͻ� ���� ����: �迭(array), �迭 ũ��(arraySize), front, rear
	private int[] array;
	int arraySize;
	int front;
	int rear;

	// (2) ������ : ũ�Ⱑ 5�� �迭�� ť�� �����ϵ��� �ν��Ͻ� �������� �ʱ�ȭ
	public MyArrayQueue() {
		arraySize = 5;
		array = new int[arraySize];
		front = 0;
		rear = 0;
	}

	// ť�� ����ִ����� �˻�
	public boolean isEmpty() {
		return rear == front;
	}

	// ť�� ����á������ �˻�
	public boolean isFull() {
		return (rear + 1) % arraySize == front;
	}

	// (3) ť�� data�� ����
	public void enQueue(int data) {
		if (isFull())
			System.out.println("ť�� �������� ���� ����: " + data);
		else {
			rear = (rear + 1) % arraySize;
			array[rear] = data;
		}
	}

	// (4) ť���� ���Ҹ� �ϳ� �����Ͽ� ����
	public int deQueue() {
		if (isEmpty())
			throw new NoSuchElementException();
		else {
			front = (front + 1) % arraySize;
			int data = array[front];
			return data;
		}

	}
}
