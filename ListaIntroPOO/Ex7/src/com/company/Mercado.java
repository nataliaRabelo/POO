package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Este método é responsável por representar uma entidade mercado.
 */
public class Mercado {

    public ArrayList<Produto> listaDeProdutos = new ArrayList<>();

    public void adicionarProdutos() {
        Scanner myObj = new Scanner(System.in);
        Produto produto = new Produto();
        produto.nome = myObj.nextLine();
        produto.preco = myObj.nextFloat();
        produto.quantidade = myObj.nextInt();
        listaDeProdutos.add(produto);
        for (Produto str : this.listaDeProdutos)
        {
            System.out.println("Seu produto foi adicionado: "+ str + " | nome: " + str.nome + " | preco: " + str.preco + " | quantidade: " + str.quantidade + "\n");
        }
    }

    public void mostrarProdutos(){
        int count = 1;
        System.out.println("-----------------------------LISTA DE PRODUTOS DO MERCADO-----------------------------");
        for (Produto str : this.listaDeProdutos) {
            System.out.println( count + " - IdProduto: " + str + " | nome: " + str.nome + " | preco: " + str.preco + "\n");
            count++;
        }
    }
}
