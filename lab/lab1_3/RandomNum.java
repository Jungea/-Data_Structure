/*
 * 작성자: 정은애
 * 작성일: 2018.09.01.
 * 내용: 랜덤 넘버의 갯수
 */

package lab1_3;

public class RandomNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab1_3: 정은애 \n");
		
		int num;
		int[] numCount = new int[4];
		
		System.out.print("랜덤 넘버 = ");
		for(int i=0; i<10; i++) {
			num = (int)(Math.random()*4);  // 0~3까지 랜덤 수
			System.out.print((num+1)+" ");  // 1~4
			numCount[num]++;
		}
		System.out.println();
		
		for(int i=0; i<4; i++)
			System.out.println((i+1)+"의 갯수 = "+numCount[i]);
	}

}
