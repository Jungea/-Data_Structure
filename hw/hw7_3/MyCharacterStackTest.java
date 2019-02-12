package hw7_3;

import java.util.EmptyStackException;
import java.util.Scanner;

public class MyCharacterStackTest {
	public static void main(String[] args) {

		System.out.println("hw7_3: 정은애 \n");

		Scanner scan = new Scanner(System.in);

		System.out.print("수식 입력: ");
		String s = scan.nextLine();

		if (checkSymbol(s))
			System.out.println("올바른 괄호 수식입니다.");
		else
			System.out.println("잘못된 괄호 수식입니다.");

	}

	public static boolean checkSymbol(String s) { // 올바른 수식인지 검사하는 메소드
		MyCharacterStack stack = new MyCharacterStack();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i); // s.charAt(i)

			switch (c) {
			case '<':
			case '(': // 여는 괄호는 push
				stack.push(c);
				break;
			case '>':
			case ')': // 닫는 괄호는 pop
				try {
					char pair = (char) stack.pop(); // pop한 리턴값 저장
					if (c == '>' && pair != '<') // 괄호의 종류가 다를때
						return false;
					else if (c == ')' && pair != '(')
						return false;

				} catch (EmptyStackException e) { // 빈 스택일 때 pop을 한 경우
					return false;
				}
				break;
			}

		}
		return (stack.isEmpty()); // 빈 스택이면
	}
}
