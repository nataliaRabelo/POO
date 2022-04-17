package com.company;

import java.util.Scanner;

/**
 * @author Natália Bruno Rabelo
 */
public class Main {

    /**
     * Este métdo é responsável por ler as decisões do usuário e chamar as respectivas funções necessárias.
     *
     */
    public static void main(String[] args) {
        System.out.println("Bem-vindo a loja de celulares!");
        Loja loja = new Loja();
        int decisao = 1;
        Scanner myObj =  new Scanner(System.in);
        while(decisao == 1){
            System.out.println("Voce deseja comprar um celular? criamos um personalizado pra voce! Apos confirmar, voce pode comprar outros.");
            System.out.println("Digite 1 (sim) ou 2 (continuar programa)");
            decisao = myObj.nextInt();
            switch(decisao) {
                case 1:
                    System.out.println("Crie seu celular! Digite o seu nome, sr.(a) futuro(a) dono(a)!");
                    loja.criarCelular();
                    break;
                default:
                    break;
            }
        }
        if(!(loja.getListaDeCelulares().isEmpty())) {
            decisao = 1;
            while (decisao == 1 || decisao == 2 || decisao == 3) {
                System.out.println("Agora que voce criou um ou mais celulares, o que mais deseja fazer?");
                System.out.println("Digite 1 (enviar mensagem de texto) ou 2 (fazer uma ligacao) ou 3 (visualizar bateria) ou 0 (encerrar programa)");
                decisao = myObj.nextInt();
                switch (decisao) {
                    case 1:
                        loja.enviarMensagem();
                        break;
                    case 2:
                        loja.realizarLigacao();
                        break;
                    case 3:
                        loja.mostrarBateria();
                        break;
                    default:
                        break;
                }
            }
        }

    }
}
