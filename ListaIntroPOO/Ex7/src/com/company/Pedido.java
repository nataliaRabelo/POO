package com.company;

/**
 * @author Natália Bruno Rabelo.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Esta classe é responsável por representar uma entidade Pedido.
 */
public class Pedido {

    public String nomeDoClienteDoPedido;
    public int quantidadeDoProdutoNoPedido;
    public ArrayList<Produto> pedido;

    public void adicionarProdutoAoPedido(int n){
        Mercado mercado = new Mercado();
        Scanner myObj = new Scanner(System.in);
        Pedido pedidoDoCliente = new Pedido();
        pedidoDoCliente.quantidadeDoProdutoNoPedido = myObj.nextInt();
        for(int i = 0; i < mercado.listaDeProdutos.size(); i++){
            if(n == i){
                Produto elemento = mercado.listaDeProdutos.get(i);
                pedidoDoCliente.pedido.add(elemento);
            }
        }
        System.out.println("----------------------------- PEDIDO -----------------------------");
        System.out.println("Usuario: "  + nomeDoClienteDoPedido);
        int count = 0;
        for (Produto str : pedidoDoCliente.pedido) {
            System.out.println( count + " - IdProduto: " + str + " | nome: " + str.nome + " | preco: " + str.preco + "\n");
            count++;
        }
    }
}
