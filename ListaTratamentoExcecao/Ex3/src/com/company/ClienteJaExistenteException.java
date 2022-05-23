package com.company;

public class ClienteJaExistenteException extends Exception{

    public ClienteJaExistenteException(String mensagem){
        super(mensagem);
    }
}
