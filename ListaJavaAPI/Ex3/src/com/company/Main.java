package com.company;


import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * @author Natália Bruno Rabelo.
 */
public class Main {


    public static void main(String[] args) {
        int decisao = 1;
        Agenda agenda = new Agenda();
        System.out.println("Bem-vindo a agenda!");
        while (decisao == 1){
            System.out.println("Deseja adicionar algum compromisso a sua agenda? Voce ainda pode adicionar outros depois de confirmar.\nDigite 1 (sim) ou 2 (nao).");
            Scanner sc = new Scanner(System.in);
            decisao = sc.nextInt();
            if(decisao == 1){
                System.out.println("Digite o nome do seu compromisso:");
                sc.nextLine();
                String titulo = sc.nextLine();
                System.out.println("Digite a descricao do seu compromisso:");
                String descricao = sc.nextLine();
                System.out.println("Digite o local do seu compromisso:");
                String local = sc.nextLine();
                System.out.println("Agora digite o ano, mes e dia do seu compromisso a cada linha:\nAno:");
                int ano = sc.nextInt();
                System.out.println("Mes:");
                int mes = sc.nextInt();
                System.out.println("Dia:");
                int dia = sc.nextInt();
                int hora = 0;
                int minuto = 0;
                LocalDateTime dataDoCompromisso = LocalDateTime.of(ano, mes, dia, hora, minuto);
                Compromisso compromisso = new Compromisso(titulo, descricao, local, dataDoCompromisso);
                agenda.adicionaCompromissoAgenda(compromisso);
                System.out.println("Seu compromisso foi adicionado a agenda!\n");
                }
            int decisao2 = 1;
            while (decisao2 == 1 && decisao !=1){
                System.out.println("Deseja traduzir ou formatar os seus contatos?\nDigite 1 (sim) ou 2 (nao)");
                decisao2 = sc.nextInt();
                if(decisao2 == 1){
                    agenda.imprimirFormatosIdiomas();
                }
            }

            }
        }

    }
