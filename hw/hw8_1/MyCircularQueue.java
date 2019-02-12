package hw8_1;

import java.util.NoSuchElementException;

public class MyCircularQueue {

	private int[] arr; // int�� �迭�� ����ų ����
	private int arrSize; // ť�� �뷮(�迭ũ��)
	private int number; // ť�� ����� ���� ��
	private int front;
	private int rear;

	public MyCircularQueue(int arrSize) {
		arr = new int[arrSize];
		this.arrSize = arrSize;
		number = 0;
		front = 0;
		rear = 0;
	}

	public boolean isEmpty() {
		return (number == 0);
	}

	public boolean isFull() {
		return (number == arrSize);
	}

	public void enQueue(int item) { // �� �� ����
		if (isFull())
			System.out.println("ť�� �������� ������ �� �����ϴ�.");
		else {
			rear = (rear + 1) % arrSize;
			arr[rear] = item;
			number++;
			System.out.println(item + " ����");
		}
	}

	public int deQueue() { // �� �� ����
		if (isEmpty())
			throw new NoSuchElementException();
		else {
			front = (front + 1) % arrSize;
			number--;
			return arr[front];
		}
	}

	public int peek() { // �� �� ���
		if (isEmpty())
			throw new NoSuchElementException();
		else {
			return arr[(front + 1) % arrSize];
		}
	}

	public int size() { // ũ��
		return number;
	}
}
