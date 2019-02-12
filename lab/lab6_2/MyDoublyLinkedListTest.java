/*
 * 작성자: 정은애
 * 작성일: 2018.10.04.
 * 내용: 내부적으로 이중 연결리스트를 사용하여 정수 리스트를 관리하는 MyDoublyLinkedList 클래스
 */

package lab6_2;

public class MyDoublyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab6_2: 정은애 \n");

		// (1) MyDoublyLinkedList 객체를 생성(list라고 하자)
		MyDoublyLinkedList list = new MyDoublyLinkedList();

		System.out.println(list); // (2) list를 출력(toString 호출)
		list.addFirst(2); // (3) list에 2를 맨앞삽입
		list.addFirst(-3); // (4) list에 -3을 맨앞삽입
		list.addFirst(0); // (5) list에 0을 맨앞삽입
		System.out.println(list); // (6) list를 출력(toString 호출)
		System.out.println();

		list.printList(); // (7) list를 왕복하며 출력(printList 호출)
	}

}
