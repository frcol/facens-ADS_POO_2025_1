package Aula_10_Interface.TarefaAutomovel;

public class Aviao implements IAutomatico, IVoa {
    private String modelo;

    public Aviao(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void mudaMarchaAutomaticamente() {
        System.out.println("Avi�o mudando marcha automaticamente");
    }

    @Override
    public void voar() {
        System.out.println("Avi�o voando");
    }

    public void decolar() {
        System.out.println("Avi�o decolando");
    }

    public void pousar() {
        System.out.println("Avi�o pousando");
    }
}
