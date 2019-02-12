package hw7_2;

import java.util.EmptyStackException;

public class MyLinkedStack {
	private stackNode top = null; // 꼭대기 노드를 가리킬 변수

	private class stackNode { // 스택 노드 구조
		int data;
		stackNode link;

		public stackNode(int data) {
			this.data = data;
			link = null;
		}
	}

	public boolean isEmpty() { // 빈 스택인지
		return (top == null);

	}

	public void push(int data) {
		stackNode t = new stackNode(data);

		t.link = top;
		top = t;
	}

	public int pop() {
		int data;

		if (isEmpty()) { // 빈 스택일 경우 예외 발생
			throw new EmptyStackException();
		} else {
			data = top.data;
			top = top.link;
		}
		return data;
	}

	public int peek() {
		if (isEmpty()) // 빈 스택일 경우 예외 발생
			throw new EmptyStackException();
		return top.data;

	}
}
