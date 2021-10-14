package br.com.variaveis;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.print("Digite a base menor: ");
			int b = sc.nextInt();
			
			System.out.print("Digite a base maior: ");
			int B = sc.nextInt();
			
			System.out.print("Digite a altura: ");
			int h = sc.nextInt();
			
			double area = ((b + B) / 2 ) * h;
			
			System.out.println();
			System.out.printf("((%d + %d)/2) x %d = %.2f de área \n", b, B, h, area);
			System.out.println("\n *** Calculo encerrado com Sucesso ***");
			
		} catch (InputMismatchException e) {
			System.err.println("Caracter não suportado");
			System.err.println("\n *** Calculo interrompido ***");
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			sc.close();
			
		}
		
		

	}

}
