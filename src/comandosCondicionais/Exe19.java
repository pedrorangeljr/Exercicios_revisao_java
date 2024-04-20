package comandosCondicionais;

import java.util.Scanner;

public class Exe19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
      
		int numero = sc.nextInt(); // Número inteiro
        /*
		// Converte o número em uma string
		String numeroString = Integer.toString(numero);

		// Cria um array para armazenar os dígitos
		int[] arrayDeDigitos = new int[numeroString.length()];

		int soma = 0;
		// Converte cada caractere da string de volta para um número inteiro e armazena
		// no array
		for (int i = 0; i < numeroString.length(); i++) {
			arrayDeDigitos[i] = Character.getNumericValue(numeroString.charAt(i));
		}

		// Exibe o array de dígitos
		System.out.println("Soma do Array:");
		for (int digito : arrayDeDigitos) {

			soma += digito;
			

			sc.close();
		}
		
		System.out.print(soma + " "); */
		
		if(numero % 3 == 0) {
			
			System.out.println("Número divisivel por 3");
			
			 if(numero % 5 == 0) {
				
				System.out.println("Número divisivel por 5");
			}
		}
		
		
		sc.close();
	}
}
