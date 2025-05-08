package aula14.view;

import aula14.dao.ProdutoDAO;
import aula14.entity.Produto;
import java.util.ArrayList;

public class Main_Produto {
    public static void main(String[] args) {
        Produto prod = new Produto(0, "Geladeira", 5, 3000);
        
        ProdutoDAO dao = new ProdutoDAO();
        dao.inserir(prod);
        
        ArrayList<Produto> lstProdutos =  dao.getAll(Produto.class);
        for (Produto pro : lstProdutos) {
            System.out.println(pro.getNome());
        }
    }
}
