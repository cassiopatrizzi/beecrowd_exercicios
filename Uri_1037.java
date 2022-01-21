package uri_exercicios_propostos;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1037 {

	public static void main(String[] args) {
		
		/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem
		dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. 
		Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem 
		“Fora de intervalo”. 
		O símbolo ( representa "maior que". Por exemplo:
		[0,25]  indica valores entre 0 e 25.0000, inclusive eles.
		(25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000.*/

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double intervalo = sc.nextDouble();

		if (intervalo < 0.0  || intervalo > 100.0) {
			System.out.println("Fora de intervalo");
		} 
		else if (intervalo <= 25.0) {
			System.out.println("Intervalo [0,25]");
		} 
		else if (intervalo <= 50.0) {
			System.out.println("Intervalo (25,50]");
		} 
		else if (intervalo <= 75.0) {
		System.out.println("Intervalo (50,75]");
		}
		else {
			System.out.println("Intervalo (75,100]");
		}

		sc.close();
	}

}
