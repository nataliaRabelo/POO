package com.company;


import java.util.Calendar;
import java.util.Scanner;

/**
 * @author Natália Bruno Rabelo.
 */
public class Main {


    public static void main(String[] args) {
        int decisao = 1;
        while (decisao == 1){
            System.out.println("Bem-vindo a agenda!\nDeseja adicionar algum compromisso a sua agenda?");
            Calendar dataDoCompromisso = null;
            Scanner sc = new Scanner(System.in);
            decisao = sc.nextInt();
            if(decisao == 1){
                System.out.println("Digite o nome do seu compromisso:");
                String titulo = sc.nextLine();
                System.out.println("Digite a descricao do seu compromisso:");
                String descricao = sc.nextLine();
                System.out.println("Digite o local do seu compromisso:");
                String local = sc.nextLine();
                System.out.println("Agora digite o ano, mes e  local do seu compromisso:");
                int ano = sc.nextInt();
                int mes = sc.nextInt();
                int dia = sc.nextInt();
                dataDoCompromisso.set(ano, mes, dia); //ordem de data americana set(int year, int month, int date), conforme mostra documentacao
                Compromisso compromisso = new Compromisso(titulo, descricao, local, dataDoCompromisso);
                //TODO: fazer metodo de adicao de compromisso na classe Agenda.
                //TODO: fazer metodo de mudanca de contatos na classe Agenda com escolhas do usuario dentro deste metodo.
                //TODO: fazer metodo de traducao de contatos na classe Agenda com escolhas do usuario dentro deste metodo.
                
            }

        }
    }
}
