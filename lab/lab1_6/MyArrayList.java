package lab1_6;

import java.util.Arrays;

public class MyArrayList {

	private int[] array;  //배열
	private int number;  //배열 값의 갯수
	
	public MyArrayList() {  //생성자
		array = new int[10];
		number = 0;
	}
	
	public boolean add(int value) {  //값 추가
		if (number>=10)  //범위 초과
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