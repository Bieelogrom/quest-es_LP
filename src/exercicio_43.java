package exercicios;

public class exercicio_43 {
	public static void main(String[] args) {
		double ana = 1.10, maria = 1.5;
		int ano = 0;
		
		while(ana < maria) {
			ana += 0.3;
			maria += 0.2;
			ano++;
		}
		
		System.out.println("Tempo para Ana ficar maior que Maria: "+ ano);
	}
}
