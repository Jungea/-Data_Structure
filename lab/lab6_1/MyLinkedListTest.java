/*
 * 작성자: 정은애
 * 작성일: 2018.09.27.
 * 내용: 정수 리스트를 관리하는 MyLinkedList 클래스
 */

package lab6_1;

public class MyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab6_1: 정은애 \n");

		// (1) MyLinkedList 객체를 생성(list라고 하자)
		MyLinkedList list = new MyLinkedList();

		System.out.println(list); // (2) list를 출력

		list.addFirst(2); // (3) list에 2를 맨앞삽입
		list.addFirst(-3); // (4) list에 -3을 맨앞삽입
		list.addFirst(0); // (5) list에 0을 맨앞삽입

		System.out.println(list); // (6) list를 출력
	}

}
