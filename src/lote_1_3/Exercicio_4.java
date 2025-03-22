package lote_1_3;

import java.util.Scanner;

public class Exercicio_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vetor = new int[10];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite valor do índice "+(i+1)+": ");
			vetor[i] = sc.nextInt();
		}
		
		int media = mediaDoGrupo(vetor);
		int notasAcima = quantidadeNotasAcimaMedia(vetor, media);
		
		System.out.println("Média: "+media+"\nNotas acima: "+notasAcima);
		posicoesAbaixoDaMedia(vetor, media);
	}

	
	static int mediaDoGrupo(int[] vetor) {
		int media = 0;
		for(int i: vetor) {
			media += i;
		}
		media = media / vetor.length;
		return media;
	}
	
	static int quantidadeNotasAcimaMedia(int[] vetor, int media) {
		int quantidade = 0;
		for(int i:vetor) {
			if(i > media) {
				quantidade++;
			}
		}
		return quantidade;
	}
	
	static void posicoesAbaixoDaMedia(int[] vetor, int media) {
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] < media) {
				System.out.println("Posição "+i+" está abaixo da média.");
			}
		}
	}
}
