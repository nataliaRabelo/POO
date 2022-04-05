package com.company;

import java.util.Scanner;
/**
 * @Author: Natália Bruno Rabelo.
 */
public class Main {
    /**
     * Essa função é responsável por ler três núumeros e verificar qual é o maior.
     * @param lista Array de inteiros.
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int maiorNum = 0;
        for(int i=0; i < 3;  i++){
            int num = myObj.nextInt();
            if (i == 0 || maiorNum < num){
                maiorNum = num;
            }
        }
        System.out.println("O maior numero lido eh: " + maiorNum);
    }
}
