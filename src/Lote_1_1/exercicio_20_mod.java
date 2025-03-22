package Lote_1_1;

import java.util.Scanner;

public class exercicio_20_mod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		
		System.out.println("Digite o valor de A:");
		a = sc.nextDouble();
		System.out.println("Digite o valor de B:");
		b = sc.nextDouble();
		System.out.println("Digite o valor de C:");
		c = sc.nextDouble();
		
		calcularRaizes(a,b,c);
	}
	
	static void calcularRaizes(double a, double b, double c) {
		double delta = (b * b) - 4 * a * c;
		
		double x1 = -(b) + Math.sqrt(delta);
		System.out.println("X1 "+ x1);
		x1 = x1 / (2 * a);
		double x2 = -(b) - Math.sqrt(delta);
		x2 = x2 / (2 * a);
		System.out.println("X1 "+x1+" X2 "+x2);
	}
}
