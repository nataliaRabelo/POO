
package com.company;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Natália Bruno Rabelo.,
 */

/**
 * Esta classe é responsável por representar uma Lista de Compras.
 */
public class ListaDeCompras {
    private final ArrayList<Produto> listaDeCompras = new ArrayList<>();
    private boolean temProduto = false;

    /**
     * Este método é responsável por adicionar um produto à lista de compras.
     * @param produto
     */
    public void adicionarProdutoAListaDeCompras(Produto produto){
        this.listaDeCompras.add(produto);
    }

    /**
     * Este método é responsável por verificar se existe produto na lista, utilizando especialmente o método contains().
     */
    public void verificarSeTemProduto(){
        listaDeCompras.stream().filter((produto) -> (listaDeCompras.contains(produto))).forEachOrdered((_item) -> {
            temProduto = true;
        });
        
    }
    /**
     * Este método é responsável por imprimir os produtos da lista em ordem alfabética, utilizando especialmente o método Collections.sort().
     */
    public void imprimirListaDeCompras(){
        if (temProduto == true){
            Collections.sort(listaDeCompras, (Produto o1, Produto o2) -> o1.getNome().compareTo(o2.getNome()));
        }
        listaDeCompras.forEach((produto) -> {
            System.out.println("Nome: " + produto.getNome() + "| Preco: " + produto.getPreco() + "\n");
        });
    }
}
