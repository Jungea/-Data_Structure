package hw7_3;

import java.util.EmptyStackException;
import java.util.Scanner;

public class MyCharacterStackTest {
	public static void main(String[] args) {

		System.out.println("hw7_3: ������ \n");

		Scanner scan = new Scanner(System.in);

		System.out.print("���� �Է�: ");
		String s = scan.nextLine();

		if (checkSymbol(s))
			System.out.println("�ùٸ� ��ȣ �����Դϴ�.");
		else
			System.out.println("�߸��� ��ȣ �����Դϴ�.");

	}

	public static boolean checkSymbol(String s) { // �ùٸ� �������� �˻��ϴ� �޼ҵ�
		MyCharacterStack stack = new MyCharacterStack();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i); // s.charAt(i)

			switch (c) {
			case '<':
			case '(': // ���� ��ȣ�� push
				stack.push(c);
				break;
			case '>':
			case ')': // �ݴ� ��ȣ�� pop
				try {
					char pair = (char) stack.pop(); // pop�� ���ϰ� ����
					if (c == '>' && pair != '<') // ��ȣ�� ������ �ٸ���
						return false;
					else if (c == ')' && pair != '(')
						return false;

				} catch (EmptyStackException e) { // �� ������ �� pop�� �� ���
					return false;
				}
				break;
			}

		}
		return (stack.isEmpty()); // �� �����̸�
	}
}
