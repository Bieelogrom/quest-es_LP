package Lote_1_1;

import java.util.Scanner;

public class exercicio_39 {
    public static void main(String[] args) {
        int casas, qtde = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de casas");
        casas = sc.nextInt();

        for(int i = 1; i <= casas; i++){
            qtde = qtde * 2;
        }

        System.out.println("Resultado: "+ qtde);
    }
}
