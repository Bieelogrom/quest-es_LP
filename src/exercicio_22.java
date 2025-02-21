import javax.swing.*;

public class exercicio_22 {
    public static void main(String[] args) {
        int a, b;

        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite valor de A"));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite valor de B"));

        if(a > b){
            JOptionPane.showMessageDialog(null, b+" - "+a);
        }else{
            JOptionPane.showMessageDialog(null, a+" - "+b);
        }
    }
}
