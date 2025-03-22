package Lote_1_1;

import javax.swing.*;

public class exercicio_16 {
    public static void main(String[] args) {
        double horas_trabalhadas, valor_por_hora, percentual_desconto, numero_dependentes, salario_bruto, salario_liquido;

        horas_trabalhadas = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de horas trabalhadas"));
        valor_por_hora = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor que recebe por hora"));
        percentual_desconto = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o percentual de desconto"));
        numero_dependentes = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o número de dependentes"));

        salario_bruto = horas_trabalhadas * valor_por_hora;
        salario_liquido = salario_bruto - (salario_bruto * percentual_desconto)/100 + (numero_dependentes * 100);

        String texto = "Salário bruto: "+ salario_bruto +"\nSalário líquido: "+ salario_liquido;

        JOptionPane.showMessageDialog(null, texto);


    }
}
