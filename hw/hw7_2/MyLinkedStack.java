package hw7_2;

import java.util.EmptyStackException;

public class MyLinkedStack {
	private stackNode top = null; // ����� ��带 ����ų ����

	private class stackNode { // ���� ��� ����
		int data;
		stackNode link;

		public stackNode(int data) {
			this.data = data;
			link = null;
		}
	}

	public boolean isEmpty() { // �� ��������
		return (top == null);

	}

	public void push(int data) {
		stackNode t = new stackNode(data);

		t.link = top;
		top = t;
	}

	public int pop() {
		int data;

		if (isEmpty()) { // �� ������ ��� ���� �߻�
			throw new EmptyStackException();
		} else {
			data = top.data;
			top = top.link;
		}
		return data;
	}

	public int peek() {
		if (isEmpty()) // �� ������ ��� ���� �߻�
			throw new EmptyStackException();
		return top.data;

	}
}
