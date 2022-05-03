package com.company;

import java.util.Scanner;

/**
 * @author Natália Bruno Rabelo
 */
public class Main {

    public static void main(String[] args) {
        int decisao = 1;
        Scanner sc = new Scanner(System.in);
        while (decisao == 1 || decisao == 2 || decisao == 3){
            System.out.println("Deseja realizar alguma atividade com sua agenda?\nDigite 1 (add pessoa juridica) ou 2 (add pessoa fisica) ou 3 (buscar pessoa) 0 (encerrar programa)");
            decisao = sc.nextInt();
            switch (decisao){
                case 1:
                    System.out.println("Voce escolheu Pessoa Juridica.\nDigite o endereco:");
                    sc.nextLine();
                    String endereco = sc.nextLine();
                    System.out.println("Digite a razao social:");
                    String razaoSocial = sc.nextLine();
                    System.out.println("Digite o cnpj:");
                    int cnpj = sc.nextInt();
                    System.out.println("Digite o faturamento:");
                    int faturamento = sc.nextInt();
                    PessoaJuridica pessoaJuridica = new PessoaJuridica(endereco, razaoSocial, cnpj, faturamento);
                    Agenda.getInstanciaAgenda().adicionarPessoa(pessoaJuridica);
                    break;
                case 2:
                    System.out.println("Voce escolheu Pessoa Fisica.\nDigite o endereco:");
                    sc.nextLine();
                    String endereco2 = sc.nextLine();
                    System.out.println("Digite o nome:");
                    String nome = sc.nextLine();
                    System.out.println("Digite o cpf:");
                    int cpf = sc.nextInt();
                    System.out.println("Digite a data de aniversario:");
                    sc.nextLine();
                    String dataDeAniver = sc.nextLine();
                    PessoaFisica pessoaFisica = new PessoaFisica(endereco2, nome, cpf, dataDeAniver);
                    Agenda.getInstanciaAgenda().adicionarPessoa(pessoaFisica);
                    break;
                case 3:
                    System.out.println("Digite o CNPJ ou CPF do seu contato:");
                    int numero = sc.nextInt();
                    Agenda.getInstanciaAgenda().buscarPessoa(numero);
                    break;
                default:
                    break;
            }
        }
    }
}

