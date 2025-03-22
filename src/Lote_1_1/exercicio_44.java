package Lote_1_1;

import java.util.Scanner;

public class exercicio_44 {
	public static void main(String[] args) {
		int base, expoente, total = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor da base: ");
		base = sc.nextInt();
		
		System.out.print("Digite o valor do expoente: ");
		expoente = sc.nextInt();
		
		for(int i = 1; i <= expoente; i++) {
			total *= base;
		}
		
		System.out.println("Resultado: "+ total);
	}
}
