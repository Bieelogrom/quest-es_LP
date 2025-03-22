package Lote_1_1;

public class exercicio_42 {
    public static void main(String[] args) {
        double soma = 0;

        for(int i = 1; i <= 50; i++){
            if(i == 1){
                soma += i;
            }
            soma += (double) i / (i+1);
        }

        System.out.println("Resultado: "+ soma);
    }
}
