package Aula_1.TarefaFuncoes;

/*
Crie uma função que simule uma calculadora simples. Ela deve
receber dois números e um operador (+, -, *, /) como parâmetros e
retornar o resultado da operação.
*/

public class Func_1 {
    public static double calcular(double num1, double num2, char operador) {
        switch (operador) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Erro: divisão por zero.");
                    return Double.NaN;  // Retorna "NaN" para indicar erro.
                }
            default:
                System.out.println("Operador inválido. Use +, -, * ou /.");
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;
        char operador = '+';

        double resultado = calcular(num1, num2, operador);
        if (!Double.isNaN(resultado)) {
            System.out.println("Resultado: " + resultado);
        }
    }
}
