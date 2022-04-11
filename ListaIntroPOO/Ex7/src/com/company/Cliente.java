package com.company;

/**
 * @author Natália Bruno Rabelo.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Esta classe é responsável por representar uma entidade Cliente.
 */
public class Cliente {

    public String nome;
    public String meioDePagamento;
    public ArrayList<Cliente> listaDeClientes = new ArrayList<>();

    public void adicionarCliente() {
        Scanner myObj = new Scanner(System.in);
        Cliente cliente = new Cliente();
        cliente.nome = myObj.nextLine();
        cliente.meioDePagamento = myObj.nextLine();
        listaDeClientes.add(cliente);
        for (Cliente str : listaDeClientes) {
            System.out.println("Seu usuario foi criado! IdCliente: " + str + " | nome: " + str.nome + " | meio pagamento: " + str.meioDePagamento + "\n");
        }
    }

    public Cliente logar() {
        Scanner myObj = new Scanner(System.in);
        Cliente cliente = new Cliente();
        cliente.nome = myObj.nextLine();
        cliente.meioDePagamento = myObj.nextLine();
        for (Cliente str : listaDeClientes) {
            if (str.nome.equals(cliente.nome) && str.meioDePagamento.equals(cliente.meioDePagamento)) {
                System.out.println("Encontramos seu usuario, você acabou de logar, agora pode fazer seu pedido!");
                cliente = str;
            }

            for (Cliente str2 : listaDeClientes) {
                System.out.println("Contato: " + str2 + " | nome: " + str2.nome + " | meio pagamento: " + str.meioDePagamento + "\n");
            }
        }
        return cliente;
    }
}
