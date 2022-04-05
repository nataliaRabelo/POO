package com.company;

/**
 * @Author: Natália Bruno Rabelo.
 */
public class Main {

    /**
     * @param n Essa função é responsável por calcular o número da sequência de Fibonacci correspondente ao número lido através da fórmula recursiva.
     * @return exec(n - 1) + exec(n - 2)
     */
    public static int exec(long n) {
        if (n == 1 || n == 2) {
            return 1;
        } else
            return exec(n - 1) + exec(n - 2);

    }

    /**
     * Essa função é responsável por gerar n números do intervalo de 1 a 101 e printar o resultado correspondente à f(n).
     */
    public static void main(String[] args) {

        long i = 1, limite = 14;
        while (i <= limite) {
            System.out.println("f("+ i + ") = " + exec(i) + "\n");
            i++;
        }
    }
}