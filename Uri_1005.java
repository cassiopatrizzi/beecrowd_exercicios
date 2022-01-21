package uri_exercicios_propostos;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1005 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y, media;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		media = (x * 3.5 + y * 7.5) / 11.0;
		
		System.out.printf("MEDIA = %.5f\n", media);
		
		sc.close();

	}

}
