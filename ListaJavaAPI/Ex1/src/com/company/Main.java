package com.company;

import java.util.Scanner;

/**
 * @author Natália Bruno Rabelo
 */
public class Main {

    public static void main(String[] args) {
            Scanner obj = new Scanner(System.in);
            ListaDeCompras listaDeCompras= new ListaDeCompras();
            int decisao = 1;
            while(decisao == 1){
                System.out.println("Deseja adicionar um item a lista de compras? Digite 1 (sim) ou qualquer numero (nao).");
                decisao = obj.nextInt();
                switch(decisao) {
                    case 1:
                        System.out.println("Digite nome e preco do produto");
                        String nome = obj.next();
                        double preco = obj.nextDouble();
                        Produto produto = new Produto(nome, preco);
                        listaDeCompras.adicionarProdutoAListaDeCompras(produto);
                        break;
                    default:
                        break;
                }


            }
            listaDeCompras.verificarSeTemProduto();
            listaDeCompras.imprimirListaDeCompras();
    }
}
