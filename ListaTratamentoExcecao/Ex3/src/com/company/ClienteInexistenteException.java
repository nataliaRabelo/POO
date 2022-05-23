package com.company;

public class ClienteInexistenteException extends Exception{

    public ClienteInexistenteException(String mensagem){
        super(mensagem);
    }
}
