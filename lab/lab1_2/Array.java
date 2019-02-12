package lab1_2;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("lab1_2: 정은애 \n");

		int[] array = new int[10];
		Scanner scan = new Scanner(System.in);

		System.out.print("정수값 10개 입력: ");
		for (int i = 0; i < 10; i++)
			array[i] = scan.nextInt();

		System.out.print("검색할 정수값 입력: ");
		int n = scan.nextInt();
		int count=0;
		
		for (int i = 0; i < 10; i++) {
			if (n == array[i]) {
				System.out.printf("인덱스 = %d", i);
				count++;
				break;
			}
		}
		
		if(count==0)
			System.out.println("인덱스 = -1");
	}

}
