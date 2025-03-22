package Lote_1_1;

import javax.swing.*;

public class exercicio_19 {
    public static void main(String[] args) {
        double a, b;

        a = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite valor de A"));
        b = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de B"));

        if (a > b) {
            JOptionPane.showMessageDialog(null, "Maior valor é A");
        }else{
            JOptionPane.showMessageDialog(null, "Maior valor é B");
        }
    }
}
