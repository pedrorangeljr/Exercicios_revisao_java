package comandosCondicionais;

import java.util.Scanner;

public class Exe14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();
		
		double mp = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2+3+5); // ou 10
		
		if(mp > 0 && mp < 2.9) {
			
			System.out.printf("Reprovado Média: %.2f%n", mp);
			
		}
		else if(mp > 3 && mp < 4.9) {
			
			System.out.printf("Recuperação Média: %.2f%n", mp);
			
		}else {
			
			System.out.printf("Aprovado Média: %.2f%n", mp);
		}

		sc.close();
	}

}
