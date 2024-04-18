package comandosCondicionais;

import java.util.Scanner;

public class Exe10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String sexo = sc.next();
		double altura = sc.nextDouble();
		
		switch (sexo) {
		case "masculino":
			
			System.out.printf("%.1f%n", (72.7 * altura) - 59);
			
			break;
		
		case "feminino":
			
			System.out.printf("%.1f%n", (62.1 * altura) - 44.7);
			
			break;

		default:
			
			System.out.println("Sexo invalido");
			
			break;
		}

		sc.close();
	}

}
