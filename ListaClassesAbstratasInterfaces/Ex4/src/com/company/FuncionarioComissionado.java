package com.company;

/**
 * @author Natália Bruno Rabelo
 * Esta classe é responsável por representar uma entidade Funcionario comissionado.
 */
public class FuncionarioComissionado implements CalculadorDeGanhos{

    private double valorTotalDosProdutosVendidos;
    private static final double percentualDeComissao = 0.05;

    public FuncionarioComissionado(double valorTotalDosProdutosVendidos){
        this.valorTotalDosProdutosVendidos = valorTotalDosProdutosVendidos;
    }

    @Override
    public void calcularGanhos() {
        double resultado = this.valorTotalDosProdutosVendidos * percentualDeComissao;
        System.out.println("Ganhos: " + resultado);
        System.out.println("---------------------------------------");
    }

    public double getValorTotalDosProdutosVendidos(){
        return this.valorTotalDosProdutosVendidos;
    }

    public double getpercentualDeComissao(){
        return percentualDeComissao;
    }
}
