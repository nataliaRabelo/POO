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

    public ArrayList<Contato> listaDeContatos = new ArrayList<>();

    /**
     * Método responsável por adicionar um contato à agenda.
     */
    public void adicionarContato() {

        Scanner myObj = new Scanner(System.in);
        Contato contato = new Contato();
        contato.nome = myObj.nextLine();
        contato.email = myObj.nextLine();
        contato.numero = myObj.nextLine();
        listaDeContatos.add(contato);
        for (Contato str : listaDeContatos)
        {
            System.out.println("Contato: "+ str + " | nome: " + str.nome + " | email: " + str.email + " | numero: " + str.numero + "\n");
        }
    }

    /**
     * Método responsável por remover um contato da agenda.
     */
    public void removerContato() {
        Scanner myObj = new Scanner(System.in);
        Contato novoContato = new Contato();
        novoContato.nome = myObj.nextLine();
        novoContato.email = myObj.nextLine();
        novoContato.numero = myObj.nextLine();
        ArrayList<Contato> arrayAuxiliar = new ArrayList<>();
        int tamanho = listaDeContatos.size();
        for (Contato str : listaDeContatos)
        {
            if(tamanho == 1 && str.nome.equals(novoContato.nome) && str.email.equals(novoContato.email) && str.numero.equals(novoContato.numero)){
                this.listaDeContatos = new ArrayList<>();
                System.out.println("Sua agenda ficou vazia :(. Mas fique a vontade para a preencher novamente! :D");
            }
            if (!(str.nome.equals(novoContato.nome) && str.email.equals(novoContato.email) && str.numero.equals(novoContato.numero))){
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
            System.out.println("Contato: "+ str + " | nome: " + str.nome + " | email: " + str.email + " | numero: " + str.numero + "\n");
        }
    }
}