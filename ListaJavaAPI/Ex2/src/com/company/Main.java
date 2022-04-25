package com.company;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Natália Bruno Rabelo.
 */
public class Main {

    /**
     * Este método é responsável por fazer os meses do ano passar conforme um index de uma lista de meses que incrementa na medida em que o ususario interaje com o programa.
     * @param i
     * @return i
     */
    public static int fazerMesPassar(int i){

        if (i == 11){
            i = 0;
        }
        else{
            i++;
        }
        return i;
    }
    public static void main(String[] args) {

        String[] meses = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        ProcessadorDeBoletos processadorDeBoletos = new ProcessadorDeBoletos();
        System.out.println("Bem-vindo ao mundo, digite seu nome");
        Scanner obj = new Scanner(System.in);
        String nome = obj.nextLine();
        int decisao = 1;
        int i = 0; // indice criado para os meses
        while(decisao == 1){
            System.out.println("Deseja dar continuidade ao programa? Digite 1 (sim) e 0 (encerrar programa)");
            decisao = obj.nextInt();
            switch (decisao){
                case 1:
                    System.out.println("Chegou uma fatura! :O :(\n");
                    int faturaDoMes = MathRandomWithSeed.generateRandomFatura(); // Gerando numeros aleatorios para os valores totais das faturas geradas a cada mês.
                    Fatura fatura = new Fatura(meses[i], nome, faturaDoMes);
                    processadorDeBoletos.adicionarFaturaAoProcessador(fatura);
                    System.out.println("A sua fatura foi adicionada ao registro de faturas!");
                    processadorDeBoletos.imprimirFaturas();
                    int decisao2 = 1;
                    while(decisao2 == 1){
                        System.out.println("Digite 1 (pagar alguma fatura acumulada) ou 2 (passar proximo mes)");
                        decisao2 = obj.nextInt();
                        switch (decisao2){
                            case 1:
                                System.out.println("Qual boleto deseja pagar? Digite o seu numero.");
                                processadorDeBoletos.imprimirFaturas();
                                int n = obj.nextInt();
                                Fatura faturaBuscada = processadorDeBoletos.buscarFatura(n);
                                if(faturaBuscada != null){ //Tratando exceção caso usuario nao digite nenhum numero de index valido para as faturas.
                                    System.out.println("Qual valor deseja pagar neste boleto?");
                                    double valorPago = obj.nextDouble();
                                    Boleto boleto = new Boleto(MathRandomWithSeed.generateRandomFatura(), meses[i], valorPago, faturaBuscada); // Gerando numeros aleatorios para os códigos de cada boleto.
                                    processadorDeBoletos.adicionarBoletoAoProcessador(boleto);
                                    Fatura faturaDoBoleto = boleto.getFatura();
                                    faturaDoBoleto.setValorPago(valorPago);
                                    faturaDoBoleto.setEstaPaga();
                                    faturaBuscada.setBoletosAssociados(faturaBuscada, processadorDeBoletos);
                                }
                                break;
                            case 2:
                                int j = fazerMesPassar(i);
                                i = j;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
