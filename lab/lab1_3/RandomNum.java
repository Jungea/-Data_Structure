/*
 * �ۼ���: ������
 * �ۼ���: 2018.09.01.
 * ����: ���� �ѹ��� ����
 */

package lab1_3;

public class RandomNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab1_3: ������ \n");
		
		int num;
		int[] numCount = new int[4];
		
		System.out.print("���� �ѹ� = ");
		for(int i=0; i<10; i++) {
			num = (int)(Math.random()*4);  // 0~3���� ���� ��
			System.out.print((num+1)+" ");  // 1~4
			numCount[num]++;
		}
		System.out.println();
		
		for(int i=0; i<4; i++)
			System.out.println((i+1)+"�� ���� = "+numCount[i]);
	}

}
