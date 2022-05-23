package com.company;

public class DadoInvalidoException extends IllegalArgumentException{

    public DadoInvalidoException(String mensagem){
        super(mensagem);
    }
}
