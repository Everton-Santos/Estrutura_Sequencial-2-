package br.com.variaveis;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExpressoesMatematicas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {

			System.out.print("Raiz quadrada de: ");
			double x = sc.nextDouble();
			double quadrado = Math.sqrt(x);
			System.out.printf("Resultado: %.2f \n", quadrado);

			System.out.print("\nValor: ");
			x = sc.nextDouble();
			System.out.printf("%.0f elevado a: ", x);
			double y = sc.nextDouble();
			double elevado = Math.pow(x, y);
			System.out.printf("%.0f elevado a %.0f = %.2f \n", x, y, elevado);

			y = 4.0;
			double z = -5.0;
			double A = Math.abs(y);
			double B = Math.abs(z);
			System.out.printf("\nvalor absoluto de %.2f = %.2f \n", y, A);
			System.out.printf("valor absoluto de %.2f = %.2f \n", z, B);

		} catch (InputMismatchException i) {
			System.err.println("*** Caracter inválido! *** \n");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
			System.out.println("\n***Programa encerrado com sucesso! ***");
		}

	}

}
