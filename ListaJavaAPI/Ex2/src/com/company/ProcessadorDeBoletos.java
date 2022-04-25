package com.company;

import java.util.ArrayList;
/**
 * @author Natália Bruno Rabelo
 */

/**
 * Esta classe é responsável por administrar um processador de boletos que registra todas as faturas cobradas e boletos pagos de acordo com estas faturas.
 */
public class ProcessadorDeBoletos {

    ArrayList<Fatura> faturas = new ArrayList<>();
    ArrayList<Boleto> boletos = new ArrayList<>();


    public ArrayList<Boleto> getBoletos(){
        return this.boletos;
    }

    /**
     * Este método é responsável por adicionar uma fatura à lista de faturas.
     * @param fatura
     */
    public void adicionarFaturaAoProcessador(Fatura fatura){
        this.faturas.add(fatura);
    }

    /**
     * Este método é responsável por adicionar um boleto à lista de boletos.
     * @param boleto
     */
    public void adicionarBoletoAoProcessador(Boleto boleto){
        this.boletos.add(boleto);
    }

    /**
     * Este método é responsável por imprimir a lista de Faturas.
     */
    public void imprimirFaturas(){
        System.out.println("------------------------------ REGISTRO DE FATURAS ------------------------------ ");
        int i = 1;
        for(Fatura fatura: faturas){
            System.out.println( i + " - Fatura: " + fatura + " | Mes: " + fatura.GetMes() +  " | Cliente: " + fatura.getNomeDoCliente() + " | Valor Total: " + fatura.getValorTotal() + " | Valor Pago: " + fatura.getValorPago() + " | Esta paga: " + fatura.getEstaPaga());
            fatura.imprimirBoletosAssociados();
            i++;
        }
        System.out.println("--------------------------------------------------------------------------------- ");
    }

    /**
     * Este método é responsável por buscar uma fatura na lista de faturas de acordo com um dado numero n inputado pelo ususario e conforme o index da lista.
     * @param n
     * @return Fatura fatura.
     */
    public Fatura buscarFatura(int n) {
        Fatura fatura = null;
        for (int i = 0; i < faturas.size(); i++) {
            if (n == i + 1) {
                fatura = faturas.get(i);
            }
            else if(n != i + 1){
                System.out.println("Fatura nao encontrada!");
            }
        }
        return fatura;
    }

}
