package br.ucsal;

import java.util.Scanner;

public class Quest5 {
	/*
	 * Crie uma classe em java para calcular o estoque m�dio de um produto. O
	 * estoque m�dio � calculado pela formula: estoque m�dio = (quantidade m�nima +
	 * quantidade m�xima)/2. Dever� ser solicitado ao usu�rio o nome do produto, a
	 * quantidade m�nima e a quantidade m�xima do produto.
	 */
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int max=0, min=0, med=0;
		String nome;
		System.out.println("Informe o nome do produto");
		nome=sc.nextLine();
		System.out.println("Agora informe a quantidade m�nima e a quantidade m�xima da produto");
		min=sc.nextInt();
		max=sc.nextInt();
		
		med=min+max/2;
		System.out.println("O estoque m�dio do produto "+nome+" � de "+med);
		
	}

}
