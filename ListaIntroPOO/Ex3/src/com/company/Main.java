package com.company;

import java.util.Scanner;

/**
 * @author Natália Bruno Rabelo
 */

public class Main {

    /**
     * Este método é responsável por ler os atributos da porta, ler a decisao do usuario e executar os métodos implementados na classe Porta conforme a decisao digitada.
     */
    public static void main(String[] args) {
	    Porta porta = new Porta();
        System.out.println("Voce acabou de criar uma porta, a personalize digitando a sua cor, comprimento e largura:");
        Scanner myObj = new Scanner(System.in);
        porta.cor = myObj.nextLine();
        porta.comprimento = myObj.nextInt();
        porta.largura = myObj.nextInt();
        System.out.println("Os atributos atuais da sua porta sao:");
        System.out.println("cor: " + porta.cor);
        System.out.println("comprimento: " + porta.comprimento);
        System.out.println("largura: " + porta.largura);
        int decisao = 1;
        while(decisao == 1 || decisao == 2 || decisao == 3 || decisao == 4 || decisao == 5){
            Scanner myObj2 = new Scanner(System.in);
            System.out.println("Concluido! E agora? deseja fazer mais algo com a sua porta?");
            System.out.println("Digite 1 (abrir porta) ou 2 (fechar porta) ou 3 (verificar se esta aberta) ou 4 (editar dimensao) ou 5 (editar cor) ou 6 (encerrar programa)");
            decisao = myObj2.nextInt();
            if(decisao == 1){
                porta.abrirPorta();
            }
            else if(decisao == 2){
                porta.fecharPorta();
            }
            else if(decisao == 3){
                porta.estaAberta();
            }
            else if(decisao == 4){
                porta.editarDimensao();
            }
            else if(decisao == 5){
                porta.editarCor();
            }
        }
    }
}
