package com.company;

/**
 * @author Natália Bruno Rabelo
 * Esta classe é responsável por representar uma entidade Item de Venda.
 */
public class ItemVenda implements Recebivel{

    private String produto;
    private int quantidade;
    private double precoUnitario;
    private double valorTotal;

    public ItemVenda(String produto, int quantidade, double precoUnitario) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    /**
     * Este método é responsável por calcular a receita total de um objeto Item de Venda e atribuir este valor ao atributo valorTotal.
     */
    @Override
    public void totalizarReceita() {

        this.valorTotal = this.quantidade * this.precoUnitario;

    }

    public String getProduto(){
        return this.produto;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public double getPrecoUnitario() {
        return this.precoUnitario;
    }

    public double getValorTotal() {
        return this.valorTotal;
    }
}
