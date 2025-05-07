package Aula_8_DB.view;

import Aula_8_DB.dao.ProdutoDAO;
import Aula_8_DB.entity.Produto;

public class MainProduto {
    public static void main(String[] args) {
        Produto p = new Produto(0, "TV", 3, 1200);
        
        new ProdutoDAO().inserir(p);
    }
}
