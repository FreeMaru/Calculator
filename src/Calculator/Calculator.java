package Calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���� �Է��ϼ��� : ");
		int first = sc.nextInt();
		
		System.out.println("�ι�° ���� �Է��ϼ��� : ");
		int second = sc.nextInt();
		
		sc.close();
		
		System.out.println(first + " + " + second + " = " + (first + second));
		System.out.println(first + " - " + second + " = " + (first - second));
		System.out.println(first + " * " + second + " = " + (first * second));
		System.out.println(first + " / " + second + " = " + (first / second));
		
	}
}
