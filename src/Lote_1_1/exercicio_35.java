package Lote_1_1;

import javax.swing.*;

public class exercicio_35 {
    public static void main(String[] args) {
        int numA, numB, somatoria = 0;

        numA = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite valor de A"));
        numB = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite valor de B"));

        if(numA > numB){
            for(int i = numB; i <= numA; i++){
                if (i % 2 == 0){
                    continue;
                }else{
                    somatoria += i;
                }
            }
        }else{
            for(int i = numA; i <= numB; i++){
                if (i % 2 == 0){
                    continue;
                }else{
                    somatoria += i;
                }
            }
        }

        JOptionPane.showMessageDialog(null, somatoria);
    }
}
