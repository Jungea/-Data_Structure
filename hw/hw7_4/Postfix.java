/*
 * 작성자: 정은애
 * 작성일: 2017.10.20.
 * 내용: 후위표기 수식 계산
 */

package hw7_4;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Postfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw7_4: 정은애 \n");

		Scanner scan = new Scanner(System.in);

		// 후위표기 수식을 입력받는다.
		System.out.print("후위표기수식 입력: ");
		String p = scan.nextLine();
		try {
			double result = postfixCalcul(p);
			System.out.printf("결과 = %.1f \n", result);
		} catch (Exception e) { // NotEmptyStackException와 EmptyStackException
			System.out.println("잘못된 수식입니다.");
		}

	}

	public static double postfixCalcul(String p) throws NotEmptyStackException {
		Stack<Double> stack = new Stack<Double>();
		String[] pSplit = p.split(" ");

		for (int i = 0; i < pSplit.length; i++) {
			String t = pSplit[i];
			if (t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")) { // 연산자일 때
				double n2 = stack.pop(); // 피연산자 2
				double n1 = stack.pop(); // 피연산자 1
				switch (t) { // 계산후 다시 push
				case "+":
					stack.push(n1 + n2);
					break;
				case "-":
					stack.push(n1 - n2);
					break;
				case "*":
					stack.push(n1 * n2);
					break;
				case "/":
					stack.push(n1 / n2);
					break;
				}
			} else {
				stack.push(Double.parseDouble(t)); // 피연산자일 때
			}
		}

		double finNum = stack.pop(); // 최종 계산 값
		if (stack.isEmpty()) // 빈 배열일 때
			return finNum;
		else // 최종 결과값을 pop해도 빈배열이 아닐 때 사용자 생성 예외 발생
			throw new NotEmptyStackException();

	}

}

class NotEmptyStackException extends Exception { // 결과값 pop을 해도 빈배열이 아닐 경우 예외발생
}
