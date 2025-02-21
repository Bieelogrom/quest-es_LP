import javax.swing.*;

public class exercicio_24 {
    public static void main(String[] args) {
        int a, b = 0;

        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite valor de A"));

        if(a % 2 == 0){
            JOptionPane.showMessageDialog(null,"Divisível por 2!");
        }

        if(b % 3 == 0){
            JOptionPane.showMessageDialog(null,"Divisível por 3!");
        }


    }
}
