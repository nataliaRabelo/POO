package com.company;

import java.io.Serializable;

/**
 * @author Natália Bruno Rabelo
 * Classe responsável por representar uma entidade Cliente.
 */
public class Cliente implements Serializable {

    private String nome;
    private String cpf;

    /**
     * Construtor alternativo para inicializar uma instância de Cliente.
     */
    public Cliente(){

    }

    /**
     * Construtor padrão de Cliente.
     * @param nome
     * @param cpf
     */
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return new StringBuffer(" nome: ").append(this.nome)
                .append("Cpf: ").append(this.cpf).toString();
    }
}
