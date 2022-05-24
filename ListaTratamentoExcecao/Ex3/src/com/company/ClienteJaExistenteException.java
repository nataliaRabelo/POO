package com.company;

/**
 * @author Natália Bruno Rabelo.
 * Esta exceção deve ser lançada quando uma instância de Cliente criada tiver o mesmo cpf de um cliente já regostrado.
 */
public class ClienteJaExistenteException extends Exception{

    public ClienteJaExistenteException(String mensagem){
        super(mensagem);
    }
}
