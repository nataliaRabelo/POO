package com.company;

/**
 * @author Natália Bruno Rabelo
 * Esta classe é responsável por representar uma entidade Servico.
 */
public class Servico implements Recebivel{

    private String descricao;
    private int horas;
    private double precoHora;
    private double valorTotal;

    public Servico(String descricao, int horas, double precoHora) {
        this.descricao =  descricao;
        this.horas = horas;
        this.precoHora = precoHora;
    }

    /**
     * Este método é responsável por calcular a receita total de um objeto Servico e atribuir este valor ao atributo valorTotal.
     */
    @Override
    public void totalizarReceita() {

        this.valorTotal = this.horas * this.precoHora;

    }

    public String getDescricao() {
        return this.descricao;
    }

    public int getHoras() {
        return this.horas;
    }

    public double getPrecoHora() {
        return this.precoHora;
    }

    public double getValorTotal() {
        return this.valorTotal;
    }
}
