package Lote_1_1;

import javax.swing.*;

public class exercicio_32 {
    public static void main(String[] args) {
        int valor, fatorial = 1;

        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor"));

        for(int i = 1; i <= valor; i++){
            fatorial *= i;
        }

        String texto = "Fatorial de "+valor+" é "+fatorial;

        JOptionPane.showMessageDialog(null, texto);
    }
}
