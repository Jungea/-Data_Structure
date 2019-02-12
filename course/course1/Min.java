/*
 * 작성자: 정은애
 * 작성일: 2018.09.04.
 * 내용: 최소값 검색과 교환
 */

package course1;

public class Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("course1: 정은애 \n");
		
		int[] array = new int[10];  // 크기가 10인 배열
		
		for(int i=0; i<array.length; i++) {
			array[i]=((int)(Math.random()*101));  //0~100까지 랜덤
			System.out.print(array[i]+" ");
		}
		
		int min=array[0];  //최소값
		int index=0;  //최소값 인덱스
		
		for(int i=1; i<array.length; i++) {
			if(min>array[i]) {
				min=array[i];
				index=i;
			}
		}
				
		System.out.println("\n\n최소값 = "+min);
		System.out.println("최소값 인덱스 = "+index+"\n");
		
		int temp=array[index];
		array[index]=array[0];
		array[0]=temp;  // 0번과 교환
		
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]+" ");
	}

}
