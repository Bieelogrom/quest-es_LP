package Lote_1_1;

import javax.swing.*;

public class exercicio_33 {
    public static void main(String[] args) {
        double valor, resultado = 0;

        valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor"));

        for(int i = 1; i <= valor; i++){
            resultado += (double) 1 / i;
        }

        String texto = "O resultado é: "+ resultado;

        JOptionPane.showMessageDialog(null, texto);
    }
}
