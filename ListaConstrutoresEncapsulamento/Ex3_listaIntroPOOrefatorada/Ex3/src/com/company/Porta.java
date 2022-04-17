package com.company;

/**
 * @author Natália Bruno Rabelo
 */

import java.util.Scanner;

/**
 * Classe responsável por representar a entidade porta.
 */
public class Porta {

    private String cor;
    private int comprimento;
    private int largura;
    private boolean portaAberta;

    public Porta(String cor, int comprimento, int largura){
        this.cor = cor;
        this.comprimento = comprimento;
        this.largura =  largura;
        this.portaAberta = false;
    }
    /**
     * Este método é responsável por abrir a porta.
     */
    public void abrirPorta(){
        portaAberta = true;
        System.out.println("nheeeeeccccc, sua porta foi aberta\n");
    }

    /**
     * Este método é responsável por fechar a porta
     */
    public void fecharPorta(){
        portaAberta = false;
        System.out.println("nheeeeeccccc, sua porta foi fechada\n");
    }

    /**
     * Este método é responsável por verificar se a porta está aberta.
     */
    public void estaAberta(){
        if(portaAberta == true){
            System.out.println("A porta esta aberta :D\n");
        }
        else{
            System.out.println("A porta não esta aberta :(\n");
        }
    }

    /**
     * Este método é responsável por editar a dimensão da porta.
     */
    public void editarDimensao(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Edite a nova dimensao da porta, digite seu comprimento e sua largura:\n");
        comprimento = myObj.nextInt();
        largura = myObj.nextInt();
        System.out.println("A dimensao da porta foi atualizada!\n"+ "comprimento: " +this.comprimento+ "\nlargura: " + this.largura + "\n");
    }

    /**
     * Este método é responsável por editar a cor da porta.
     */
    public void editarCor(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Digite a nova cor da porta:");
        cor = myObj.nextLine();
        System.out.println("A cor da porta foi atualizada!\n"+ "cor: " +this.cor);
    }

    public String getCor(){
        return this.cor;
    }

    public int getComprimento(){
        return this.comprimento;
    }

    public int getLargura(){
        return this.largura;
    }
}

