package com.company;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Natália Bruno Rabelo
 */
public class Main {

    public static void main(String[] args) {

        int decisao = 1;
        Scanner sc = new Scanner(System.in);
        ArrayList<CalculadorDeGanhos> funcionarios = new ArrayList<>();
        while (decisao == 1 ||decisao == 2 ||decisao == 3 || decisao == 4){
            System.out.println("Deseja adicionar algum funcionario?\nDigite 1 (Funcionado assalariado), 2 (Funcionado comissionado), 3 (Funcionario comissionado-assalariado), 4 (Funcionario pago por horas) ou 0 (continuar programa).");
            decisao = sc.nextInt();
            switch (decisao){
                case 1:
                    System.out.println("Você esta criando um funcionario assalariado.\nDigite o seu salario:");
                    double salario = sc.nextDouble();
                    FuncionarioAssalariado funcionarioAssalariado = new FuncionarioAssalariado(salario);
                    funcionarios.add(funcionarioAssalariado);
                    break;
                case 2:
                    System.out.println("Você esta criando um funcionario comissionado.\nDigite o valor total das suas vendas:");
                    double valorTotalVendas = sc.nextDouble();
                    FuncionarioComissionado funcionarioComissionado = new FuncionarioComissionado(valorTotalVendas);
                    funcionarios.add(funcionarioComissionado);
                    break;
                case 3:
                    System.out.println("Você esta criando um funcionario assalariado.\nDigite o seu salario:");
                    double salario2 = sc.nextDouble();
                    System.out.println("Digite o valor total das suas vendas:");
                    double valorTotalVendas2 = sc.nextDouble();
                    FuncionarioComissionadoAssalariado funcionarioComissionadoAssalariado = new FuncionarioComissionadoAssalariado(salario2, valorTotalVendas2);
                    funcionarios.add(funcionarioComissionadoAssalariado);
                    break;
                case 4:
                    System.out.println("Você esta criando um funcionario assalariado.\nDigite o seu salario:");
                    double salario3 = sc.nextDouble();
                    System.out.println("Digite as horas extras trabalhadas:");
                    int horasExtras = sc.nextInt();
                    FuncionarioPagoPorHoras funcionarioPagoPorHoras = new FuncionarioPagoPorHoras(salario3, horasExtras);
                    funcionarios.add(funcionarioPagoPorHoras);
                    break;
            }
        }
        int decisao2 = 1;
        while (decisao2 == 1 ||decisao2 == 2 ||decisao2 == 3 || decisao2 == 4) {
            System.out.println("Deseja calcular os ganhos dos seus funcionarios?\nDigite o tipo de funcionario desejado:\n1 (Funcionado assalariado), 2 (Funcionado comissionado), 3 (Funcionario comissionado-assalariado), 4 (Funcionario pago por horas) ou 0 (continuar programa).");
            decisao2 = sc.nextInt();
            switch (decisao2) {
                case 1:
                    int i = 1;
                    System.out.println("------------------------------- Funcionarios Assalariados -------------------------------");
                    for (CalculadorDeGanhos calculadorDeGanhos : funcionarios)
                        if (calculadorDeGanhos.getClass() == FuncionarioAssalariado.class) {
                            System.out.println("Funcionario " + i + ":\nSalario: " + ((FuncionarioAssalariado) calculadorDeGanhos).getSalario());
                            calculadorDeGanhos.calcularGanhos();
                            i++;
                        }
                    break;
                case 2:
                    int i2 = 1;
                    System.out.println("------------------------------- Funcionarios Comissionados -------------------------------");
                    for (CalculadorDeGanhos calculadorDeGanhos : funcionarios)
                        if (calculadorDeGanhos.getClass() == FuncionarioComissionado.class) {
                            System.out.println("Funcionario " + i2 + ":\nValor total das vendas: " + ((FuncionarioComissionado) calculadorDeGanhos).getValorTotalDosProdutosVendidos() + "\nPercentual de comissao: " + ((FuncionarioComissionado) calculadorDeGanhos).getpercentualDeComissao());
                            calculadorDeGanhos.calcularGanhos();
                            i2++;
                        }
                    break;
                case 3:
                    int i3 = 1;
                    System.out.println("------------------------------- Funcionarios Comissionados-assalariados -------------------------------");
                    for (CalculadorDeGanhos calculadorDeGanhos : funcionarios)
                        if (calculadorDeGanhos.getClass() == FuncionarioComissionadoAssalariado.class) {
                            System.out.println("Funcionario " + i3 + ":\nValor total das vendas: " + ((FuncionarioComissionadoAssalariado) calculadorDeGanhos).getValorTotalDosProdutosVendidos() + "\nPercentual de comissao: " + ((FuncionarioComissionadoAssalariado) calculadorDeGanhos).getpercentualDeComissao() + "\nSalario: " + ((FuncionarioComissionadoAssalariado) calculadorDeGanhos).getSalario() + "\nPercentual de recompensa: " + ((FuncionarioComissionadoAssalariado) calculadorDeGanhos).getPercentualDeRecompensa());
                            calculadorDeGanhos.calcularGanhos();
                            i3++;
                        }
                    break;
                case 4:
                    int i4 = 1;
                    System.out.println("------------------------------- Funcionarios pagos por hora -------------------------------");
                    for (CalculadorDeGanhos calculadorDeGanhos : funcionarios)
                        if (calculadorDeGanhos.getClass() == FuncionarioPagoPorHoras.class) {
                            System.out.println("Funcionario " + i4 + ":\nSalario: " + ((FuncionarioPagoPorHoras) calculadorDeGanhos).getSalario() + ":\nHoras extras trabalhadas: " + ((FuncionarioPagoPorHoras) calculadorDeGanhos).getHorasExtrasTrabalhadas());
                            calculadorDeGanhos.calcularGanhos();
                            i4++;
                        }
                    break;
            }


        }
    }
}
