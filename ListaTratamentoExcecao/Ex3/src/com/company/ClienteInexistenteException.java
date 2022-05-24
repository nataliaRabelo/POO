package com.company;

/**
 * @author Natália Bruno Rabelo.
 * Esta exceção deve ser lançada quando um cliente buscado no registro inexistir.
 */
public class ClienteInexistenteException extends Exception{

    public ClienteInexistenteException(String mensagem){
        super(mensagem);
    }
}
