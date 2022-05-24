package com.company;

/**
 * @author Natália Bruno Rabelo
 * Esta exceção deve ser lançada quando o registro de clientes estiver cheio.
 */
public class RepositorioException extends IndexOutOfBoundsException{

    public RepositorioException(String mensagem){
        super(mensagem);
    }
}
