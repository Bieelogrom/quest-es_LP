import javax.swing.*;

public class exercicio_21 {
    public static void main(String[] args) {
        double nota_1, nota_2, nota_3, nota_4, media;

        nota_1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da primeira nota"));
        nota_2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da segunda nota"));
        nota_3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da tereira nota"));
        nota_4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da quarta nota"));

        media = (nota_1 + nota_2 + nota_3 + nota_4)/4;

        if(media >= 6.0){
            JOptionPane.showMessageDialog(null, "Aprovado");
        }else if(media >= 3.0 || media <= 6.0){
            JOptionPane.showMessageDialog(null, "Exame");
        }else{
            JOptionPane.showMessageDialog(null, "Retido");
        }
    }
}
