package com.company;

import java.util.Scanner;

/**
 * @author Natália Bruno Rabelo
 */
public class Main {

    /**
     * Este método é responsável por ler as decisoes do usuario conforme o menu da TV.
     */
    public static void main(String[] args) {

        Televisao tv = new Televisao();
        Scanner myObj = new Scanner(System.in);
        int decisaoLigar = 0;
        System.out.println("Hora de assistir televisao, antes de mais nada, deseja ligar a sua TV? Digite 1 (sim) ou 2 (nao)");
        decisaoLigar = myObj.nextInt();
        if (decisaoLigar == 1) {
            tv.ligarTv();
        } else {
            System.out.println("Que pena, fica para a proxima!");
        }
        while (tv.estado == true) {
            Scanner myObj2 = new Scanner(System.in);
            int decisao = 0;
            System.out.println("-------------------------- MENU TV -----------------------------");
            System.out.println("Qual das configuracoes deseja acessar? Digite o numero indicado em cada campo para escolher.\n");
            System.out.println("1 - Desligar");
            System.out.println("2 - Opcoes de canal");
            System.out.println("3 - Opcoes de volume");
            decisao = myObj2.nextInt();
            if(decisao == 1){
                tv.desligarTv();
            }
            else if(decisao == 2){
                System.out.println("-------------------------- MENU CANAL -----------------------------");
                System.out.println("Qual das opcoes deseja escolher? Digite o numero indicado em cada campo para escolher.\n");
                System.out.println("1 - Proximo canal");
                System.out.println("2 - Voltar canal");
                System.out.println("3 - Escolher canal");
                decisao = myObj2.nextInt();
                if(decisao == 1){
                    if(tv.canal < 99) {
                        tv.proximoCanal();
                    }
                    else{
                        System.out.println("Canal nao encontrado\n");
                    }
                }
                else if(decisao == 2){
                    if(tv.canal > 0){
                        tv.antecessorCanal();
                    }
                    else{
                        System.out.println("Canal nao encontrado\n");
                    }
                }
                else if(decisao == 3){
                    tv.mudarCanal();
                }
            }
            else if(decisao == 3){
                System.out.println("-------------------------- MENU VOLUME -----------------------------");
                System.out.println("Qual das opcoes deseja escolher? Digite o numero indicado em cada campo para escolher.\n");
                System.out.println("1 - Aumentar volume");
                System.out.println("2 - Diminuir volume");
                System.out.println("3 - Escolher volume");
                System.out.println("4 - Silenciar TV");
                System.out.println("5 - Desilenciar TV");
                decisao = myObj2.nextInt();
                if(decisao == 1){
                    if(tv.volume < 10){
                        tv.proximoVolume();
                    }
                    else{
                        System.out.println("Volume nao permitido\n");
                    }
                }
                else if(decisao == 2){
                    if(tv.volume > 0){
                        tv.antecessorVolume();
                    }
                    else{
                        System.out.println("Volume nao permitido\n");
                    }
                }
                else if(decisao == 3){
                    tv.mudarVolume();
                }
                else if(decisao == 4){
                    tv.silenciarTv();
                }
                else if(decisao == 5){
                    tv.desilenciarTv();
                }
            }
        }
    }
}
