package hw7_3;

import java.util.EmptyStackException;

//��ȣ �˻翡 �̿�� ���� ����
public class MyCharacterStack {
	private stackNode top = null; // ����� ��带 ����ų ����

	private class stackNode { // ���� ��� ����
		char data;
		stackNode link;

		public stackNode(char data) {
			this.data = data;
			link = null;
		}
	}

	public boolean isEmpty() { // �� ��������
		return (top == null);

	}

	public void push(char data) {
		stackNode t = new stackNode(data);

		t.link = top;
		top = t;
	}

	public char pop() {
		char data;

		if (isEmpty()) { // �� ������ ��� ���� �߻�
			throw new EmptyStackException();
		} else {
			data = top.data;
			top = top.link;
		}
		return data;
	}

	public char peek() {
		if (isEmpty()) // �� ������ ��� ���� �߻�
			throw new EmptyStackException();
		return top.data;

	}

}
