package Lote_1_1;

import javax.swing.*;

public class exercicio_18 {
    public static void main(String[] args) {
        int a, b, diferenca;
        String texto;

        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de A"));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de B"));

        if(a > b){
            diferenca = a - b;
            texto = "Maior valor é A!\nDiferença de a - b: "+ diferenca;
        }else{
            diferenca = b - a;
            texto = "Maior valor é B!\nDiferença de b - a: "+ diferenca;
        }

        JOptionPane.showMessageDialog(null, texto);
    }
}
