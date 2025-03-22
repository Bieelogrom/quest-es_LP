package Lote_1_1;

import javax.swing.*;

public class exercicio_11 {
    public static void main(String[] args) {
        double raio, comprimento;
        double pi = 3.14;

        raio = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do raio"));

        comprimento = 2 * pi * raio;

        String texto = "Comprimento: "+ comprimento;

        JOptionPane.showMessageDialog(null,texto);
    }
}
