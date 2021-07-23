package br.ucsal;

import java.util.Scanner;

public class Quest5 {
	/*
	 * Crie uma classe em java para calcular o estoque médio de um produto. O
	 * estoque médio é calculado pela formula: estoque médio = (quantidade mínima +
	 * quantidade máxima)/2. Deverá ser solicitado ao usuário o nome do produto, a
	 * quantidade mínima e a quantidade máxima do produto.
	 */
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int max=0, min=0, med=0;
		String nome;
		System.out.println("Informe o nome do produto");
		nome=sc.nextLine();
		System.out.println("Agora informe a quantidade mínima e a quantidade máxima da produto");
		min=sc.nextInt();
		max=sc.nextInt();
		
		med=min+max/2;
		System.out.println("O estoque médio do produto "+nome+" é de "+med);
		
	}

}
