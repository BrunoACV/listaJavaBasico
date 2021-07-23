package br.ucsal;

import java.util.Scanner;

public class Quest1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		op();
	}

	public static int op() {
		int n1 = 0, n2 = 0, res=0;
		System.out.println("Informe dois números inteiros:");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if (n1>n2) {
			res=n1;
			System.out.println(n1);
		}
		else if (n2>n1) {
			res=n2;
			System.out.println(n2);

		}
		else {
			System.out.println("Números iguais");
		}
		
		
		return res;
	}

}
