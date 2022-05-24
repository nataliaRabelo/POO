package com.company;

/**
 * @author Natália Bruno Rabelo.
 * Esta exceção deve ser lançada quando for inserido um dado inválido nos campos nome e cpf durante a crianção de uma instância de Cliente.
 */
public class DadoInvalidoException extends IllegalArgumentException{

    public DadoInvalidoException(String mensagem){
        super(mensagem);
    }
}
