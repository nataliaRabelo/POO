package com.company;
/**
 * @Author: Natália Bruno Rabelo.
 */

/**
 * Classe responsável por representar uma entidade Pessoa.
 */
public class Pessoa {
    private String nome;
    private int idade;

    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    /**
     * Método responsável por incrementar uma unidade no atributo idade
     * @return idade
     */
    public int fazerAniversario(){
        idade++;
        return idade;
    }

    public String getNome() {
        return this.nome;
    }
    public int getIdade() {
        return this.idade;
    }
}
