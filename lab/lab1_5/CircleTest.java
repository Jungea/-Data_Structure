/*
 * 작성자: 정은애
 * 작성일: 2018.09.06.
 * 내용: circle 클래스
 */

package lab1_5;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab1_5: 정은애 \n");


		Circle circle1 = new Circle();  //원 객체 생성
		circle1.setRadius(2);  //반지름 2로 수정
		
		Circle circle2 = new Circle((int)(Math.random()*4)+1);  //1~4 랜덤 정수 반지름으로 하는 
		
		System.out.println("circle1 "+circle1.toString());
		System.out.println("circle2 "+circle2.toString());  //출력
		
		System.out.println(circle1.equals(circle2));  //equals출력
		
		System.out.println(circle1.hashCode());
		System.out.println(circle2.hashCode());  //hashCode 출력
		
		System.out.println(circle1.area());
		System.out.println(circle2.area());  //면적 출력

	}

}
