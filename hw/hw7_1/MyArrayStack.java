package hw7_1;

import java.util.EmptyStackException;

public class MyArrayStack {
	int[] arrStack; // 정수 배열을 가리킬 변수
	int top;
	int arrSize; // 배열 크기

	public MyArrayStack() { // 배열크기를 5로 저장하는 생성자1
		this(5);
	}

	// 배열 크기를 매개변수로 받는 생성자2
	public MyArrayStack(int arrSize) {
		this.arrSize = arrSize;
		arrStack = new int[arrSize];
		top = -1;
	}

	public boolean isEmpty() { // 스택이 비었는지
		return (top == -1);
	}

	public boolean isFull() { // 스택이 가득 찼는지
		return (top == arrSize - 1);
	}

	public void push(int data) {
		if (isFull())
			System.out.println("스택이 가득 찼습니다.");
		else
			arrStack[++top] = data;
	}

	public int pop() {
		if (isEmpty()) // 스택이 비었을 경우 예외 발생
			throw new EmptyStackException();
		else
			return arrStack[top--];
	}

	public int peek() {
		if (isEmpty()) // 스택이 비었을 경우 예외 발생
			throw new EmptyStackException();
		else
			return arrStack[top];
	}
}
