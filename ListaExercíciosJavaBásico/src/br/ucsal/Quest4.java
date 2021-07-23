package br.ucsal;

import java.util.Scanner;

public class Quest4 {
	/*
	 * Crie uma classe java em que o usuário informe dois números e a operação que
	 * deve executar e apresente o resultado.
	 */
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		double n1=0.0, n2=0.0,escolha=0.0;
		int op=0;

		System.out.println("Informe dois números:");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		System.out.println("Informe (1) para soma, (2) para subtração, (3) para multiplicação e (4) para divisão");
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
			System.out.println("Escolha um valor válido ao apresentado no enunciado.");
		}
	}

}
