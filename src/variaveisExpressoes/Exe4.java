package variaveisExpressoes;

import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double numeroReal = sc.nextDouble();
		
		System.out.printf("O qudrado Número: %.1f%n", Math.pow(numeroReal, 2));

		sc.close();
	}

}
