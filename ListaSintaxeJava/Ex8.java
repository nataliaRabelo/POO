package com.company;

import java.util.Scanner;

/**
 * @Author: Natália Bruno Rabelo.
 */
public class Main {


    /**
     * Essa função é responsável por verificar se a matriz lida é um quadrado mágico.
     * @param n .
     * @param matriz .
     * @return boolean .
     */
    public static boolean ehQuadradoMagico(int n,  int[][] matriz){
        int soma = 0;
        for (int i = 0; i < n; i++){
            soma += matriz[0][i];
        }
        for (int i = 1; i < n ; i++ ){
            int somaLinha = 0;
            for (int j = 0; j < n; j++){
                somaLinha += matriz[i][j];
            }
            if(somaLinha != soma){
                return false;
            }
        }
        for (int i = 0; i < n ; i++ ){
            int somaColuna = 0;
            for (int j = 0; j < n; j++){
                somaColuna += matriz[j][i];
            }
            if(somaColuna != soma){
                return false;
            }
        }
        int somaDiagonalPrimaria = 0;
        int somaDiagonalSecundaria = 0;
        for (int i = 0, j = n-1; i < n; i++, j--){
            somaDiagonalPrimaria += matriz[i][i];
            somaDiagonalSecundaria += matriz[j][j];
        }
        if(soma != somaDiagonalPrimaria || soma != somaDiagonalSecundaria){
            return false;
        }
        return true;
    }

    /**
     * Essa função é responsável por ler uma matriz de ordem n e imprimir se esta é um quadrado mágico ou não chamando a função ehQuadradoMagico.
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        int[][] matriz = new int[100][100];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                matriz[i][j] = myObj.nextInt();

            }
        }
        if(ehQuadradoMagico(n, matriz) == true){
            System.out.println("Essa matriz eh um quadrado magico");
        }
        else if(ehQuadradoMagico(n, matriz) == false){
            System.out.println("Essa matriz nao eh um quadrado magico");
        }
    }
}