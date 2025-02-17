import javax.swing.*;

public class exercicio_10 {
    public static void main(String[] args) {
        double numeroUm, numeroDois;

        numeroUm = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do primeiro número: "));
        numeroDois = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do segundo número: "));
        String texto = "A diferença entre "+ numeroUm +" e "+ numeroDois +" é de "+ (numeroUm - numeroDois);
        JOptionPane.showMessageDialog(null, texto);
    }
}
