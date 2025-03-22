package Lote_1_1;

import javax.swing.*;

public class exercicio_27 {
    public static void main(String[] args) {
        int num_voltas, extensao_circuito, tempo_duracao, velecidade_media;

        num_voltas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número de voltas"));
        extensao_circuito = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o extensao do circuito"));
        tempo_duracao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o duração do circuito"));

        velecidade_media = num_voltas * (extensao_circuito * tempo_duracao);


    }
}
