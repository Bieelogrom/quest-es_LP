package exercicios;

import java.util.Scanner;

public class exercicio_17_mod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tempo de percurso (minutos): ");
		int tempoPercurso = sc.nextInt();
		System.out.println("Digite a velocidade média: ");
		int velocidadeMedia = sc.nextInt();
		
		calcularLitrosGastos(tempoPercurso, velocidadeMedia);
	}
	
	static void calcularLitrosGastos(int temp, int velMed) {
		int distancia = temp * velMed;
		double litrosGastos = distancia / 12;
		System.out.println("Litros gastos: "+ litrosGastos);
	}
}
