package Aula_5_Lista.Funcionario;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main_Funcionario {

    public static void main(String[] args) {
        List<Funcionario> listaFuncionarios = new ArrayList<>();
        int opcao;

        do {
            String menu = "Menu:\n"
                    + "1 ? Cadastrar funcion�rio\n"
                    + "2 ? Mostrar todos os funcion�rios\n"
                    + "3 ? Mostrar funcion�rio por c�digo\n"
                    + "0 ? Sair";

            String input = JOptionPane.showInputDialog(menu);
            if (input == null) {
                break; // Se o usu�rio cancelar, encerra o programa
            }
            opcao = Integer.parseInt(input);

            switch (opcao) {
                case 1:
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("C�digo:"));
                    String nome = JOptionPane.showInputDialog("Nome:");
                    String setor = JOptionPane.showInputDialog("Setor:");
                    String funcao = JOptionPane.showInputDialog("Fun��o:");
                    double salario = Double.parseDouble(JOptionPane.showInputDialog("Sal�rio:"));

                    Funcionario funcionario = new Funcionario(codigo, nome, setor, funcao, salario);
                    listaFuncionarios.add(funcionario);

                    JOptionPane.showMessageDialog(null, "Funcion�rio cadastrado com sucesso!");
                    break;

                case 2:
                    if (listaFuncionarios.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum funcion�rio cadastrado.");
                    } else {
                        StringBuilder lista = new StringBuilder("Lista de Funcion�rios:\n");
                        for (Funcionario f : listaFuncionarios) {
                            lista.append(f.imprimir()).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, lista.toString());
                    }
                    break;

                case 3:
                    int codigoBusca = Integer.parseInt(JOptionPane.showInputDialog("Digite o c�digo do funcion�rio:"));
                    boolean encontrado = false;

                    for (Funcionario f : listaFuncionarios) {
                        if (f.getCodigo() == codigoBusca) {
                            JOptionPane.showMessageDialog(null, "Funcion�rio encontrado:\n" + f.imprimir());
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        JOptionPane.showMessageDialog(null, "Funcion�rio n�o encontrado.");
                    }
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Op��o inv�lida, tente novamente.");
            }
        } while (opcao != 0);
    }
}
