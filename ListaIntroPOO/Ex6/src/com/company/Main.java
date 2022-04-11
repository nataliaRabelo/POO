package com.company;

import java.util.Scanner;

/**
 * @author Natália Bruno Rabelo
 */

/**
 * Este método é responsável por realizar a ordenação inicial do baralho ler a decisao do usuario sobre embaralhar ou desembaralhar o baralho.
 */
public class Main {

    public static void main(String[] args) {
        Scanner myObj =  new Scanner(System.in);
        Baralho baralho = new Baralho();
        CartasOuro cartasOuro = new CartasOuro();
        CartasEspada cartasEspada = new CartasEspada();
        CartasCopas cartasCopas = new CartasCopas();
        CartasPaus cartasPaus = new CartasPaus();
        int decisao = 1;
        System.out.println("\nSeu baralho acabou de ser criado! Os naipes ouro, espadas, copas e paus sao iniciados na seguinte ordem:");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
        cartasOuro.preencherNaipeOuro();
        cartasEspada.preencherNaipeEspada();
        cartasCopas.preencherNaipeCopas();
        cartasPaus.preencherNaipePaus();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Agora, vamos inserir esses naipes no seu baralho! A ordem dos naipes atual conforme o jogo Poker eh:");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
        baralho.ordenarBaralho(cartasOuro, cartasEspada, cartasCopas, cartasPaus);
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
        while(decisao == 1 || decisao == 2){
            System.out.println("\nE agora? Deseja fazer o que com seu baralho? Digite 1 (ordenar) ou digite 2 (embaralhar) ou 3 (encerrar programa):");
            decisao = myObj.nextInt();
            if(decisao == 1){
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
                baralho.ordenarBaralho(cartasOuro, cartasEspada, cartasCopas, cartasPaus);
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
            }
            else if(decisao == 2){
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
                baralho.embaralharBaralho();
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
            }
        }

    }
}
