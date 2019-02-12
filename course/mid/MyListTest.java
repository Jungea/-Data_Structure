package mid;

//MyList를 이용하는 클래스
public class MyListTest {
	public static void main(String[] args) {
		System.out.println("mid : 정은애 \n");

		// (1) 비어있는 리스트인 MyList 객체를 생성
		MyList list = new MyList();

		// (2) 1부터 100까지 차례대로 리스트의 맨 앞에 삽입(addFirst 호출)
		for (int i = 1; i < 101; i++)
			list.addFirst(i);

		// (3) 리스트의 원소 합을 구하여(getSum 호출) 출력
		System.out.println("합 = " + list.getSum());

	}
}
