package com.company;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        try {
            ClienteArquivo.getInstancia().construirArrayDeOndeParou();
            int decisao = 1;
            while (decisao == 1 || decisao == 2 || decisao == 3 || decisao == 4 || decisao == 5){
                System.out.println("------------------------------------------------\nBem-vindo ao banco de dados de clientes.\nDigite a consulta ou manipulacao do banco que deseja fazer:\n--------------------- MENU ---------------------\n1 - Cadastrar novo cliente\n" +
                        "2 - Buscar cliente pelo nome\n" +
                        "3 - Buscar cliente pelo CPF\n" +
                        "4 - Excluir cliente\n" +
                        "5 - Listar cliente\n------------------------------------------------");
                decisao = sc.nextInt();
                switch (decisao){
                    case 1:
                        CadastroDeCliente.getInstancia().inserir();
                        break;
                    case 2:
                        CadastroDeCliente.getInstancia().buscarPorNome();
                        break;
                    case 3:
                        CadastroDeCliente.getInstancia().buscarPorCpf();
                        break;
                    case 4:
                        CadastroDeCliente.getInstancia().excluir();
                        break;
                    case 5:
                        CadastroDeCliente.getInstancia().listar();
                        break;
                }
            }
        } catch (EOFException e){
            e.getCause();
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
