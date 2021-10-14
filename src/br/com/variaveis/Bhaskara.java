package br.com.variaveis;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.print("x = (-b +- Raiz delta) / 2.a \n");
			
			System.out.println("\nDigite os valores abaixo:");
			System.out.print("a = ");
			double a = sc.nextDouble();
			
			System.out.print("b = ");
			double b = sc.nextDouble();
			
			System.out.print("c = ");
			double c = sc.nextDouble();
			
			double delta = Math.pow(b, 2) - 4 * a * c;
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			
			System.out.printf("\nX1 = (%.2f + Raiz %.2f) / 2 x %.2f \n", b, delta, a);
			System.out.printf("X1 = %.2f \n", x1);
			
			System.out.printf("\nX2 = (%.2f - Raiz %.2f) / 2 x %.2f \n", b, delta, a);
			System.out.printf("X2 = %.2f \n", x2);
			
		} catch (InputMismatchException i) {
			System.err.println("*** Caracter inválido! *** \\n");
	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
			System.out.println("\n***Programa encerrado com sucesso! ***");
		}
		
		

	}

}
