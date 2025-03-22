package Lote_1_1;

import javax.swing.*;

public class exercicio_38 {
    public static void main(String[] args) {
        double valores, maiorValor = 0, menorValor = 0;

        for(int i = 0; i < 10; i++){
            valores = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de "+ i +" :"));
            if(i == 0){
                maiorValor = valores;
                menorValor = valores;
            }
            if(valores > maiorValor){
                maiorValor = valores;
            }
            if(valores < menorValor){
                menorValor = valores;
            }
        }

        String texto = "Maior valor: "+ maiorValor +"\nMenor valor: "+ menorValor;

        JOptionPane.showMessageDialog(null, texto);
    }
}
