package com.company.GerenciamentoDeMercadoEPedidos;

/**
 * @author Natália Bruno Rabelo.
 */

import com.company.RepresentacaoClientesProdutos.Cliente;
import com.company.RepresentacaoClientesProdutos.Produto;

import java.util.ArrayList;

/**
 * Esta classe é responsável por representar uma entidade Pedido.
 */
public class Pedido {
    private Cliente cliente;
    private ArrayList<Produto> pedido = new ArrayList<>();
    private ArrayList<Integer> quantidade = new ArrayList<>();

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
        System.out.println("Cliente: nome - " + cliente.getNome() + " pagamento: " + cliente.getMeioDePagamento());
        int count = 1;
        for(Produto str : pedido)
        {
            System.out.println(count + " - produto: " + str.getNome() + " quantidade: " + quantidade.get(count-1) + " preco total: " + str.getPreco() * quantidade.get(count-1));
            count++;
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------");
    }

}