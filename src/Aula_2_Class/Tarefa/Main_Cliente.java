package Aula_2_Class.Tarefa;

import java.util.Scanner;

public class Main_Cliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();

        // Entrada de dados
        System.out.print("Digite o CPF do cliente: ");
        cliente.setCpf(scanner.nextLine());

        System.out.print("Digite o Nome do cliente: ");
        cliente.setNome(scanner.nextLine());

        System.out.print("Digite a Idade do cliente: ");
        cliente.setIdade(scanner.nextInt());

        // Exibir informações do cliente
        System.out.println("\n--- Dados do Cliente ---");
        System.out.println(cliente.imprimir());

        scanner.close();
    }
}

