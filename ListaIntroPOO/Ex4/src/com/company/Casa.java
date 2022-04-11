package com.company;

import java.util.Scanner;
/**
 * @author Natália.
 */

/**
 * Esta classe é responsável por representar uma entidade Casa.
 */
public class Casa {
    public String corDaCasa;
    public boolean porta1;
    public boolean porta2;
    public boolean porta3;

    public void pintarCasa(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Pinte a casa com uma cor de sua escolha!\n");
        this.corDaCasa = myObj.nextLine();
        System.out.println("Muito bem, agora a sua casa esta pintada de " + this.corDaCasa + "\n");
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
            this.porta1 = true;
            System.out.println("nheeeeeccccc... A porta1 foi aberta!\n");
        }
        else if(decisao == 2){
            this.porta2 = true;
            System.out.println("nheeeeeccccc... A porta2 foi aberta!\n");
        }
        else if(decisao == 3){
            this.porta3 = true;
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
            this.porta1 = false;
            System.out.println("nheeeeeccccc... A porta1 foi fechada!\n");
        }
        else if(decisao == 2){
            this.porta2 = false;
            System.out.println("nheeeeeccccc... A porta2 foi fechada!\n");
        }
        else if(decisao == 3){
            this.porta3 = false;
            System.out.println("nheeeeeccccc... A porta3 foi fechada!\n");
        }
    }

    /**
     * Este método é responsável por verificar quantas portas da casa estão abertas.
     */
    public void quantasPortasEstaoAbertas(){

        if(this.porta1 == true && this.porta2 == true && this.porta3 == true){
            System.out.println("As 3 portas estao abertas.\n");
        }
        else if((this.porta1 == true && this.porta2 == true && this.porta3 == false) || (this.porta1 == false && this.porta2 == true && this.porta3 == true) || (this.porta1 == true && this.porta2 == false && this.porta3 == true)){
            System.out.println("Somente 2 portas estao abertas.\n");
        }
        else if((this.porta1 == true && this.porta2 == false && this.porta3 == false) || (this.porta1 == false && this.porta2 == true && this.porta3 == false) || (this.porta1 == false && this.porta2 == false && this.porta3 == true)){
            System.out.println("Somente 1 porta esta aberta.\n");
        }
    }
}

