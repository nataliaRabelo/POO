package com.company;

/**
 * @author Natália Bruno Rabelo
 * Classe responsável por representar uma entidade ContaCorrente
 */
public class ContaCorrente {

    private float limite;
    private float saldo;
    private float valorLimite;

    /**
     * Construtor padrão da conta corrente.
     * @param limite
     * @param saldo
     * @param valorLimite
     */
    public ContaCorrente(float limite, float saldo, float valorLimite) {
        this.limite = limite;
        this.saldo = saldo;
        this.valorLimite = valorLimite;
    }

    /**
     * Método responsável por sacar um valor da ContaCorrente,
     * onde é lançada uma exceção do tipo IllegalArgumentException para evitar que numeros negativos ou iguais a zero.
     * @param valor
     */
    public void sacar(float valor){
        if(valor <= 0){
            throw new IllegalArgumentException("O valor a ser sacado precisa ser positivo");
        }
        this.saldo -= valor;
    }

    /**
     * Método responsável por depositar um valor da ContaCorrente,
     * onde é lançada uma exceção do tipo IllegalArgumentException para evitar que numeros negativos ou iguais a zero.
     * @param valor
     */
    public void depositar(float valor){
        if(valor <= 0){
            throw new IllegalArgumentException("O valor a ser depositado precisa ser positivo");
        }
        this.saldo += valor;

    }

    /**
     * Método responsável por settar o valor do limite da ContaCorrente,
     * onde é lançada uma exceção do tipo IllegalArgumentException para evitar que numeros negativos ou iguais a zero.
     * @param valor
     */
    public void setValorLimite(float valor){
        if(valor <= 0){
            throw new IllegalArgumentException("O valor a ser incluido no limite precisa ser positivo");
        }
        this.valorLimite =  valor;
    }
}
