package hw5_1;

public class GenericMyArrayList<T> {

	private T[] array; // 배열
	private int number; // 배열에 저장된 항목수
	private int maxSize; // 배열의 크기

	public GenericMyArrayList() { // 생성자
		maxSize = 10;
		array = (T[]) new Object[maxSize];
		number = 0;
	}

	public boolean add(T value) { // 원소 삽입 메소드
		if (number >= maxSize) { // 옵션2 범위 초과시 2배로 크기 확장
			maxSize *= 2;
			T[] a = (T[]) new Object[maxSize];

			for (int i = 0; i < number; i++)
				a[i] = array[i];
			array = a;
		}

		array[number] = value;
		number++;
		return true;
	}

	public T get(int index) { // 인덱스에 해당하는 정수값 리턴
		if (index >= number)
			throw new IndexOutOfBoundsException(); // 옵션1
		
		return array[index];
	}

	public int size() { // 리스트 길이
		return number;
	}

	public void add(int index, T value) { // 해당 인덱스의 원소값 삽입
		if (number >= maxSize) { // 옵션2. 범위 초과시 2배로 크기 확장
			maxSize *= 2;
			T[] a = (T[]) new Object[maxSize];

			for (int i = 0; i < index; i++)
				a[i] = array[i];
			array = a;
		} else if (index > number) {
			throw new IndexOutOfBoundsException(); // 옵션1
		}

		for (int i = number; i > index; i--) // 값 추가를 위해 뒤로 한칸씩 이동
			array[i] = array[i - 1];
		array[index] = value;
		number++;
	}

	public T remove(int index) { // 해당 인덱스 정수값 제거
		if (index >= number) {
			throw new IndexOutOfBoundsException(); // 옵션1
		} else {
			T value = array[index];
			for (int i = index; i < number - 1; i++) // 값 제거한 후 앞으로 한칸씩 이동
				array[i] = array[i + 1];
			number--;
			return value;
		}
	}

	@Override
	public String toString() { // 옵션4
		StringBuffer s = new StringBuffer();

		for (int i = 0; i < number; i++) {
			s.append(array[i]);
			if (i != (number - 1))
				s.append(", ");
		}

		return s.toString();
	}

}