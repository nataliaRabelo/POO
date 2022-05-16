package com.company;


import java.util.Scanner;

/**
 * @author Natália Bruno Rabelo
 */
public class Main {


    public static void main(String[] args) {
        int decisao = 1;
        Scanner sc = new Scanner(System.in);
        while (decisao == 1 || decisao == 2){
            System.out.println("Deseja adicionar algum recibo ao registro?\n1 (adicionar item vendido) ou 2 (adicionar servico) ou 0 (continuar programa)");
            decisao = sc.nextInt();
            switch (decisao){
                case 1:
                    System.out.println("Digite o nome do produto:");
                    sc.nextLine();
                    String produto = sc.nextLine();
                    System.out.println("Digite a quantidade do produto:");
                    int quantidade = sc.nextInt();
                    System.out.println("Digite o preco de uma unidade do produto:");
                    double precoUnitario = sc.nextDouble();
                    ItemVenda itemVenda = new ItemVenda(produto, quantidade, precoUnitario);
                    itemVenda.totalizarReceita();
                    RegistroRecebimentos.getinstanciaRegistroRecebimentos().adicionarRegistro(itemVenda);
                    break;
                case 2:
                    System.out.println("Digite a descricao do servico:");
                    sc.nextLine();
                    String descricao = sc.nextLine();
                    System.out.println("Digite as horas prestadas para realizar o servico:");
                    int horas = sc.nextInt();
                    System.out.println("Digite o preco por hora prestada pelo servico:");
                    double precoHora = sc.nextDouble();
                    Servico servico = new Servico(descricao, horas, precoHora);
                    servico.totalizarReceita();
                    RegistroRecebimentos.getinstanciaRegistroRecebimentos().adicionarRegistro(servico);
                    break;
            }
        }
        int decisao2 = 1;
        while (decisao2 == 1){
            System.out.println("Deseja totalizar as receitas da sua loja?\nDigite 1 (sim) ou 0 (encerrar programa)");
            decisao2 = sc.nextInt();
            switch (decisao2){
                case 1:
                    RegistroRecebimentos.getinstanciaRegistroRecebimentos().totalizarReceita();
                    break;
                default:
                    break;
            }
        }




    }
}
