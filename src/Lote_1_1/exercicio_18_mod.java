package Lote_1_1;

import java.util.Scanner;

public class exercicio_18_mod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.println("Digite o valor de A:");
		a = sc.nextInt();
		System.out.println("Digite o valor de B:");
		b = sc.nextInt();
		
		calcularDiferenca(a,b);
	}

	static void calcularDiferenca(int a, int b) {
		if(a > b) {
			System.out.println("Diferença: "+(a - b));
		}else {
			System.out.println("Diferença: "+(b - a));
		}
	}
}
