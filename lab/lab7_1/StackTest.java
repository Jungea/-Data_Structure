/*
 * 작성자: 정은애
 * 작성일: 2018.10.11.
 * 내용: Stack 클래스 이용
 */

package lab7_1;

import java.util.Scanner;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab7_1: 정은애 \n");

		Stack<Integer> stack = new Stack<Integer>();
		Scanner scan = new Scanner(System.in);
		int opt;
		int data;

		do {
			System.out.print(" 1:삽입 2:삭제 3:조회 4:합계 5:종료  --> ");
			opt = scan.nextInt();

			switch (opt) {
			case 1:
				System.out.println("정수값을 입력받아 스택에 삽입한다.");
				System.out.print("정수값 : ");
				data = scan.nextInt();
				stack.push(data);
				break;
			case 2:
				System.out.println("스택에서 삭제하여 리턴된 값을 출력한다.");
				data = stack.pop();
				System.out.println(data);
				break;
			case 3:
				System.out.println("스택에서 조회하여 리턴된 값을 출력한다.");
				data = stack.peek();
				System.out.println(data);
				break;
			case 4:
				System.out.println("스택이 텅 빌때까지 모두 삭제하여 합을 출력한다.");
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
