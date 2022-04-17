package com.company;

/**
 * @author Natália Bruno Rabelo
 */

import java.util.Scanner;

/**
 * Esta classe é responsável por representar uma entidade Televisão.
 */
public class Televisao {

    private boolean estado;
    private boolean mudo;
    private int volume;
    private int canal;

    /**
     * Este método é responsável por ligar a TV.
     */
    public void ligarTv(){

        estado = true;
        System.out.println("A TV acabou de ser ligada!");
    }

    /**
     * Este método é responsável por desligar a TV.
     */
    public void desligarTv(){

        estado = false;
        System.out.println("A TV acabou de ser desligada!");
    }

    /**
     * Este método é responsável por mudar o canal da TV para o proximo.
     */
    public void proximoCanal(){

        setCanal(getCanal(canal++));
    }

    /**
     * Este método é responsável por mudar o canal da TV para o anterior.
     */
    public void antecessorCanal(){

        setCanal(getCanal(canal--));
    }

    /**
     * Este método é responsável por mudar o canal da TV para um canal específico.
     */
    public void mudarCanal(){

        Scanner myObj = new Scanner(System.in);
        System.out.println("Digite o canal que deseja escolher");
        int canalEscolhido = myObj.nextInt();
        setCanal(canalEscolhido);
    }

    /**
     * Este método é responsável por aumentar uma unidade do volume da TV.
     */
    public void proximoVolume(){
        setVolume(getVolume(volume++));
    }

    /**
     * Este método é responsável por diminuir uma unidade do volume da TV.
     */
    public void antecessorVolume(){
        setVolume(getVolume(volume--));
    }

    /**
     * Este método é responsável por mudar o volume da TV para um numero específico.
     */
    public void mudarVolume(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Digite o volume que deseja escolher.");
        int volumeEscolhido = myObj.nextInt();
        setVolume(volumeEscolhido);
    }

    /**
     * Este método é responsável por silenciar a TV.
     */
    public void silenciarTv(){
        mudo = true;
        System.out.println("A TV foi silenciada");
    }

    /**
     * Este método é responsável por desilenciar a TV.
     */
    public void desilenciarTv(){
        mudo = false;
        System.out.println("A TV foi desilenciada");
    }

    public boolean getEstado(){
        return this.estado;
    }

    public boolean getMudo(){
        return this.mudo;
    }

    public int getVolume(int volume){
        return this.volume;
    }

    public int getCanal(int canalEscolhido){
        return this.canal;
    }
    public void setCanal(int canal){
        if(canal <= 99 && canal >= 0) {
            this.canal = canal;
            System.out.println("O canal atual eh:" + canal);
        }
        else{
            System.out.println("Canal nao encontrado\n");
        }
    }
    public void setVolume(int volume){
        if(volume <= 10 && volume >= 0) {
            this.volume = volume;
            System.out.println("O volume atual eh:" + volume);
        }
        else{
            System.out.println("Volume nao permitido\n");
        }
    }
}

