package Calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���� �Է��ϼ��� : ");
		int first = sc.nextInt();
		
		System.out.println("���� ��ȣ�� �Է��ϼ���. : ");
		String symbol = sc.next();
		
		System.out.println("�ι�° ���� �Է��ϼ��� : ");
		int second = sc.nextInt();
		
		sc.close();
		
		if (symbol.equals("+")) {
			System.out.println(first + " + " + second + " = " + (first + second));	
		} else if (symbol.equals("-")) {
			System.out.println(first + " - " + second + " = " + (first - second));	
		} else if (symbol.equals("*")) {
			System.out.println(first + " * " + second + " = " + (first * second));	
		} else if (symbol.equals("/")) {
			System.out.println(first + " / " + second + " = " + (first / second));	
		} else {
			System.out.println("��Ģ���� ��ȣ�� �ƴմϴ�.");
		}
		
		
	}
}
