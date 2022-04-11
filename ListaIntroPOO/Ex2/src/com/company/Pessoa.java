package com.company;
/**
 * @Author: Natália Bruno Rabelo.
 */

/**
 * Classe responsável por representar uma entidade Pessoa.
 */
public class Pessoa {
    String nome;
    int idade;

    /**
     * Método responsável por incrementar uma unidade no atributo idade
     * @return idade
     */
    public int fazerAniversario(){
        idade++;
        return idade;
    }
}
