package lote_1_3;

import java.util.Scanner;

public class Exercicio_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetor = new int[50];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite valor do índice "+(i+1)+": ");
			vetor[i] = sc.nextInt();
		}
		
		int media = calcularMedia(vetor);
		int soma = somarImpares(vetor);
		
		System.out.println("Média: "+media+"\nSoma: "+soma);
	}
	
	static int calcularMedia(int[] vet) {
		int media = 0;
		int cont = 1;
		for(int i = 0; i < vet.length; i++) {
			if(vet[i] > 10 && vet[i] < 200) {
				media += vet[i];
				cont++;
			}
		}
		media = media / cont;
		return media;
	}
	
	static int somarImpares(int[] vet) {
		int soma = 0;
		for(int i = 0; i < vet.length; i++) {
			if(!(vet[i] % 2 == 0)) {
				soma += vet[i];
			}
		}
		return soma;
	}
}
