package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Natália Bruno Rabelo.
 * Classe responsável por administrar um cadastro de clientes.
 */
public class CadastroDeCliente {


    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private static CadastroDeCliente instancia;

    /**
     * Método responsável por listar os clientes da lista de clientes.
     */
    public void listar(){
        for(Cliente cliente : this.clientes){
            System.out.println("Nome: " + cliente.getNome() + " | CPF: " + cliente.getCpf());
        }
    }

    /**
     * Método responsável por inserir um cliente ao registro de clientes.
     * @throws FileNotFoundException
     */
    public void inserir() throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Voce esta criando um cliente...\nDigite o seu nome:");
        String nome = sc.nextLine();
        System.out.println("Digite o seu cpf:");
        String cpf = sc.nextLine();
        Cliente cliente = new Cliente(nome, cpf);
        this.clientes.add(cliente);
        try {
            ClienteArquivo.getInstancia().atualizarArquivo(this.clientes);
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Cliente inserido com sucesso");
    }

    /**
     * Método responsável por buscar um cliente pelo CPF.
     */
    public void buscarPorCpf(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o cpf do cliente que deseja buscar:");
        String cpf = sc.nextLine();
        for(Cliente cliente : this.clientes){
            if(cliente.getCpf().equals(cpf)){
                System.out.println("Nome: " + cliente.getNome() + " | CPF: " + cliente.getCpf());
            }
        }

    }

    /**
     * Método responsável por buscar um cliente pelo nome.
     * Mais de uma saída podem aparecer se clientes tiverem o nome igual.
     */
    public void buscarPorNome(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do cliente que deseja buscar:");
        String nome = sc.nextLine();
        for(Cliente cliente : this.clientes){
            if(cliente.getNome().equals(nome)){
                System.out.println("Nome: " + cliente.getNome() + " | CPF: " + cliente.getCpf());
            }
        }

    }

    /**
     * Método responsável por excluir um cliente do registro de clientes.
     */
    public void excluir(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o cpf do cliente que deseja remover:");
        String cpf = sc.nextLine();
        this.clientes.removeIf(cliente -> cliente.getCpf().equals(cpf));
        try {
            ClienteArquivo.getInstancia().atualizarArquivo(this.clientes);
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Cliente removido com sucesso");
    }


    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes.addAll(clientes);
    }

    /**
     * Singleton que só permite uma instância do objeto ser criada, quando o atributo estático instancia tem o valor nulo.
     * @return
     */
    public static CadastroDeCliente getInstancia() {
        if (instancia == null) {
            instancia = new CadastroDeCliente();
        }
        return instancia;
    }
}
