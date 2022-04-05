package com.company;

/**
 * @Author: Natália Bruno Rabelo
 */
public class Main {
    /**
     *
     * Essa função é responsável por somar números de intervalo entre 1 e 999.
     */
    public static void main(String[] args) {
        int soma = 0;
        for (int i=0; i <= 999; i++){
            soma+=i;
        }
        System.out.println("A soma dos numeros de 1 a 999 eh: " + soma);
    }
}
