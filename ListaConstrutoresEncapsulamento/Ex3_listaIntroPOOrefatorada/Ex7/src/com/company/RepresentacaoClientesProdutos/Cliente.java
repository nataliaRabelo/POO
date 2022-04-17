package com.company.RepresentacaoClientesProdutos;

/**
 * @author Natália Bruno Rabelo.
 */


/**
 * Esta classe é responsável por representar uma entidade Cliente.
 */
public class Cliente {
    private String nome;
    private String meioDePagamento;

    public Cliente(String nome, String meioDePagamento) {
        this.nome = nome;
        this.meioDePagamento =  meioDePagamento;
    }

    public String getNome() {
        return this.nome;
    }

    public String getMeioDePagamento() {
        return this.meioDePagamento;
    }
}
