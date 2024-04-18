package comandosCondicionais;

import java.util.Scanner;

public class Exe9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double prestacao = sc.nextDouble();
		
		double calculo = (0.2 * salario);
		
		if(prestacao > calculo) {
			
			System.out.println("Emprestimo não concedido");
			
		}else {
			
			System.out.println("Emprestimo Concedido");
		}

		sc.close();
	}

}
