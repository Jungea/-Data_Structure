package hw5_1;

public class MyArrayList {

	private int[] array; // �迭
	private int number; // �迭�� ����� �׸��
	private int maxSize; // �迭�� ũ��

	public MyArrayList() { // ������
		maxSize = 10;
		array = new int[maxSize];
		number = 0;
	}

	public boolean add(int value) { // ���� ���� �޼ҵ�
		if (number >= maxSize) { // �ɼ�2 ���� �ʰ��� 2��� ũ�� Ȯ��
			maxSize *= 2;
			int[] a = new int[maxSize];

			for (int i = 0; i < number; i++)
				a[i] = array[i];
			array = a;
		}

		array[number] = value;
		number++;
		return true;
	}

	public int get(int index) { // �ε����� �ش��ϴ� ������ ����
		if (index >= number)
			throw new IndexOutOfBoundsException(); // �ɼ�1
		
		return array[index];
	}

	public int size() { // ����Ʈ ����
		return number;
	}

	public void add(int index, int value) { // �ش� �ε����� ���Ұ� ����
		if (number >= maxSize) { // �ɼ�2. ���� �ʰ��� 2��� ũ�� Ȯ��
			maxSize *= 2;
			int[] a = new int[maxSize];

			for (int i = 0; i < index; i++) // �迭 ����
				a[i] = array[i];
			array = a; // �ű��
		} else if (index > number)
			throw new IndexOutOfBoundsException(); // �ɼ�1

		for (int i = number; i > index; i--) // �� �߰��� ���� �ڿ������� �ڷ� ��ĭ�� �̵�
			array[i] = array[i - 1];
		array[index] = value;
		number++;
	}

	public int remove(int index) { // �ش� �ε��� ������ ����
		if (index >= number)
			throw new IndexOutOfBoundsException(); // �ɼ�1
		else {
			int value = array[index];
			for (int i = index; i < number - 1; i++) // �� ������ �� ������ ��ĭ�� �̵�
				array[i] = array[i + 1];
			number--;
			return value;
		}
	}

	@Override
	public String toString() { // �ɼ�4
		StringBuffer s = new StringBuffer();

		for (int i = 0; i < number; i++) {
			s.append(array[i]);
			if (i != (number - 1))
				s.append(", ");
		}

		return s.toString();
	}

}