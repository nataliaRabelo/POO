package com.company;

/**
 * @author Natália Bruno Rabelo.
 */

import java.util.ArrayList;

/**
 * Esta classe é responsável por representar uma entidade Pedido.
 */
public class Pedido {
    public Cliente cliente;
    public ArrayList<Produto> pedido = new ArrayList<>();
    public ArrayList<Integer> quantidade = new ArrayList<>();

    public Pedido(Cliente cliente){
        this.cliente = cliente;
    }

    /**
     * Este método é responsável por adicionar um produto ao pedido.
     * @param produto
     * @param n
     */
    public void adicionarProdutoAoPedido(Produto produto, int n){
        pedido.add(produto);
        quantidade.add(n);
    }

    /**
     * Este método é responsável por imprimir o pedido na tela.
     */
    public void exibirPedido(){
        System.out.println("---------------------------------------------------- PEDIDO ----------------------------------------------------");
        System.out.println("Cliente: nome - " + cliente.nome + " pagamento: " + cliente.meioDePagamento);
        int count = 1;
        for(Produto str : pedido)
        {
            System.out.println(count + " - produto: " + str.nome + " quantidade: " + quantidade.get(count-1) + " preco total: " + str.preco * quantidade.get(count-1));
            count++;
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------");
    }
}