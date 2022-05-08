package com.company;

import java.util.Scanner;

/**
 * @author Natália Bruno Rabelo
 */
public class Main {

    public static void main(String[] args) {

        DiaDaSemana dia = new DiaDaSemana(DiaDaSemana.Dia.DOMINGO);
        int decisao = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("O dia da semana atual eh: " + dia.getDia());
        while(decisao == 1) {
            System.out.println("Deseja fazer o mes passar? Digite 1 (sim) ou 0 (nao)");
            decisao = sc.nextInt();
            dia.fazerDiaPassar(dia);
            dia.ehDiaUtil(dia);

        }

    }
}
