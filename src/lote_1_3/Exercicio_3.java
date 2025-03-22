package lote_1_3;

import java.util.Scanner;

public class Exercicio_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vet_a = new int[3];
		int[] vet_b = new int[3];
		
		
		for(int i = 0; i < 3; i++) {
			vet_a[i] = sc.nextInt();
		}
		for(int i = 0; i < 3; i++) {
			vet_b[i] = sc.nextInt();
		}
		
		int[] vetor_final = concatenarVetores(vet_a, vet_b);
		
		for(int i: vetor_final) {
			System.out.print(" "+i);
		}
	}
	
	static int[] concatenarVetores(int[] vet_a, int[] vet_b) {
		int[] vet_final = new int[6];
		for(int i = 0; i < 6; i++) {
			if(i < 3) {
				vet_final[i] = vet_a[i];
			}else {
				vet_final[i] = vet_b[i-3];
			}
		}
		return vet_final;
	}
}
