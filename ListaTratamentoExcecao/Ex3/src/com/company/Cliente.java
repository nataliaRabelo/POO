package com.company;

import java.math.BigInteger;

public class Cliente {

    private String cpf;
    private String nome;

    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    public Cliente(){

    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        int qtdEspacos = 0;
        for(int i = 0; i < nome.length(); i++){
            char elemento = nome.charAt(i);
            if(elemento == ' '){
                qtdEspacos+=1;
            }
        }
        if (qtdEspacos == 0){
            throw new DadoInvalidoException("Nome invalido. O nome precisa conter tambem sobrenome");
        }
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        if(cpf.length() != 11){
            throw new DadoInvalidoException("Cpf invalido. O cpf precisa ter exatamente 11 digitos.");
        }
        this.cpf = cpf;
    }
}
