package com.company;

/**
 * @author Natália Bruno Rabelo
 */

import java.util.Scanner;

/**
 * Esta classe é responsável por representar uma entidade Televisão.
 */
public class Televisao {

    public boolean estado;
    public boolean mudo;
    public int volume;
    public int canal;

    /**
     * Este método é responsável por ligar a TV.
     */
    public void ligarTv(){

        this.estado = true;
        System.out.println("A TV acabou de ser ligada!");
    }

    /**
     * Este método é responsável por desligar a TV.
     */
    public void desligarTv(){

        this.estado = false;
        System.out.println("A TV acabou de ser desligada!");
    }

    /**
     * Este método é responsável por mudar o canal da TV para o proximo.
     */
    public void proximoCanal(){

        this.canal ++;
        System.out.println("O canal foi avancado para o próximo.\nO canal atual eh: " + this.canal);
    }

    /**
     * Este método é responsável por mudar o canal da TV para o anterior.
     */
    public void antecessorCanal(){

        this.canal --;
        System.out.println("O canal foi regredito para o antecessor.\nO canal atual eh: " + this.canal);
    }

    /**
     * Este método é responsável por mudar o canal da TV para um canal específico.
     */
    public void mudarCanal(){

        Scanner myObj = new Scanner(System.in);
        System.out.println("Digite o canal que deseja escolher");
        int canalEscolhido = myObj.nextInt();
        if(!(this.canal <= 99 && canalEscolhido <= 99)){
            System.out.println("Canal nao encontrado");
        }
        else if(!(this.canal >= 0 && canalEscolhido >= 0)){
            System.out.println("Canal nao encontrado");
        }
        else{
            this.canal = canalEscolhido;
            System.out.println("O canal atual eh:" + this.canal);
        }

    }

    /**
     * Este método é responsável por aumentar uma unidade do volume da TV.
     */
    public void proximoVolume(){
        this.volume ++;
        System.out.println("O volume foi aumentado.\nO volume atual eh: " + this.volume);
    }

    /**
     * Este método é responsável por diminuir uma unidade do volume da TV.
     */
    public void antecessorVolume(){
        this.volume --;
        System.out.println("O volume foi diminuido.\nO canal atual eh: " + this.volume);
    }

    /**
     * Este método é responsável por mudar o volume da TV para um numero específico.
     */
    public void mudarVolume(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Digite o volume que deseja escolher.");
        int volumeEscolhido = myObj.nextInt();
        if(!(this.volume <= 10 && volumeEscolhido <= 10)){
            System.out.println("Volume nao permitido");
        }
        else if(!(this.volume >= 0 && volumeEscolhido >= 0)){
            System.out.println("Volume nao permitido");
        }
        else{
            this.volume = volumeEscolhido;
            System.out.println("O volume atual eh:" + this.volume);
        }
    }

    /**
     * Este método é responsável por silenciar a TV.
     */
    public void silenciarTv(){
        this.mudo = true;
        System.out.println("A TV foi silenciada");
    }

    /**
     * Este método é responsável por desilenciar a TV.
     */
    public void desilenciarTv(){
        this.mudo = false;
        System.out.println("A TV foi desilenciada");
    }
}

