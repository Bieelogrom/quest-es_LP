package lote_1_3;

import java.util.Scanner;

public class Exercicio_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetor = new int[10];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite valor do índice "+(i+1)+": ");
			vetor[i] = sc.nextInt();
		}
		
		for(int i:vetor) {
			System.out.print(" "+i);
		}
		
		System.out.println("");
		
		int[] vetorOrdenado = bubbleSort(vetor);
		
		for(int i:vetorOrdenado) {
			System.out.print(" "+i);
		}
	}
	
	static int[] bubbleSort(int[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			for(int j = 0; j < vetor.length - 1; j++) {
				if(vetor[j] > vetor[j+1]) {
					int aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
				}
			}
		}
		return vetor;
	}
}
