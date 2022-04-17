package com.company.GerenciamentoDeMercadoEPedidos;

import com.company.RepresentacaoClientesProdutos.Cliente;
import com.company.RepresentacaoClientesProdutos.Produto;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Esta classe é responsável por administrar o mercado.
 */
public class Mercado {

    private ArrayList<Produto> listaDeProdutos = new ArrayList<>();
    private ArrayList<Cliente> listaDeClientes = new ArrayList<>();
    private ArrayList<Pedido> listaDePedidos = new ArrayList<>();
    private Cliente cliente_atual = null;

    /**
     * Este método é responsável por adicionar produtos à lista de produtos do mercado.
     */
    public void adicionarProdutos() {
        listaDeProdutos.add(new Produto("Banana", 3.0));
        listaDeProdutos.add(new Produto ("Laranja", 4.0));
        listaDeProdutos.add(new Produto ("Cenoura", 3.0));
        listaDeProdutos.add(new Produto ("Abacaxi", 6.0));
        listaDeProdutos.add(new Produto ("Melancia", 8.0));
        listaDeProdutos.add(new Produto ("Abacate", 7.0));
        listaDeProdutos.add(new Produto ("File Mignon", 60.0));
        listaDeProdutos.add(new Produto ("Alcatra", 30.0));
    }

    /**
     * Este método é responsável por imprimir os produtos do mercado na tela.
     */
    public void mostrarProdutos(){
        int count = 1;
        System.out.println("-----------------------------LISTA DE PRODUTOS DO MERCADO-----------------------------");
        for (Produto str : this.listaDeProdutos) {
            System.out.println( count + " - IdProduto: " + str + " | nome: " + str.getNome() + " | preco: " + str.getPreco() + "\n");
            count++;
        }
    }

    /**
     * Este método é responsável por adicionar um cliente à lista de clientes do mercado.
     */
    public void adicionarCliente() {
        Scanner myObj = new Scanner(System.in);
        String nome = myObj.nextLine();
        String meioDePagamento = myObj.nextLine();
        Cliente cliente = new Cliente(nome, meioDePagamento);
        listaDeClientes.add(cliente);
        for (Cliente str : listaDeClientes) {
            System.out.println("Seu usuario foi criado! IdCliente: " + str + " | nome: " + str.getNome() + " | meio pagamento: " + str.getMeioDePagamento() + "\n");
        }
    }

    /**
     * Este método é responsável por imprimir os clientes na tela.
     */
    public void exibirClientes(){
        int count = 1;
        System.out.println("-----------------------------LISTA DE CLIENTES DO MERCADO-----------------------------");
        for (Cliente str : this.listaDeClientes) {
            System.out.println(count + " - IdCliente: " + str + " | nome: " + str.getNome() + " | pagamento: " + str.getMeioDePagamento() + "\n");
            count++;
        }
    }

    /**
     * Este método é responsável por associar um cliente a um pedido.
     */
    public void logar() {
        Scanner myObj = new Scanner(System.in);
        String nome = myObj.nextLine();
        for (Cliente str : listaDeClientes) {
            if (nome.equals(str.getNome())) {
                System.out.println("Bem vindo " + str.getNome() + "! Você acabou de logar! Agora pode fazer seu pedido e pagar com " + str.getMeioDePagamento());
                cliente_atual = str;
                return;
            }
        }
    }

    /**
     * Este método é responsável por adicionar um produto ao pedido e salvar os pedidos na lista de pedidos.
     */
    public void realizarPedido(){
        Pedido pedido = new Pedido(cliente_atual);
        System.out.println("Escolha quais produtos deseja adicionar ao seu pedido digitando o numero de cada um ou 0 para encerrar!");
        int produto = 1;
        while(produto != 0){
            Scanner myObj = new Scanner(System.in);
            produto = myObj.nextInt();
            if(produto != 0){
                System.out.println("Fale a quantidade de " + listaDeProdutos.get(produto-1).getNome() + " que deseja adicionar ao pedido!");
                int n = myObj.nextInt();
                pedido.adicionarProdutoAoPedido(listaDeProdutos.get(produto-1), n);
                System.out.println("O pedido foi feito com sucesso! Legal!! Preco total: " + listaDeProdutos.get(produto-1).getPreco() * n);
            }
        }
        pedido.exibirPedido();
        listaDePedidos.add(pedido);
        System.out.println("Pedido feito com sucesso! Parabéns :)! Agora é só passar no caixa.");
    }

    public ArrayList<Cliente> getListaDeClientes(){
        return this.listaDeClientes;
    }

    public ArrayList<Pedido> getListaDePedidos(){
        return this.listaDePedidos;
    }
}
