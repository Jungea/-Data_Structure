/*
 * 작성자: 정은애
 * 작성일: 2018.11.02
 * 내용: 단순연결리스트로 구현한 큐
 */

package hw8_2;

import java.util.Scanner;

public class MyLinkedQueueTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw8_1: 정은애 \n");

		MyLinkedQueue q = new MyLinkedQueue();
		Scanner scan = new Scanner(System.in);
		int opt;
		int data;

		do {
			System.out.print(" 1:삽입 2:삭제 3:조회 4:크기 5:전체삭제 6:종료  --> ");
			opt = scan.nextInt();

			switch (opt) {
			case 1:
				System.out.println("정수값을 입력받아 큐의 맨 뒤에 삽입합니다.");
				System.out.print("정수값 : ");
				data = scan.nextInt();
				q.enQueue(data);
				break;
			case 2:
				System.out.println("큐의 맨 앞 원소를 삭제하여 출력합니다.");
				data = q.deQueue();
				System.out.println(data);
				break;
			case 3:
				System.out.println("큐의 맨 앞 원소를 조회하여 출력합니다.");
				data = q.peek();
				System.out.println(data);
				break;
			case 4:
				System.out.println("큐에 저장된 원소 수를 알아내어 출력합니다.");
				System.out.println(q.size());
				break;
			case 5:
				System.out.println("큐가 텅 빌때까지 원소를 하나씩 삭제하여 모두 출력합니다.");
				while (!q.isEmpty())
					System.out.print(q.deQueue() + " ");
				System.out.println();
				break;
			case 6:
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("범위 외 선택입니다.");

			}

		} while (opt != 6);

	}
}
