package Lote_1_1;

import javax.swing.*;

public class exercicio_13 {
    public static void main(String[] args) {
        double alimento_quilos;
        int dias_consumo;

        alimento_quilos = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade em KG"));
        dias_consumo = (int) (alimento_quilos * 1000) / 50;

        String texto = "Dias de consumo: "+ dias_consumo;

        JOptionPane.showMessageDialog(null, texto);
    }
}
