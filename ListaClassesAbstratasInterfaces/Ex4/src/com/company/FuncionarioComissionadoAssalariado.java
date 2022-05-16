package com.company;

/**
 * @author Natália Bruno Rabelo
 * Esta classe é responsável por representar uma entidade Funcionario comissionado-assalariado.
 */
public class FuncionarioComissionadoAssalariado extends Funcionario implements CalculadorDeGanhos{

    private double valorTotalDosProdutosVendidos;
    private static final double percentualDeComissao = 0.05;
    private static final double percentualDeRecompensa = 0.10;

    public FuncionarioComissionadoAssalariado(double salario, double valorTotalDosProdutosVendidos) {
        super(salario);
        this.valorTotalDosProdutosVendidos = valorTotalDosProdutosVendidos;
    }

    @Override
    public void calcularGanhos() {
        double bonusDeSalarioComPercentualDeRecompensa = this.salario * percentualDeRecompensa;
        double resultado = this.salario + bonusDeSalarioComPercentualDeRecompensa + this.valorTotalDosProdutosVendidos * percentualDeComissao;
        System.out.println("Ganhos: " + resultado);
        System.out.println("---------------------------------------");

    }

    public double getValorTotalDosProdutosVendidos(){
        return this.valorTotalDosProdutosVendidos;
    }

    public double getpercentualDeComissao(){
        return percentualDeComissao;
    }

    public double getPercentualDeRecompensa(){
        return percentualDeRecompensa;
    }

}
