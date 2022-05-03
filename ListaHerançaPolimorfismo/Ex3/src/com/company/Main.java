package com.company;

import com.company.Pessoas.PessoaFisica;
import com.company.Pessoas.PessoaJuridica;
import com.company.PessoasUFF.Aluno;
import com.company.PessoasUFF.Funcionario;
import com.company.PessoasUFF.Professor;

import java.util.Scanner;

/**
 * @author Natália Bruno Rabelo
 */
public class Main {

    public static void main(String[] args) {
        int decisao = 1;
        Scanner sc = new Scanner(System.in);
        while (decisao == 1 || decisao == 2 || decisao == 3 || decisao ==  4 || decisao == 5 || decisao == 6){
            System.out.println("Deseja realizar alguma atividade com sua agenda?\nDigite 1 (add pessoa juridica) ou 2 (add pessoa fisica) ou 3 (add funcionario) ou 4 (add professor) ou 5 (add aluno)  ou 6 (buscar pessoa por CPF ou CNPJ) ou 0 (encerrar programa)");
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
                    Evento.getInstanciaEvento().adicionarPessoa(pessoaJuridica);
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
                    Evento.getInstanciaEvento().adicionarPessoa(pessoaFisica);
                    break;
                case 3:
                    System.out.println("Voce escolheu Funcionario.\nDigite o endereco:");
                    sc.nextLine();
                    String endereco3 = sc.nextLine();
                    System.out.println("Digite o nome:");
                    String nome2 = sc.nextLine();
                    System.out.println("Digite o cpf:");
                    int cpf2 = sc.nextInt();
                    System.out.println("Digite a data de aniversario:");
                    sc.nextLine();
                    String dataDeAniver2 = sc.nextLine();
                    System.out.println("Digite o email:");
                    String email2 = sc.nextLine();
                    System.out.println("Digite o numero de matricula:");
                    int matricula = sc.nextInt();
                    System.out.println("Digite o cargo:");
                    sc.nextLine();
                    String cargo = sc.nextLine();
                    Funcionario funcionario = new Funcionario(endereco3, nome2, cpf2, dataDeAniver2, matricula, email2, cargo);
                    Evento.getInstanciaEvento().adicionarPessoa(funcionario);
                    break;
                case 4:
                    System.out.println("Voce escolheu Professor.\nDigite o endereco:");
                    sc.nextLine();
                    String endereco4 = sc.nextLine();
                    System.out.println("Digite o nome:");
                    String nome3 = sc.nextLine();
                    System.out.println("Digite o cpf:");
                    int cpf3 = sc.nextInt();
                    System.out.println("Digite a data de aniversario:");
                    sc.nextLine();
                    String dataDeAniver3 = sc.nextLine();
                    System.out.println("Digite o email:");
                    String email3 = sc.nextLine();
                    System.out.println("Digite o numero de matricula:");
                    int matricula2 = sc.nextInt();
                    System.out.println("Digite o departamento:");
                    sc.nextLine();
                    String departamento = sc.nextLine();
                    Professor professor = new Professor(endereco4, nome3, cpf3, dataDeAniver3, matricula2, email3, departamento);
                    Evento.getInstanciaEvento().adicionarPessoa(professor);
                    break;
                case 5:
                    System.out.println("Voce escolheu Aluno.\nDigite o endereco:");
                    sc.nextLine();
                    String endereco5 = sc.nextLine();
                    System.out.println("Digite o nome:");
                    String nome4 = sc.nextLine();
                    System.out.println("Digite o cpf:");
                    int cpf4 = sc.nextInt();
                    System.out.println("Digite a data de aniversario:");
                    sc.nextLine();
                    String dataDeAniver4 = sc.nextLine();
                    System.out.println("Digite o email:");
                    String email4 = sc.nextLine();
                    System.out.println("Digite o numero de matricula:");
                    int matricula3 = sc.nextInt();
                    System.out.println("Digite o curso:");
                    sc.nextLine();
                    String curso = sc.nextLine();
                    Aluno aluno = new Aluno(endereco5, nome4, cpf4, dataDeAniver4, matricula3, email4, curso);
                    Evento.getInstanciaEvento().adicionarPessoa(aluno);
                    break;
                case 6:
                    System.out.println("Digite o CNPJ ou CPF do seu contato:");
                    int numero = sc.nextInt();
                    Evento.getInstanciaEvento().buscarPessoa(numero);
                    break;
                default:
                    break;
            }
        }
    }
}

