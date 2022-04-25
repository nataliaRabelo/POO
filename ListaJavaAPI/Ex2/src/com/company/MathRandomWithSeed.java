package com.company;

/**
 * @author Natália Bruno Rabelo.
 */

/**
 * Esta classe é responsável por conter métodos relacionados à geração de números aleatórios.
 */
public class MathRandomWithSeed {

    /**
     * Este método é responsável por determinar um número mínimo, máximo e inicializar uma seed para geração de numeros aleatórios a partir dessa seed.
     * @return int random;
     */
    public static int generateRandomFatura (){

        int min = 100;
        int max = 5000;
        int seed = 5;

        int random = randomNext(min, max, seed);

        return random;
    }

    /**
     * Este método é responsável por gerar números aleatórios a partir do mínimo, máximo e a seed determinadas na função generateRandomFatura().
     * @param min
     * @param max
     * @param seed
     * @return
     */
    private static int randomNext(int min, int max, int seed){

        int count = (max - min) / seed;

        int random = ((int)(count * Math.random()) * seed) + min;

        return random;
    }
}
