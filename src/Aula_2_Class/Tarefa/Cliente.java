package Aula_2_Class.Tarefa;

public class Cliente {
    private String cpf;
    private String nome;
    private int idade;

    // Métodos SET
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Métodos GET
    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Método imprimir
    public String imprimir() {
        return "CPF: " + cpf + "\nNome: " + nome + "\nIdade: " + idade;
    }
}

