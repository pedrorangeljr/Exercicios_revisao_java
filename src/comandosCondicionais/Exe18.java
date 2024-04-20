package comandosCondicionais;

import java.util.Scanner;

public class Exe18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escolha uma operação +, -, *, / = ");
		String operacao = sc.next();
		
		switch (operacao) {
		case "+":
			
			int numero = sc.nextInt();
			int numero2 = sc.nextInt();
			System.out.printf("A soma: %d%n", numero + numero2);
			break;

		case "-":
			
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			System.out.printf("A Subtração: %d%n", n1 - n2);
			break;
			
		case "*":
			
			int n3 = sc.nextInt();
			int n4 = sc.nextInt();
			System.out.printf("A Multiplicação: %d%n", n3 * n4);
			break;
			
		case "/":
			
			int n5 = sc.nextInt();
			int n6 = sc.nextInt();
			System.out.printf("A Divisão: %d%n", n5 / n6);
			break;
			
		default:
			break;
		}

		sc.close();
	}

}
