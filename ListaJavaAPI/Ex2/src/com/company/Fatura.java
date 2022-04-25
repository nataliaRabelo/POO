package com.company;

import java.util.ArrayList;

/**
 * @author Natália Bruno Rabelo.
 */

/**
 * Esta classe é responsável por representar uma entidade fatura.
 */
public class Fatura {

    private String mes;
    private String nomeDoCliente;
    private double valorTotal;
    private double valorPago;
    private boolean estaPaga;
    private ArrayList<Boleto> boletosAssociados = new ArrayList<>();

    public Fatura(String mes, String nome, int faturaDoMes) {
        this.mes = mes;
        this.nomeDoCliente = nome;
        this.valorTotal = faturaDoMes;
    }

    public String GetMes(){
        return this.mes;
    }

    public String getNomeDoCliente(){
        return this.nomeDoCliente;
    }

    public double getValorTotal(){
        return this.valorTotal;
    }

    public double getValorPago(){
        return this.valorPago;
    }

    public boolean getEstaPaga(){
        return this.estaPaga;
    }

    public void setValorPago(double valor){
        this.valorPago += valor;
    }

    /**
     * Este setter é responsável por determinar a regra de negócio de que se o valor pago da fatura conforme ocorreram pagamentos em boletos for maior ou igual que
     * o valor total da cobranã da fatura, o status estaPaga, receberá o valor true.
     */
    public void setEstaPaga(){
        if (this.valorPago >= this.valorTotal){
            this.estaPaga = true;
        }
    }

    /**
     * Este setter é responsável por determinar a regra de negócio de que se o boleto contido na lista geral da classe ProcessadorDeBoletos for igual à fatura instanciada e
     * nao estiver contido também na lista de boletos associados a uma instância do objeto fatura, este boleto será adicionado à lista de boletosAssociados.
     * @param fatura
     * @param processadorDeBoletos
     */
    public void setBoletosAssociados(Fatura fatura, ProcessadorDeBoletos processadorDeBoletos){
        for(Boleto boleto : processadorDeBoletos.getBoletos()){
            if(fatura == boleto.getFatura()){
                if(!(boletosAssociados.contains(boleto))){
                    boletosAssociados.add(boleto);
                }
            }
        }
    }

    /**
     * Este método é responsável por imprimir os boletos associados a uma instância de um objeto fatura e esta função é chamada dentro da função imprimirFaturas().
     */
    public void imprimirBoletosAssociados(){
        System.out.println("                                    Boletos associados ------------------------------ ");
        for (Boleto boleto : this.boletosAssociados){

                System.out.println( "                               Boleto: " + boleto + " | Mes: " + boleto.getMes() +" | Codigo: " + boleto.getCodigo() +  " | Valor Pago: " + boleto.getValorPago() + " | Fatura: " + boleto.getFatura());
        }
        System.out.println("                                    ------------------------------------------------- ");
    }

}
