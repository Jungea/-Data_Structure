/*
 * �ۼ���: ������
 * �ۼ���: 2018.09.04.
 * ����: �ּҰ� �˻��� ��ȯ
 */

package course1;

public class Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("course1: ������ \n");
		
		int[] array = new int[10];  // ũ�Ⱑ 10�� �迭
		
		for(int i=0; i<array.length; i++) {
			array[i]=((int)(Math.random()*101));  //0~100���� ����
			System.out.print(array[i]+" ");
		}
		
		int min=array[0];  //�ּҰ�
		int index=0;  //�ּҰ� �ε���
		
		for(int i=1; i<array.length; i++) {
			if(min>array[i]) {
				min=array[i];
				index=i;
			}
		}
				
		System.out.println("\n\n�ּҰ� = "+min);
		System.out.println("�ּҰ� �ε��� = "+index+"\n");
		
		int temp=array[index];
		array[index]=array[0];
		array[0]=temp;  // 0���� ��ȯ
		
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]+" ");
	}

}
