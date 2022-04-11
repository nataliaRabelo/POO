package com.company;

import java.util.Scanner;

public class Main {
    /**
     * @author Natália.
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Casa casa = new Casa();
        System.out.println("Voce acabou de criar uma casa, ela veio com 3 portas!\nPrimeiro escolha uma cor para pintar sua casa para continuar!");
        casa.corDaCasa = myObj.nextLine();
        System.out.println("Muito bem, agora a sua casa esta pintada de " + casa.corDaCasa + "\n");
        int decisao = 1;
        while (decisao == 1 || decisao == 2 || decisao == 3 || decisao == 4){
            System.out.println("Agora, escolha o que voce ainda deseja fazer com a sua casa!\nDigite 1 (editar cor da casa) ou 2 (abrir alguma das portas da casa) ou 3 (fechar alguma das portas da casa) ou 4 (verificar quantas portas estão abertas) ou 5 (encerrar programa)");
            Scanner myObj2 = new Scanner(System.in);
            decisao = myObj2.nextInt();
            if(decisao == 1){
                casa.pintarCasa();
            }
            else if(decisao == 2){
                casa.abrirPorta();
            }
            else if(decisao == 3){
                casa.fecharPorta();
            }
            else if(decisao == 4){
                casa.quantasPortasEstaoAbertas();
            }
        }

    }
}
