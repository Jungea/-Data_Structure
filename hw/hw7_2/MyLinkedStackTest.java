/*
 * 작성자: 정은애
 * 작성일; 2018.10.19.
 * 내용: 단순연결리스트로 스택 클래스 구현
 */

package hw7_2;

import java.util.Scanner;

public class MyLinkedStackTest {
	public static void main(String[] args) {
		System.out.println("hw7_2: 정은애 \n");
		MyLinkedStack stack = new MyLinkedStack();
		Scanner scan = new Scanner(System.in);
		int opt;
		int data;

		do {
			System.out.print(" 1:삽입 2:삭제 3:조회 4:합계 5:종료  --> ");
			opt = scan.nextInt();

			switch (opt) {
			case 1:
				System.out.println("정수값을 입력받아 스택에 삽입합니다.");
				System.out.print("정수값 : ");
				data = scan.nextInt();
				stack.push(data);
				break;
			case 2:
				System.out.println("스택에서 삭제하여 리턴된 값을 출력합니다.");
				data = stack.pop();
				System.out.println(data);
				break;
			case 3:
				System.out.println("스택에서 조회하여 리턴된 값을 출력합니다.");
				data = stack.peek();
				System.out.println(data);
				break;
			case 4:
				System.out.println("스택이 텅 빌때까지 모두 삭제하여 합을 출력합니다.");
				int sum = 0;
				while (!stack.isEmpty())
					sum += stack.pop();
				System.out.println(sum);
				break;
			case 5:
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("범위 외 선택입니다.");

			}

		} while (opt != 5);
	}

}
