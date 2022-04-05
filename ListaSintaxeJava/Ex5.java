package com.company;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: Natália Bruno Rabelo.
 */
public class Main {

    /**
     * @param n Essa função é responsável por calcular o fatorial de um dado valor N.
     */
    public static void calculaFatorial(int n){
        if (n == 0){
            System.out.println("O fatorial de " + n + " = 0");
        }
        else if (n > 0){
            ArrayList<Integer> lista = new ArrayList<Integer>();
            for (int i = n; i > 0 ; i--){
                lista.add(i);
            }
            int elementoAnterior = 0;
            for (int i = 0; i < lista.size(); i++){
                int elemento = lista.get(i);
                if (elementoAnterior == 0){
                    elementoAnterior = elemento;
                }
                else{
                    elementoAnterior *= elemento;
                }
            }
            System.out.println("O fatorial de " + n + " = " + elementoAnterior);
        }
        else{
            System.out.println("Não eh possível calcular o fatorial porque o numero lido eh negativo");
        }
    }

    /**
     * Essa função é responsável por ler um número N.
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        calculaFatorial(n);
    }
}
