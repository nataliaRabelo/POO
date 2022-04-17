package com.company;
/**
 * @Author: Natália Bruno Rabelo.
 */


/**
 * Classe responsável por representar uma entidade Contato.
 */
public class Contato {

    private String nome;
    private String email;
    private String numero;

    Contato(String nome, String email, String numero){
        this.nome = nome;
        this.email = email;
        this.numero = numero;
    }

    public String getNome() {
        return this.nome;
    }
    public String getEmail() {
        return this.email;
    }
    public String getNumero() {
        return this.numero;
    }
}
