package Lote_1_1;

import javax.swing.JOptionPane;

public class exercicio_6 {
    public static void main(String[] args) {
        int x, y, aux;

        x = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de X"));
        y = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de Y"));

        aux = x;
        x = y;
        y = aux;

        String texto = "X: "+ x +"\nY: "+ y;

        JOptionPane.showMessageDialog(null, texto);


    }
}