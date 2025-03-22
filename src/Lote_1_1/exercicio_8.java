package Lote_1_1;

import javax.swing.JOptionPane;

public class exercicio_8 {
    public static void main(String[] args) {
        double valor_deposito, valor_ajustado;

        valor_deposito = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite valor do deposito"));
        valor_ajustado = valor_deposito * 1.3;
        String texto = "1 mês após aplicação: "+ valor_ajustado;
        JOptionPane.showMessageDialog(null, texto);
    }
}
