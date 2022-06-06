package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Natália Bruno Rabelo
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adicione uma frase:");
        String frase = sc.nextLine();
        Map<String, Integer> palavrasDaFrase = new HashMap<>();
        String[] palavrasSplitadas = frase.split(" ");

        for (String palavra : palavrasSplitadas) {
            Integer integer = palavrasDaFrase.get(palavra);

            if (integer == null)
                palavrasDaFrase.put(palavra, 1);

            else {
                palavrasDaFrase.put(palavra, integer + 1);
            }
        }
        System.out.println(palavrasDaFrase);
    }
}
