package br.com.variaveis;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String product1;
		String product2;
		int age;
		int code;
		char gender;
		double price1;
		double price2;
		double measure;
		
		System.out.printf("Produto 1: ");
		product1 = sc.next();
		
		System.out.printf("Produto 2: ");
		product2 = sc.next();
		
		System.out.printf("Anos: ");
		age = sc.nextInt();
		
		System.out.printf("Código: ");
		code = sc.nextInt();
		
		System.out.printf("Sexo: ");
		gender = sc.next().charAt(0);
		
		System.err.println("Obs: Use virgula!");
		System.out.printf("Preço 1: ");
		price1 = sc.nextDouble();
		
		System.out.printf("Preço 2: ");
		price2 = sc.nextDouble();
		
		System.out.printf("Valor com 8 casas decimais: ");
		measure = sc.nextDouble();
		
		System.out.println("======= Arquivo Processado ======= \n");
		
		System.out.println("Products: ");
		
		System.out.printf("%s, which price is $ %.2f\n", product1, price1);
		System.out.printf("%s, which price is $ %.2f\n", product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %s \n", age, code, gender);
		System.out.println();
		System.out.printf("Measure with eight decimal places: %.8f \n", measure);
		System.out.printf("Rouded (three decimal places): %.3f \n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
		
	}

}
