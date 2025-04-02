package Aula_6_Relacionamento;

import java.util.ArrayList;

public class Socio {
    private String nome;
    private ArrayList<Dependente> lstDependentes;

    public Socio(String nome) {
        this.nome = nome;
        lstDependentes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void addDependente(Dependente dep) {
        lstDependentes.add(dep);
    }
}
