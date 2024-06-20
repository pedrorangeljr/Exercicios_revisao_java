package variaveisExpressoes;

import java.util.Scanner;

public class Exe6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double C = sc.nextDouble();
		
		double F = C * (9.0/5.0) + 32.0;
		
		System.out.printf("A temperatura em Fahrenheit: %.1f%n", F);
		
		sc.close();

	}

}
