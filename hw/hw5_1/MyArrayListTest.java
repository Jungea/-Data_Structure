/*
 * 작성자: 정은애
 * 작성일: 2018.09.16.
 * 내용: MyArrayList 클래스
 */

package hw5_1;

import java.util.Scanner;

public class MyArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw5_1: 정은애 \n");

		Scanner input = new Scanner(System.in);

		// GenericMyArrayList<Integer> list = new GenericMyArrayList<Integer>();
		MyArrayList list = new MyArrayList(); // MyArrayList 객체 생성

		// (2) 사용자에게 메뉴를 반복 제공하고 7을 입력하면 반복 종료
		int menu = 0;
		int index = 0;
		int element = 0;
		do {
			System.out.print(" 1:인덱스조회 2:전체조회 3:길이조회 4:삽입 5:인덱스삽입 6:인덱스삭제 7:종료 ---> ");
			menu = input.nextInt();

			switch (menu) {
			case 1:
				System.out.println("인덱스 위치의 원소값을 조회합니다.");
				System.out.print("인덱스 입력: ");
				index = input.nextInt();
				element = list.get(index); // 완성하세요.
				System.out.println(element);
				break;
			case 2:
				System.out.println("리스트 전체를 조회합니다.");
				System.out.println("[" + list + "]"); // 완성하세요.
				break;
			case 3:
				System.out.println("리스트 길이를 조회합니다.");
				int size= list.size(); // 완성하세요.
				System.out.println(size);
				break;
			case 4:
				System.out.println("원소를 리스트의 맨 뒤에 삽입합니다.");
				System.out.print("정수값 입력: ");
				element = input.nextInt();
				list.add(element); // 완성하세요.
				break;
			case 5:
				System.out.println("인덱스 위치에 원소를 삽입합니다.");
				System.out.print("인덱스 입력: ");
				index = input.nextInt();
				System.out.print("정수값 입력: ");
				element = input.nextInt();
				list.add(index, element); // 완성하세요.
				break;
			case 6:
				System.out.println("인덱스 위치의 원소를 삭제합니다.");
				System.out.print("인덱스 입력: ");
				index = input.nextInt();
				element = list.remove(index); // 완성하세요.
				System.out.println(element);
				break;
			case 7:
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("메뉴 선택 오류: 다시 선택하세요.");
			}
		} while (menu != 7);

	}

}
