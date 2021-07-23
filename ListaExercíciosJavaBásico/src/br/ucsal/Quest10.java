package br.ucsal;

import java.util.Scanner;

public class Quest10 {
	/*
	 * Escrever um programa que leia o nome de um aluno e as notas das três provas
	 * que ele obteve no semestre. No final informar o nome do aluno e a sua média
	 * (aritmética). MEDIA = nota1 + nota2 + nota3 / 3.
	 */

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String aluno;
		Double n1 = 0.0, n2 = 0.0, n3 = 0.0, med=0.0;

		System.out.println("Informe o nome do usuário: ");
		aluno = sc.nextLine();
		System.out.println("Informe as três notas das avaliações deste semestre: ");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		
		med = n1 + n2 + n3 / 3;
		
		System.out.println("A média de "+aluno+" foi: "+med);
		
		
	}

}
