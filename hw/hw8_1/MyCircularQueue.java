package hw8_1;

import java.util.NoSuchElementException;

public class MyCircularQueue {

	private int[] arr; // int형 배열을 가리킬 변수
	private int arrSize; // 큐의 용량(배열크기)
	private int number; // 큐에 저장된 원소 수
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

	public void enQueue(int item) { // 맨 뒤 삽입
		if (isFull())
			System.out.println("큐가 가득차서 삽입할 수 없습니다.");
		else {
			rear = (rear + 1) % arrSize;
			arr[rear] = item;
			number++;
			System.out.println(item + " 삽입");
		}
	}

	public int deQueue() { // 맨 앞 삭제
		if (isEmpty())
			throw new NoSuchElementException();
		else {
			front = (front + 1) % arrSize;
			number--;
			return arr[front];
		}
	}

	public int peek() { // 맨 앞 출력
		if (isEmpty())
			throw new NoSuchElementException();
		else {
			return arr[(front + 1) % arrSize];
		}
	}

	public int size() { // 크기
		return number;
	}
}
