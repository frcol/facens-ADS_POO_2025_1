package Aula_1.TarefaFuncoes;
/*
Crie uma fun��o que receba um n�mero inteiro como par�metro e
retorne verdadeiro se o n�mero for par, ou falso caso contr�rio.
*/

public class Func_2 {
   public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        int numero = 10;

        if (ehPar(numero)) {
            System.out.println(numero + " � par.");
        } else {
            System.out.println(numero + " � �mpar.");
        }
    }
}
