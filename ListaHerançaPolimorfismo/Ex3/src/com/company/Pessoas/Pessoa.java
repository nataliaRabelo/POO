package com.company.Pessoas;

/**
 * @author Natália Bruno Rabelo
 * Esta classe é responsável por representar superclasse Pessoa.
 */
public class Pessoa {

    private String endereco;


    public Pessoa(String endereco) {
        this.endereco = endereco;


    }

    public String getEndereco(){
        return this.endereco;
    }
}
