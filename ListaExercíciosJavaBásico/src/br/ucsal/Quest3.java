package br.ucsal;

import java.util.Scanner;

public class Quest3 {
	/*
	 * Crie uma classe java que contenha um m�todo que receba dois n�meros e efetue
	 * a multiplica��o destes n�meros.
	 */

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		double n1 = 0, n2 = 0, res = 0;
		System.out.println("Informar dois valores");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		res=n1*n2;
		System.out.println(res);
		
	}

}
