package br.ucsal;

import java.util.Scanner;

public class Quest10 {
	/*
	 * Escrever um programa que leia o nome de um aluno e as notas das tr�s provas
	 * que ele obteve no semestre. No final informar o nome do aluno e a sua m�dia
	 * (aritm�tica). MEDIA = nota1 + nota2 + nota3 / 3.
	 */

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String aluno;
		Double n1 = 0.0, n2 = 0.0, n3 = 0.0, med=0.0;

		System.out.println("Informe o nome do usu�rio: ");
		aluno = sc.nextLine();
		System.out.println("Informe as tr�s notas das avalia��es deste semestre: ");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		
		med = n1 + n2 + n3 / 3;
		
		System.out.println("A m�dia de "+aluno+" foi: "+med);
		
		
	}

}
