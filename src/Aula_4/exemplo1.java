package Aula_4;

import javax.swing.JOptionPane;

public class exemplo1 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o seu nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
        
        System.out.println("Valor: "+valor);
    }
}
