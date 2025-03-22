package Lote_1_1;

import javax.swing.*;

public class exercicio_9 {
    public static void main(String[] args) {
        int valorUm, valorDois, soma;

        valorUm = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do primeiro valor"));
        valorDois = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do segundo valor"));

        soma = (int) Math.pow(valorUm, 2) + (int) Math.pow(valorDois, 2);

        String texto = "Soma: "+ soma;

        JOptionPane.showMessageDialog(null, texto);
    }
}
