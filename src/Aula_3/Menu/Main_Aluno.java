package Aula_3.Menu;

import java.util.Scanner;

public class Main_Aluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = null; // Inicialmente, nenhum aluno cadastrado
        
        int opcao;
        
        do {
            // Exibindo menu
            System.out.println("\n--- Menu ---");
            System.out.println("1. Inserir Aluno");
            System.out.println("2. Mostrar Aluno");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (opcao) {
                case 1:
                    // Inserir aluno
                    System.out.print("Digite o nome do aluno: ");
                    String nome = scanner.nextLine();
                    
                    System.out.print("Digite a idade do aluno: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine(); // Consumir quebra de linha
                    
                    System.out.print("Digite o curso do aluno: ");
                    String curso = scanner.nextLine();
                    
                    aluno = new Aluno();
                    aluno.setCurso(curso);
                    aluno.setIdade(idade);
                    aluno.setNome(nome);
                    
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;

                case 2:
                    // Mostrar aluno
                    if (aluno != null) {
                        aluno.imprimir();
                    } else {
                        System.out.println("Nenhum aluno cadastrado ainda.");
                    }
                    break;

                case 3:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 3);
        
        scanner.close();
    }
}

