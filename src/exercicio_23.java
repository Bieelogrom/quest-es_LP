import javax.swing.*;

public class exercicio_23 {
    public static void main(String[] args) {
        int[] vetor = new int[3];

        for(int i = 0; i < 4; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite valor do índice "+ i +":"));
            if (i > 0){
                if (vetor[i - 1] < vetor[i]){
                        JOptionPane.showMessageDialog(null, "Valor maior que o antecessor!");
                        break;
                }
            }
        }

        for (int i = 0; i < 4; i++){
            JOptionPane.showMessageDialog(null, vetor[i]);
        }
    }
}
