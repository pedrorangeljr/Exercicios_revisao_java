package array;

import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] numeros = new double[10];
		double[] quadrados = new double[10];
		
		System.out.println("Digite 10 números reais:");
		for(int i = 0; i < 10; i++) {
			
			System.out.print("Número " + (i + 1) + ":");
			numeros[i] = sc.nextDouble();
		}
		
		for(int i = 0; i <10; i++) {
			
			quadrados[i] = Math.pow(numeros[i], 2);
		}
		
		System.out.println("\nNúmeros inseridos:");
		for(int i = 0; i < 10; i++) {
			
			System.out.println(numeros[i]);
		}
		
		System.out.println("\nQuadrados dos números:");
		for(int i = 0; i < 10; i++) {
			
			System.out.println(quadrados[i]);
		}
		
		sc.close();

	}

}
