package exercicios;

import java.util.Scanner;

public class Exercicio_16_mod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double quantidadeHorasTrabalhadas, valorPorHora, percentualDesconto;
		int numeroDependentes;
		
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		quantidadeHorasTrabalhadas = sc.nextDouble();
		System.out.println("Digite o valor por hora trabalhada: ");
		valorPorHora = sc.nextDouble();
		System.out.println("Digite o percentual de desconto: ");
		percentualDesconto = sc.nextDouble();
		System.out.println("Digite o número de dependentes: ");
		numeroDependentes = sc.nextInt();
		
		calcularSalario(quantidadeHorasTrabalhadas, valorPorHora, percentualDesconto, numeroDependentes);
	}
	
	static void calcularSalario(double quantidadeHorasTrabalhadas, double valorPorHora, double percentualDesconto, int numeroDependentes) {
		double salario = quantidadeHorasTrabalhadas * valorPorHora ;
		salario += 100 * numeroDependentes;
		double salarioLiquido = salario - (salario * percentualDesconto) / 100;
		System.out.println("Salário bruto: "+salario+"\nSalário líquido: "+salarioLiquido);
	}
}
