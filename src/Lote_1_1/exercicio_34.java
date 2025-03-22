package Lote_1_1;

import javax.swing.*;

public class exercicio_34 {
    public static void main(String[] args) {
        int valor;

        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor para calcular tabuada"));

        for (int i = 1; i <= 10; i++){
            System.out.println(i+" X "+valor+" = "+(valor*i));
        }
    }
}
