package br.ucsal;

import java.util.Scanner;

public class Quest2 {

	/*
	 * Crie uma classe java que contenha um método que receba dois números e indique
	 * se são iguais ou se são diferentes. Mostre o maior e o menor (nesta
	 * sequência).
	 */

	static Scanner sc = new Scanner(System.in);

	static int n1 = 0, n2 = 0;

	public static void main(String[] args) {

		receberNumeros();

		System.out.println(obterIgual(n1, n2));

	}

	public static void receberNumeros() {

		System.out.println("Informar dois valores:");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
	}

	public static String obterIgual(int n1, int n2) {
		String igual;
		int m = maiorOuMenor(n1, n2);
		igual = (n1 == n2) ? "igual" : "diferente " + m;

		return igual;
	}

	public static int maiorOuMenor(int n1, int n2) {
		int res = 0;

		if (n1 > n2) {
			res = n1;
			System.out.println(n1);
		} else if (n2 > n1) {
			res = n2;
			System.out.println(n2);

		}
		return res;

	}

}
