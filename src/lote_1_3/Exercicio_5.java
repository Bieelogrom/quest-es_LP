package lote_1_3;

import java.util.Scanner;

public class Exercicio_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vetor = new int[20];
		
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite valor do índice "+(i+1)+": ");
			vetor[i] = sc.nextInt();
		}
		
		int resultadoSoma = calcularSeria(vetor);
		
		System.out.println("Resultado: "+resultadoSoma);
	}
	
	static int calcularSeria(int[] vetor) {
		int soma = 0;
		for(int i = 1; i <= 10; i++) {
			soma += vetor[i] - vetor[20 - i];
		}
		return soma;
	}
}
