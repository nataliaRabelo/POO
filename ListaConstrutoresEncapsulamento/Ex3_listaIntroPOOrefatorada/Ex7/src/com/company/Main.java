package com.company;

import com.company.GerenciamentoDeMercadoEPedidos.Mercado;
import com.company.GerenciamentoDeMercadoEPedidos.Pedido;

import java.util.Scanner;

/**
 * @author Natália Bruno Rabelo.
 */

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Mercado mercado = new Mercado();
        mercado.adicionarProdutos();
        int decisao = 1;
        while(decisao == 1){
            System.out.println("Vamos as compras! Antes de mais nada, você deseja criar um novo usuario? Logo após criar o seu, você pode criar para amigos e familia também.");
            System.out.println("Digite 1 (sim) ou 2 (continuar programa)");
            decisao = myObj.nextInt();
            switch(decisao) {
                case 1:
                    System.out.println("Crie seu usuario! Digite o nome e meio de pagamento.");
                    mercado.adicionarCliente();
                    break;
                default:
                    break;
            }
        }

        if(!(mercado.getListaDeClientes().isEmpty())){
            decisao = 1;
            while(decisao == 1 || decisao == 2){
                System.out.println("Bem vindo ao mecardo!!!");
                System.out.println("Digite 1 (exibir clientes) ou 2 (fazer um pedido) ou 3 (encerrar programa)");
                decisao = myObj.nextInt();
                switch(decisao){
                    case 1:
                        System.out.println("Exibindo a lista de clientes :)");
                        mercado.exibirClientes();
                        break;
                    case 2:
                        System.out.println("Logue com o seu usuario! Digite o nome.");
                        mercado.logar();
                        mercado.mostrarProdutos();
                        mercado.realizarPedido();
                        break;
                    default:
                        break;
                }
            }
            System.out.println("O mercado fechou! Agora você e toda sua família tem que ir até o caixa pagar a conta!!!!!");
            System.out.println("---------------------------------------------------- LISTA DE PEDIDOS DO MERCADO ----------------------------------------------------");
            int count = 1;
            for(Pedido str : mercado.getListaDePedidos())
            {
                System.out.print("Pedido " + count + "\n");
                str.exibirPedido();
                count++;
            }
        }
        System.out.println("Tchau Tchau!!! Até a próxima compra!!");
    }
}
