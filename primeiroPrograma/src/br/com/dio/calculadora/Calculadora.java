package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan =  new Scanner (System.in);
		int a,b;
		System.out.println("Digite um valor: ");
		a = scan.nextInt();
		System.out.println("Digite outro valor: ");
		b= scan.nextInt();
		
		int somar = somar(a,b);
		int subtrair = subtracao(a,b);
		float dividir = divisao(a,b);
		int multiplicar = multiplicacao(a,b);
		
		System.out.println("Resultado da soma: " + somar);
		System.out.println("Resultado da subtra��o: " + subtrair);
		System.out.println("Resultado da divis�o: " + dividir);
		System.out.println("Resultado da multiplica��o: " + multiplicar);
	}
	
	public static int somar(int a,int b) {
		return a + b;
	}
	public static int subtracao(int a,int b) {
		return a - b;
	}
	public static float divisao(int a,int b) {
		return a / b;
	}
	public static int multiplicacao(int a,int b) {
		return a * b;
	}
	
}
