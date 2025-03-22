package lote_1_3;

import java.util.Scanner;

public class Exercicio_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] matriz = new int[4][3];
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("Semana "+(i+1)+" vendas "+(j+1)+": ");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		int vendas_mes = 0;
		int vendas_semana = 0;
		
		for(int i = 0; i < 4; i++) {
			vendas_semana = 0;
			for(int j = 0; j < 3; j++) {
				vendas_mes += matriz[i][j];
				vendas_semana += matriz[i][j];
			}
			System.out.println("Vendas na semana "+(1+i)+": "+vendas_semana);
		}
		
		System.out.println("Total de vendas no mês: "+vendas_mes);
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("["+matriz[i][j]+"]");
			}
			System.out.println("");
		}
	}
	
	
}
