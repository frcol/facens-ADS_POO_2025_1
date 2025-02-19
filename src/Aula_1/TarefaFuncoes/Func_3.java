package Aula_1.TarefaFuncoes;
/*
Desenvolva uma fun��o que conte quantas vezes um determinado
caractere aparece em uma string. A fun��o deve receber a string e o
caractere como par�metros e retornar a contagem.
Lembre-se de que voc� pode usar o m�todo charAt() para acessar
caracteres individuais em uma string.
*/

public class Func_3 {
    public static int contarCaracter(String texto, char caractere) {
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.toLowerCase().charAt(i) == caractere) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        String texto = "Universidade Facens";
        char caractere = 'a';

        int resultado = contarCaracter(texto, caractere);

        System.out.println("O caractere '" + caractere + "' aparece " + resultado + " vezes na string.");
    }
}
