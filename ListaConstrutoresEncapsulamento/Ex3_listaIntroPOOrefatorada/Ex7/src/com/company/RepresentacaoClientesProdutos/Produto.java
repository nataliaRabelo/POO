package com.company.RepresentacaoClientesProdutos;

/**
 * @author Natália Bruno Rabelo.
 */


/**
 * Esta classe é responsável por representar uma entidade Produto.
 */
public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double d) {
        this.nome = nome;
        this.preco = d;
    }

    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }
}

