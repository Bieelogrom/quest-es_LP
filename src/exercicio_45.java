package exercicios;

public class exercicio_45 {

	public static void main(String[] args) {
		double resultado = 0;
		
		for(double i = 2; i <= 15; i++) {
			resultado += i / (i * i);
		}
		
		System.out.println("Resultado: "+(1 - resultado));
	}

}
