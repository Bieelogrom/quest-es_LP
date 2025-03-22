package lote_1_3;

import java.util.Scanner;

public class Exercicio_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetor = new int[10];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite valor do índice "+(i+1)+": ");
			vetor[i] = sc.nextInt();
		}
		
		int[] maiorEMenor = maiorEMenor(vetor);
		int media = calcularMedia(vetor);
		
		System.out.println("Maior: ["+maiorEMenor[0]+"]\nMenor: ["+maiorEMenor[1]+"]\nMédia: "+media);
	}

	static int[] maiorEMenor(int[] vetor) {
		int maior = 0, menor = 0;
		int[] valores = {0, 0};
		for(int i = 0; i < vetor.length; i++) {
			if(i == 0) {
				maior = vetor[i];
				menor = vetor[i];
			}
			if(vetor[i] > maior) {
				maior = vetor[i];
			}
			if(vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		valores[0] = maior;
		valores[1] = menor;
		return valores;
	}
	
	static int calcularMedia(int[] vetor) {
		int soma = 0;
		for(int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		int media = soma / vetor.length;
		return media;
	}
}
