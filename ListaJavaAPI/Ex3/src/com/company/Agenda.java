package com.company;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Natália Bruno Rabelo.
 */

/**
 * Classe responsável por administrar uma agenda de compromissos.
 */
public class Agenda {

    ArrayList<Compromisso> compromissos = new ArrayList();

    /**
     * Este método é responsável por adicionar um compromisso à agenda.
     * @param compromisso
     */
    public void adicionaCompromissoAgenda(Compromisso compromisso){
        compromissos.add(compromisso);
    }


    /**
     * Este método é responsável por formatar e traduzir e imprimir compromissos da Agenda a depender da escolha do usuário.
     */
    public void imprimirFormatosIdiomas(){
        System.out.println("Agora, como deseja imprimir os seus compromissos da sua agenda?");
        System.out.println("Digite 1 (data em numeros na versao portugues) ou 2 (data por extenso na versao portugues) ou 3 (data em numeros na versao ingles) ou 4 (data por extenso na versao ingles)");
        Scanner sc = new Scanner(System.in);
        int decisao = sc.nextInt();
        if (decisao == 1) {
            for (Compromisso compromisso : compromissos){
                int count =  compromissos.indexOf(compromisso) + 1;
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", new Locale("pt", "BR"));
                String dataFormatada = compromisso.getData().format(formatter);
                System.out.println("----------------------------- Compromisso " + count + " -----------------------------");
                System.out.println("Titulo: " + compromisso.getTitulo() + "\nDescricao: " + compromisso.getDescricao() + "\nLocal: " + compromisso.getLocal() + "\nData: " + dataFormatada);
                System.out.println("-------------------------------------------------------------------------------------\n");
            }
        }
        else if (decisao == 2) {
            for (Compromisso compromisso : compromissos) {
                int count =  compromissos.indexOf(compromisso) + 1;
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' uuuu", new Locale("pt", "BR"));
                String dataFormatada = compromisso.getData().format(formatter);
                System.out.println("----------------------------- Compromisso " + count + " -----------------------------");
                System.out.println("Titulo: " + compromisso.getTitulo() + "\nDescricao: " + compromisso.getDescricao() + "\nLocal: " + compromisso.getLocal() + "\nData: " + dataFormatada);
                System.out.println("-------------------------------------------------------------------------------------\n");
            }
        }
        else if (decisao == 3) {
            for (Compromisso compromisso : compromissos) {
                int count =  compromissos.indexOf(compromisso) + 1;
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy", new Locale("en", "EUA"));
                String dataFormatada = compromisso.getData().format(formatter);
                System.out.println("----------------------------- Compromisso " + count + " -----------------------------");
                System.out.println("Titulo: " + compromisso.getTitulo() + "\nDescricao: " + compromisso.getDescricao() + "\nLocal: " + compromisso.getLocal() + "\nData: " + dataFormatada);
                System.out.println("-------------------------------------------------------------------------------------\n");
            }
        }
        else if (decisao == 4) {
            for (Compromisso compromisso : compromissos) {
                int count =  compromissos.indexOf(compromisso) + 1;
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d',' uuuu", new Locale("en", "EUA"));
                String dataFormatada = compromisso.getData().format(formatter);
                System.out.println("----------------------------- Compromisso " + count + " -----------------------------");
                System.out.println("Titulo: " + compromisso.getTitulo() + "\nDescricao: " + compromisso.getDescricao() + "\nLocal: " + compromisso.getLocal() + "\nData: " + dataFormatada);
                System.out.println("-------------------------------------------------------------------------------------\n");
            }
        }
    }
}
