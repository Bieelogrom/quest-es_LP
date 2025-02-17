import javax.swing.*;

public class exercicio_15 {
    public static void main(String[] args) {
        double cateto_um, cateto_dois, hipotenusa;

        cateto_um = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do primeiro cateto"));
        cateto_dois = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do segundo cateto"));

        hipotenusa = Math.sqrt((Math.pow(cateto_um,2)+Math.pow(cateto_dois,2)));

        String texto = "Hipotenusa: "+ hipotenusa;
        JOptionPane.showMessageDialog(null, texto);


    }
}
