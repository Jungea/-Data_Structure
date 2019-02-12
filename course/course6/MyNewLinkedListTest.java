package course6;

//MyNewLinkedList 클래스를 테스트하는 클래스
public class MyNewLinkedListTest {
	public static void main(String[] args) {
		System.out.println("course6: 홍길동");
		MyNewLinkedList list = new MyNewLinkedList();

		System.out.println("list = " + list); // 출력:
		list.addFirst(1);
		System.out.println("list = " + list); // 출력: 1
		list.addFirst(2);
		System.out.println("list = " + list); // 출력: 2 1
		list.addLast(33);
		System.out.println("list = " + list); // 출력: 2 1 33
		list.addLast(44);
		System.out.println("list = " + list); // 출력: 2 1 33 44

// ***** 다음 코드 추가하세요. ************
		MyNewLinkedList list2 = new MyNewLinkedList();
		list2.addLast(55);
		System.out.println("list2 = " + list2); // 출력: 55
		list2.addLast(66);
		System.out.println("list2 = " + list2); // 출력: 55 66

	}
}