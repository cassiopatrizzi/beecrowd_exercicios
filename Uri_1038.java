package uri_exercicios_propostos;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1038 {

	public static void main(String[] args) {

		 /*Escrever um program que leia o código de um item e a quantidade,
		 a seguir, calcule e mostre o valor da conta a pagar.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		
		if (codigo == 1) {
			System.out.printf("Total: R$ %.2f%n", quantidade * 4.0);
		}
		else if (codigo == 2) {
			System.out.printf("Total: R$ %.2f%n", quantidade * 4.5);
		}
		else if (codigo == 3) {
			System.out.printf("Total: R$ %.2f%n", quantidade * 5.0);
		}
		else if (codigo == 4) {
			System.out.printf("Total: R$ %.2f%n", quantidade * 2.0);
		}
		else {
			System.out.printf("Total: R$ %.2f%n", quantidade * 1.5);
		}
		
		sc.close();
	}
}
