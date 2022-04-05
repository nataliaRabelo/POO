package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: Natália Bruno Rabelo.
 */
public class Main {

    /**
     * Essa função é responsável por ler notas de funcionários sobre qualidade de refeições até que seja lido um valor 0 => n >= 100.
     */
    public static void main(String[] args) {
        ArrayList<Integer> notas = new ArrayList<>();
        Scanner myObj = new Scanner(System.in);
        int ultimoValor = 1;
        while (ultimoValor >= 0 && ultimoValor <= 100) {
            int x = myObj.nextInt();
            ultimoValor = x;
            notas.add(x);
        }
        contaNotas(notas);
    }
    /**
     * @param n Essa função é responsável por calcular os percentuais de notas com números entre os seguinter intervalos:.
     *              péssimas - (nota entre 0 e 25) ruins - (nota acima de 25 e até 50), boas - (nota acima de 50 e até 75), ótimas - (acima de 75 até 100).
     *          O cálculo é feito a partir da contagem das unidades dos votos realizada pela função contaNotas() com base nestes critérios acima.
     * @return result um valor inteiro com o resultado do percentual  do grupo desejado.
     */
    public static int calculaPercentual(int n, int total){

        int result = (n * 100)/total;

        return result;
    }

    /**
     * @param notas Essa função é responsável por contar os votos com notas de acordo com seguintes intervalos:.
     *              péssimas - (nota entre 0 e 25) ruins - (nota acima de 25 e até 50), boas - (nota acima de 50 e até 75), ótimas - (acima de 75 até 100).
     *              Além disso, é responsável por imprimir o percentual sobre essas contagens calculado pela função calculaPercentual()
     */
    public static void contaNotas(ArrayList<Integer> notas) {

        int otimas = 0, boas = 0, ruins = 0 , pessimas = 0;
        int total = notas.size() - 1;

        for (int i = 0; i < total; i++) {
            int nota = notas.get(i);
            if (nota >= 75 && nota <= 100){
                otimas++;
            }
            else if(nota >= 50 && nota <= 75){
                boas++;
            }
            else if(nota >= 25 && nota <= 50){
                ruins++;
            }
            else if(nota >= 0 && nota <= 25){
                pessimas++;
            }

        }
        int x = calculaPercentual(otimas, total);
        int y = calculaPercentual(boas, total);
        int z = calculaPercentual(ruins, total);
        int w = calculaPercentual(pessimas, total);
        System.out.println("O percentual das notas sobre o total de " + total + " votos foram:\n otimas: " + x + "%\n boas: " + y + "%\n ruins: " + z + "%\n pessimas: " + w + "%");
    }
}