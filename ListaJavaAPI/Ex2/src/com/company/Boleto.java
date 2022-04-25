package com.company;

/**
 * @author Natália Bruno Rabelo.
 */

/**
 * Esta classe é responsável por representar uma entidade boleto.
 */
public class Boleto {

    private int codigo;
    private String mes;
    private double valorPago;
    private Fatura fatura;

    public Boleto(int random, String mes, double valorTotal, Fatura fatura) {
        this.codigo = random;
        this.mes = mes;
        this.valorPago = valorTotal;
        this.fatura = fatura;

    }

    public int getCodigo(){
        return this.codigo;
    }

    public String getMes(){
        return this.mes;
    }

    public double getValorPago(){
        return this.valorPago;
    }

    public Fatura getFatura(){

        return this.fatura;
    }

}
