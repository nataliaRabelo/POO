package com.company;

/**
 * @author Natália Bruno Rabelo
 * Classe responsável por testar uma conta corrente
 */
public class TesteContaCorrente {

    float limite = 1000;
    float saldo = 40000;
    float valorLimite = 1000;


    /**
     * Método responsável por instanciar um objeto conta corrente e tratar as exceções relacionadas aos métodos contidos na classe Conta Corrente
     */
    public void testarContaCorrente(){
        ContaCorrente contaCorrente = new ContaCorrente(this.limite, this.saldo, this.valorLimite);
        try {
            contaCorrente.depositar(-1000);
        }
        catch (IllegalArgumentException ex1){
            System.out.println("Excecao 1 - Nao eh possivel efetuar esta acao porque o numero dado eh negativo ou igual a zero");
            System.out.println("----------------------------------------");
            System.out.println(ex1.getMessage());
            System.out.println(ex1.getStackTrace());
            System.out.println("----------------------------------------");
        }
        try {
            contaCorrente.sacar(-2000);
        }
        catch (IllegalArgumentException ex2){
            System.out.println("Excecao 2 - Nao eh possivel efetuar esta acao porque o numero dado eh negativo ou igual a zero");
            System.out.println("----------------------------------------");
            System.out.println(ex2.getMessage());
            System.out.println(ex2.getStackTrace());
            System.out.println("----------------------------------------");
        }
        try {
            contaCorrente.setValorLimite(-3000);
        }
        catch (IllegalArgumentException ex3){
            System.out.println("Excecao 3 - Nao eh possivel efetuar esta acao porque o numero dado eh negativo ou igual a zero");
            System.out.println("----------------------------------------");
            System.out.println(ex3.getMessage());
            System.out.println(ex3.getStackTrace());
            System.out.println("----------------------------------------");
        }
    }
}
