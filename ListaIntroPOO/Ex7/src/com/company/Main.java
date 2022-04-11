package com.company;

import java.util.Scanner;

/**
 * @author Natália Bruno Rabelo.
 */

public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Mercado mercado = new Mercado();
        Pedido pedido = new Pedido();
        int decisaoDono = 1;
        System.out.println("Bem-vindo ao super mercado, dono do mercado! Abasteça o seu mercado antes dos seus clientes chegarem!");
        while(decisaoDono == 1){
            System.out.println("Digite o nome, preco e quantidade de estoque do produto:");
            mercado.adicionarProdutos();
            System.out.println("Deseja adicionar mais produtos? Digite 1 (sim) ou 2 (ir as compras)");
            decisaoDono = myObj.nextInt();
        }
        int decisao = 1;
        while(decisao == 1){
            System.out.println("Vamos as compras! Antes de mais nada, você deseja criar um novo usuario? Logo após criar o seu, você pode criar para amigos e familia também.");
            System.out.println("Digite 1 (sim) ou 2 (continuar) ou 3 (encerrar programa)");
            decisao = myObj.nextInt();
            if(decisao == 1){
                System.out.println("Crie seu usuario! Digite o nome e meio de pagamento.");
                cliente.adicionarCliente();
            }
        }
        decisao = 1;
        if(!(cliente.listaDeClientes.isEmpty())){
            while(decisao == 1 || decisao == 2){
                System.out.println("Parabens! Agora que voce criou cliente(s), o que gostaria de fazer agora?");
                System.out.println("Digite 1 (criar mais clientes) ou 2 (fazer um pedido) ou 3 (encerrar programa)");
                decisao = myObj.nextInt();
                if(decisao == 1){
                    System.out.println("Crie seu usuario! Digite o nome e meio de pagamento.");
                    cliente.adicionarCliente();
                }
                else if(decisao == 2){
                    System.out.println("Logue com o seu usuario! Digite o nome e meio de pagamento.");
                    cliente.logar();
                    System.out.println("Escolha qual produto deseja adicionar ao seu pedido digitando o seu numero!");
                    mercado.mostrarProdutos();
                    int posicao = myObj.nextInt();
                    pedido.adicionarProdutoAoPedido(posicao);
                }

            }
        }

    }
}
