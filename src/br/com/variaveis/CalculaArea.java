package br.com.variaveis;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CalculaArea {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {

			System.out.print("Nome completo: ");
			String nome = sc.nextLine();

			System.out.print("(M)Masculino ou (F)Feminino: ");
			char sexo = sc.next().charAt(0);

			System.out.print("Digite a base menor: ");
			int b = sc.nextInt();

			System.out.print("Digite a base maior: ");
			int B = sc.nextInt();

			System.out.print("Digite a altura: ");
			int h = sc.nextInt();

			double area = ((b + B) / 2) * h;

			System.out.println();
			System.out.println("Nome: " + nome);

			if (sexo == 'M' || sexo == 'm') {
				System.out.println("Sexo: " + sexo);
			} else if (sexo == 'F' || sexo == 'f') {
				System.out.println("Sexo: " + sexo);
			} else {
				System.err.println("Sexo: Indefinido");
			}

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
