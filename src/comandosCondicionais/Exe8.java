package comandosCondicionais;

import java.util.Scanner;

public class Exe8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		
		if(nota1 > 0.0 && nota1 < 10.0 && nota2 > 0.0 && nota2 < 10.0) {
			
			double media = (nota1 + nota2) / 2;
			
			System.out.printf("A media é: %.1f%n", media);
			
		}else {
			
			System.out.println("Nota invalida");
		}

		sc.close();
	}

}
