package br.ucsal;

import java.util.Scanner;

public class Quest4 {
	/*
	 * Crie uma classe java em que o usu�rio informe dois n�meros e a opera��o que
	 * deve executar e apresente o resultado.
	 */
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		double n1=0.0, n2=0.0,escolha=0.0;
		int op=0;

		System.out.println("Informe dois n�meros:");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		System.out.println("Informe (1) para soma, (2) para subtra��o, (3) para multiplica��o e (4) para divis�o");
		op = sc.nextInt();

		switch (op) {
		
		case 1: 
			escolha=n1+n2;
		System.out.println(escolha);
		break;
		
		case 2: 
			escolha=n1-n2;
		System.out.println(escolha);
		break;
		
		case 3: 
			escolha=n1*n2;
		System.out.println(escolha);
		break;
		
		case 4: 
			escolha=n1/n2;
		System.out.println(escolha);
		break;
		
		default:
			System.out.println("Escolha um valor v�lido ao apresentado no enunciado.");
		}
	}

}
