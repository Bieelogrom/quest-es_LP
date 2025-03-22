package Lote_1_1;

import javax.swing.*;

public class exercicio_14 {
    public static void main(String[] args) {
        double primeiro_angulo, segundo_angulo, terceiro_angulo;

        primeiro_angulo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do primeiro ângulo"));
        segundo_angulo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do segundo ângulo"));
        terceiro_angulo = 180 - (primeiro_angulo + segundo_angulo);

        String texto = "Terceiro ângulo: "+ terceiro_angulo;

        JOptionPane.showMessageDialog(null, texto);


    }
}
