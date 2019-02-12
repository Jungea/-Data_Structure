package hw7_3;

import java.util.EmptyStackException;

//괄호 검사에 이용될 문자 스택
public class MyCharacterStack {
	private stackNode top = null; // 꼭대기 노드를 가리킬 변수

	private class stackNode { // 스택 노드 구조
		char data;
		stackNode link;

		public stackNode(char data) {
			this.data = data;
			link = null;
		}
	}

	public boolean isEmpty() { // 빈 스택인지
		return (top == null);

	}

	public void push(char data) {
		stackNode t = new stackNode(data);

		t.link = top;
		top = t;
	}

	public char pop() {
		char data;

		if (isEmpty()) { // 빈 스택일 경우 예외 발생
			throw new EmptyStackException();
		} else {
			data = top.data;
			top = top.link;
		}
		return data;
	}

	public char peek() {
		if (isEmpty()) // 빈 스택일 경우 예외 발생
			throw new EmptyStackException();
		return top.data;

	}

}
