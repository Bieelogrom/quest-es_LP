package Lote_1_1;

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;

public class exercicio_20 {
    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;
        String texto;

        a = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do coeficiente A"));
        b = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do coeficiente B"));
        c = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do coeficiente C"));

        delta = Math.pow(b, 2)-4*a*c;

        delta = Math.sqrt(delta);

        if (delta > 0){
            x1 = -(b)+delta;
            x1 = x1 / (2*a);
            x2 = -(b)-delta;
            x2 = x2 / (2*a);


            texto = "Duas raízes reais!\nX1 = "+ x1 +" X2 = "+ x2;

            JOptionPane.showMessageDialog(null, texto);
        }else{
            JOptionPane.showMessageDialog(null, "Nenhuma raiz real");
        }
    }
}
