/*
 * �ۼ���: ������
 * �ۼ���: 2018.09.06.
 * ����: circle Ŭ����
 */

package lab1_5;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab1_5: ������ \n");


		Circle circle1 = new Circle();  //�� ��ü ����
		circle1.setRadius(2);  //������ 2�� ����
		
		Circle circle2 = new Circle((int)(Math.random()*4)+1);  //1~4 ���� ���� ���������� �ϴ� 
		
		System.out.println("circle1 "+circle1.toString());
		System.out.println("circle2 "+circle2.toString());  //���
		
		System.out.println(circle1.equals(circle2));  //equals���
		
		System.out.println(circle1.hashCode());
		System.out.println(circle2.hashCode());  //hashCode ���
		
		System.out.println(circle1.area());
		System.out.println(circle2.area());  //���� ���

	}

}
