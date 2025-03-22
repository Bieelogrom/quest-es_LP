package Lote_1_1;

import javax.swing.*;

public class exercicio_17 {
    public static void main(String[] args) {
        double tempo_percurso, velocidade_media, distancia, litros_gasto;

        tempo_percurso = Double.parseDouble(JOptionPane.showInputDialog(null, "Tempo:"));
        velocidade_media = Double.parseDouble(JOptionPane.showInputDialog(null, "Velocidade média:"));

        distancia = tempo_percurso * velocidade_media;
        litros_gasto = distancia / 12;

        JOptionPane.showMessageDialog(null, ("Litros gastos: "+ litros_gasto));

    }
}
