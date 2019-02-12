/*
 * 작성자: 정은애
 * 작성일: 2018.10.04.
 * 내용: 이중 연결리스트를 사용하여 정수 리스트를 관리하는 MyDoublyLinkedList 클래스
 */

package hw6_2;

import java.util.Scanner;

public class MyDoublyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw6_2: 정은애 \n");

		// (1) MyLinkedList 객체를 생성(list라고 하자)
		MyDoublyLinkedList list = new MyDoublyLinkedList();
		Scanner scan = new Scanner(System.in);

		int opt; // 메뉴 선택
		int data; // 정수값 입력

		do {
			System.out.print(" 1:전체조회 2:길이조회 3:맨앞삽입 4:맨뒤삽입 5:맨앞삭제 6:맨뒤삭제 7:삭제 8:왕복출력 9:종료 -----> ");
			opt = scan.nextInt();

			switch (opt) {
			case 1:
				System.out.println("list의 전체 내용을 출력합니다.");
				System.out.println(list);
				break;
			case 2:
				System.out.println("list의 길이를 출력합니다.");
				System.out.println(list.size());
				break;
			case 3:
				System.out.println("정수를 list의 맨 앞에 삽입합니다.");
				System.out.print("정수값 입력: ");
				data = scan.nextInt();
				list.addFirst(data);
				break;
			case 4:
				System.out.println("정수를 list의 맨 뒤에 삽입합니다.");
				System.out.print("정수값 입력: ");
				data = scan.nextInt();
				list.addLast(data);
				break;
			case 5:
				System.out.println("list의 맨 앞의 정수를 삭제합니다.");
				data = list.removeFirst();
				System.out.println(data);
				break;
			case 6:
				System.out.println("list의 맨 뒤의 정수를 삭제합니다.");
				data = list.removeLast();
				System.out.println(data);
				break;
			case 7:
				System.out.println("정수값을 입력받아 list에서 삭제합니다.");
				System.out.print("정수값 입력: ");
				data = scan.nextInt();
				boolean b = list.remove(data);
				System.out.println(b);
				break;
			case 8:
				System.out.println("list 원소들을 순방향, 역방향으로 왕복하며 출력합니다.");
				list.printList();
				break;
			case 9:
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("메뉴 선택 오류: 다시 선택하세요.");
			}
		} while (opt != 9);
	}

}
