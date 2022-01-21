package uri_exercicios_propostos.uri_1048;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1048 {
	
	/* A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a faixa salarial.
        Ler o salário do funcionário, calcule e mostre o novo salário, bom como o valor de reajuste ganho e o índice reajustado, em percentual.*/

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		
		if (salario >= 0 && salario <= 400.00) {
			System.out.printf("Novo salario: %.2f%n", salario + (salario * 0.15));
			System.out.printf("Reajuste ganho: %.2f%n", (salario * 0.15));
			System.out.println("Em percentual: 15 %");
		}
		else if (salario >= 400.00 && salario <= 800.00) {
			System.out.printf("Novo salario: %.2f%n", salario + (salario * 0.12));
			System.out.printf("Reajuste ganho: %.2f%n", (salario * 0.12));
			System.out.println("Em percentual: 12 %");
		}
		else if (salario > 800.00 && salario <= 1200.00) {
			System.out.printf("Novo salario: %.2f%n", salario + (salario * 0.10));
			System.out.printf("Reajuste ganho: %.2f%n", (salario * 0.10));
			System.out.println("Em percentual: 10 %");
		}
		else if (salario > 1200.00 && salario <= 2000.00) {
			System.out.printf("Novo salario: %.2f%n", salario + (salario * 0.07));
			System.out.printf("Reajuste ganho: %.2f%n", (salario * 0.07));
			System.out.println("Em percentual: 7 %");
		}
		else {
			System.out.printf("Novo salario: %.2f%n", salario + (salario * 0.04));
			System.out.printf("Reajuste ganho: %.2f%n", (salario * 0.04));
			System.out.println("Em percentual: 4 %");
			
		}
			sc.close();
		
	}

}
