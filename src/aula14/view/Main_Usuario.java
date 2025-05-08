package aula14.view;

import aula14.entity.Usuario;
import aula14.dao.UsuarioDAO;

public class Main_Usuario {
    public static void main(String[] args) {
        Usuario usu = new Usuario(1, "Fabio Colombini", "0000");
        
        UsuarioDAO usuDAO = new UsuarioDAO();
        //usuDAO.inserir(usu);
        //usuDAO.editar(usu);
        usuDAO.excluir(1);
    }
}
