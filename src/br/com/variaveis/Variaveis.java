package br.com.variaveis;

import java.util.Locale;
import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int y = 32;
		double x = 10.35784;
		
		System.out.println(y);
		System.out.printf("%.2f\n", x);
		System.out.printf("%.4f\n", x);
		
		System.out.printf("Resultado = %.2f metros\n", x);
		
		System.out.println("======================= \n");
		
		System.out.print("Nome: ");
		String nome = sc.next();
		
		System.out.printf("Idade: ");
		int idade = sc.nextInt();
		
		System.out.printf("Renda: ");
		double renda = sc.nextDouble();
		
		System.out.printf("%s tem %d anos e ganha uma renda de %.2f reais", nome, idade, renda);
		
		/*	%f = ponto flutuante
		 *	%d = inteiro
		 *	%s = texto
		 *	%.2f = double e formatação de casas
		 *	\n ou %n = quebra de linha
		 */
		

	}

}
