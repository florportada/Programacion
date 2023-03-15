package Bucles;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Elemento a imprir: ");
		Scanner scan = new Scanner(System.in);
		int num1 = 0, num2 = 1, elemento = scan.nextInt();
		
		
		System.out.print(num1 + "," + num2);
		
		for(int i = 0; i<=elemento - 2; ++i) {
			int suma = num1 + num2;
			System.out.print("," + suma);
			num1 = num2;
			num2 = suma;
		}
		
	}

}
