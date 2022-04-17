package com.company;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: Natália Bruno Rabelo.
 */

/**
 * Classe responsável por representar uma entidade Agenda.
 * Esta classe possui um Array de objetos contatos que são adicionados e removidos conforme execução de seus respectivos métodos.
 */
public class Agenda {

    private ArrayList<Contato> listaDeContatos = new ArrayList<>();

    /**
     * Método responsável por adicionar um contato à agenda.
     */
    public void adicionarContato() {

        Scanner myObj = new Scanner(System.in);
        String nome = myObj.nextLine();
        String email = myObj.nextLine();
        String numero = myObj.nextLine();
        Contato contato = new Contato(nome, email, numero);
        listaDeContatos.add(contato);
        for (Contato str : listaDeContatos)
        {
            System.out.println("Contato: "+ str + " | nome: " + str.getNome() + " | email: " + str.getEmail() + " | numero: " + str.getNumero() + "\n");
        }
    }

    /**
     * Método responsável por remover um contato da agenda.
     */
    public void removerContato() {
        Scanner myObj = new Scanner(System.in);
        String nome = myObj.nextLine();
        String email = myObj.nextLine();
        String numero = myObj.nextLine();
        Contato novoContato = new Contato(nome, email, numero);
        ArrayList<Contato> arrayAuxiliar = new ArrayList<>();
        int tamanho = listaDeContatos.size();
        for (Contato str : listaDeContatos)
        {
            if(tamanho == 1 && str.getNome().equals(novoContato.getNome()) && str.getEmail().equals(novoContato.getEmail()) && str.getNumero().equals(novoContato.getNumero())){
                this.listaDeContatos = new ArrayList<>();
                System.out.println("Sua agenda ficou vazia :(. Mas fique a vontade para a preencher novamente! :D");
            }
            if (!(str.getNome().equals(novoContato.getNome()) && str.getEmail().equals(novoContato.getEmail()) && str.getNumero().equals(novoContato.getNumero()))){
                arrayAuxiliar.add(str);
                this.listaDeContatos = new ArrayList<>();
                for (Contato str2 : arrayAuxiliar)
                {
                    listaDeContatos.add(str2);
                }
            }
            arrayAuxiliar = new ArrayList<>();
        }
        for (Contato str : listaDeContatos) {
            System.out.println("Contato: "+ str + " | nome: " + str.getNome() + " | email: " + str.getEmail() + " | numero: " + str.getNumero() + "\n");
        }
    }
}