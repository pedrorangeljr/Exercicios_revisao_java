package variaveisExpressoes;

import java.util.Scanner;

/*Calcula Volume de um cilindro*/
public class Exe10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double altura = sc.nextDouble();
		double raio = sc.nextDouble();
		
		double volumeCilindro = Math.PI * (Math.pow(raio,2) * altura);
		
		System.out.printf("O volume do Cilindro: %.2f%n", volumeCilindro);

		sc.close();
	}

}
