package com.company;

import java.util.Scanner;


/**
 * @Author: Natália Bruno Rabelo.
 */
public class Main {
    /**
     * Método responsável por ler o nome e idade de uma instância da classe Pessoa e ler a decisão do usuário sobre o desejo dessa pessoa fazer aniversário.
     */
    public static void main(String[] args) {
            int decisao = 1;
            System.out.print("Bem-vindo ao the sims idade da pedra, voce acabou de criar uma pessoa, digite seu nome e idade:\n");
            Scanner myObj = new Scanner(System.in);
            String nome = myObj.nextLine();
            int idade = myObj.nextInt();
            Pessoa novaPessoa = new Pessoa(nome, idade);
            while (decisao == 1) {
                System.out.print("Quer que " + novaPessoa.getNome() + " faca aniversario? tecle 1 (sim) ou 2 (nao) \n");
                decisao = myObj.nextInt();
                if (decisao == 1){
                    novaPessoa.fazerAniversario();
                    System.out.print("A idade de " + novaPessoa.getNome() + "atual eh: " + novaPessoa.getIdade() + "\n");
                }
                else if(decisao == 2){
                    System.out.print("Ate a proxima rodada entao!");
                }
            }
        }
    }
