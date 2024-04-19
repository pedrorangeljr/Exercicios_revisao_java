package comandosCondicionais;

import java.util.Scanner;

public class Exe17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double baseMaior = sc.nextDouble();
		double baseMenor = sc.nextDouble();
		double altura = sc.nextDouble();
		
		if(baseMaior > 0 && baseMenor > 0) {
			
			double A = ((baseMaior + baseMenor) * altura) / 2;
			System.out.printf("Área do Trapézio: %.2f", A);
			
		}else {
			
			System.out.println("Número invalido");
		}

		sc.close();
	}

}
