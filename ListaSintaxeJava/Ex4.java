package com.company;

/**
 * @Author: Natália Bruno Rabelo.
 */
public class Main {
    /**
     * Essa função é responsável por verificar quais são os números múltiplos de 3 contidos no intervalo entre os números de 1 a 100.
     */
    public static void main(String[] args) {
        System.out.println("Os numeros multiplos de 3 do intervalo de 1 a 100 sao:");
        for (int i=1; i <= 100; i++){
            if (i % 3 == 0){
                System.out.println(i);
            }

        }
    }
}
