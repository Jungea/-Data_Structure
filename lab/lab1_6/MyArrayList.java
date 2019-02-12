package lab1_6;

import java.util.Arrays;

public class MyArrayList {

	private int[] array;  //�迭
	private int number;  //�迭 ���� ����
	
	public MyArrayList() {  //������
		array = new int[10];
		number = 0;
	}
	
	public boolean add(int value) {  //�� �߰�
		if (number>=10)  //���� �ʰ�
			return false;
		else {
			array[number]=value;
			number++;
			return true;
		}
	}

	@Override
	public String toString() {
		String s = "";
		
		for(int i=0; i<number; i++) {
			s+=String.valueOf(array[i]);
			s+=" ";
		}
		
		return s;
	}
	
	
	
}