package Lote_1_1;

import javax.swing.*;

public class exercicio_26 {
    public static void main(String[] args) {
        int a, b;

        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de A"));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de B"));

        if (a > b) {
            if (b % a == 0){
                JOptionPane.showMessageDialog(null, "Não é divisível!");
            }else{
                JOptionPane.showMessageDialog(null, "É divisível!");
            }
        }else{
            if (a % b == 0){
                JOptionPane.showMessageDialog(null, "Não é divisível!");
            }else{
                JOptionPane.showMessageDialog(null, "É divisível!");
            }
        }

    }
}
