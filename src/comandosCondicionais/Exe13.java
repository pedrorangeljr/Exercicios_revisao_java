package comandosCondicionais;

import java.util.Scanner;

public class Exe13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();
		
	    double mp = ((nota1 * 1) + (nota2 * 1) + (nota3 * 2)) / 4;
	    
	    if(mp >= 60) {
	    	
	    	System.out.printf("Aprovado media: %.2f%n", mp);
	    	
	    }else {
	    	
	    	System.out.println("Aluno reprovado media menor que 60 pontos");
	    }
		

		sc.close();
	}

}
