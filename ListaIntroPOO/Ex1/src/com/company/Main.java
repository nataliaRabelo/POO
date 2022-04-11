package com.company;

import java.util.Scanner;


/**
 * @Author: Natália Bruno Rabelo.
 */


public class Main {
    /**
     * Método responsável por ler a decisão do usuario sobre adicionar ou remover um contato à agenda ou sair do programa.
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int decisao = 1;
        while (decisao == 1 || decisao == 2) {
            System.out.print("Deseja adicionar ou remover um contato a sua agenda? tecle 1 (adicionar) ou 2 (remover) ou 3 (sair da agenda)\n");
            decisao = myObj.nextInt();
            if (decisao == 1) {
                System.out.print("Digite nome, email e numero do seu novo contato:\n");
                agenda.adicionarContato();
            } else if (decisao == 2) {
                System.out.print("Digite nome, email e numero do contato a ser excluido:\n");
                agenda.removerContato();
            }

        }
    }
}