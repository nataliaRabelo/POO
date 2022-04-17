package com.company;

import java.util.Scanner;
/**
 * @author Natália.
 */

/**
 * Esta classe é responsável por representar uma entidade Casa.
 */
public class Casa {
    private String corDaCasa;
    private boolean porta1;
    private boolean porta2;
    private boolean porta3;

    public void pintarCasa(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Pinte a casa com uma cor de sua escolha!\n");
        corDaCasa = myObj.nextLine();
        System.out.println("Muito bem, agora a sua casa esta pintada de " + corDaCasa + "\n");
    }

    public Casa(String corDaCasa){
        this.corDaCasa = corDaCasa;
        this.porta1 = false;
        this.porta2 = false;
        this.porta3 = false;
    }

    /**
     * Este método é responsável por abrir portas da casa a depender da escolha do usuário.
     */
    public void abrirPorta(){

        Scanner myObj = new Scanner(System.in);
        int decisao = 0;
        System.out.println("Escolha qual das tres portas da casa deseja abrir. Digite 1 (porta1) ou 2 (porta2) ou 3 (porta3)\n");
        decisao = myObj.nextInt();
        if(decisao == 1){
            porta1 = true;
            System.out.println("nheeeeeccccc... A porta1 foi aberta!\n");
        }
        else if(decisao == 2){
            porta2 = true;
            System.out.println("nheeeeeccccc... A porta2 foi aberta!\n");
        }
        else if(decisao == 3){
            porta3 = true;
            System.out.println("nheeeeeccccc... A porta3 foi aberta!\n");
        }
    }

    /**
     * Este método é responsável por fechar as portas da casa a depender da escolha do usuário.
     */
    public void fecharPorta(){

        Scanner myObj = new Scanner(System.in);
        int decisao = 0;
        System.out.println("Escolha qual das tres portas da casa deseja fechar. Digite 1 (porta1) ou 2 (porta2) ou 3 (porta3)\n");
        decisao = myObj.nextInt();
        if(decisao == 1){
            porta1 = false;
            System.out.println("nheeeeeccccc... A porta1 foi fechada!\n");
        }
        else if(decisao == 2){
            porta2 = false;
            System.out.println("nheeeeeccccc... A porta2 foi fechada!\n");
        }
        else if(decisao == 3){
            porta3 = false;
            System.out.println("nheeeeeccccc... A porta3 foi fechada!\n");
        }
    }

    /**
     * Este método é responsável por verificar quantas portas da casa estão abertas.
     */
    public void quantasPortasEstaoAbertas(){

        if(porta1 == true && porta2 == true && porta3 == true){
            System.out.println("As 3 portas estao abertas.\n");
        }
        else if((porta1 == true && porta2 == true && porta3 == false) || (porta1 == false && porta2 == true && porta3 == true) || (porta1 == true && porta2 == false && porta3 == true)){
            System.out.println("Somente 2 portas estao abertas.\n");
        }
        else if((porta1 == true && porta2 == false && porta3 == false) || (porta1 == false && porta2 == true && porta3 == false) || (porta1 == false && porta2 == false && porta3 == true)){
            System.out.println("Somente 1 porta esta aberta.\n");
        }
    }
    public String getCorDaCasa(){
        return this.corDaCasa;
    }
}

