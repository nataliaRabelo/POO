package com.company;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: Natália Bruno Rabelo.
 */
public class Main {
    /**
     * Essa função é responsável por contar os números negativos lidos.
     * @param lista Array de inteiros.
     */
    public static void contaNegativos(ArrayList<Integer> lista){
        int count = 0;
        for (int i = 0; i < lista.size(); i++){
            int elemento = lista.get(i);
            if (elemento < 0){
                count++;
            }
        }
        System.out.println("A quantidade de numeros negativos lidos eh: " + count);
    }

    /**
     * Essa função é responsável por ler um número N e ler mais N números
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        for(int i=0; i < n;  i++){
            int num = myObj.nextInt();
            lista.add(num);
        }
        contaNegativos(lista);
    }
}
