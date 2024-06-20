package variaveisExpressoes;

import java.util.Scanner;

public class exe9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		
		double area = Math.PI * (Math.pow(raio,2));
		
		System.out.printf("Area do Circulo: %.2f%n", area);

		sc.close();
	}

}
