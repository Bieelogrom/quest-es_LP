import javax.swing.JOptionPane;

public class exercicio_7 {
    public static void main(String[] args) {
        double comprimento, largura, altura, area;

        comprimento = Double.parseDouble(JOptionPane.showInputDialog(null, "digite o valor do comprimento"));
        largura = Double.parseDouble(JOptionPane.showInputDialog(null, "digite o valor da largura"));
        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "digite o valor da altura"));

        area = 2 * (comprimento * largura + comprimento * altura + largura * altura);

        String texto = "Área: "+ area +"m²";

        JOptionPane.showMessageDialog(null, texto);
    }
}
