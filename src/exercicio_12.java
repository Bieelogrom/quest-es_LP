import javax.swing.*;

public class exercicio_12 {
    public static void main(String[] args) {
        int ano_nascimento, ano_atual, idade_atual, idade_futuro;

        ano_nascimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano do seu nascimento"));
        ano_atual = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano atual"));

        idade_atual = ano_atual - ano_nascimento;
        idade_futuro = idade_atual + 17;

        String texto = "Sua idade atual: "+ idade_atual +"\nIdade daqui 17 anos: "+ idade_futuro;

        JOptionPane.showMessageDialog(null, texto);
    }
}
