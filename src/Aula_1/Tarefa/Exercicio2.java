package Aula_1.Tarefa;

import java.util.Scanner;
/*
 Em uma elei��o presidencial existem quatro candidatos. Os votos s�o informados atrav�s de 
c�digos. Os dados utilizados para a contagem dos votos obedecem � seguinte codifica��o:   
1,2,3,4 = voto para os respectivos candidatos; 
5 = voto nulo; 
6 = voto em branco; 
Elabore um algoritmo que leia o c�digo do candidato em um voto. Calcule e escreva: 
- total de votos para cada candidato; 
- total de votos nulos; 
- total de votos em branco; 
Como finalizador do conjunto de votos, tem-se o valor 0. 
*/
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int voto;
        int candidatos[] = {0,0,0,0};
        int votosNulos = 0;
        int votosEmBranco = 0;

        do {
            System.out.print("Digite o codigo do candidato (ou 0 para sair): ");
            voto = scanner.nextInt();

            switch (voto) {
                case 1:
                    candidatos[0]++;
                    break;
                case 2:
                    candidatos[1]++;
                    break;
                case 3:
                    candidatos[2]++;
                    break;
                case 4:
                    candidatos[3]++;
                    break;
                case 5:
                    votosNulos++;
                    break;
                case 6:
                    votosEmBranco++;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Codigo invalido.");
                    break;
            }
        } while (voto != 0);

        System.out.println("Total de votos para cada candidato:");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.printf("Candidato %d: %s\n", i+1, candidatos[i]);
        }
        System.out.println("Total de votos nulos: " + votosNulos);
        System.out.println("Total de votos em branco: " + votosEmBranco);
    }
}
