package com.company;

import java.util.*;

/**
 * @author Natália Bruno Rabelo.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        MaquinaKaraoke maquinaKaraoke = new MaquinaKaraoke();
        maquinaKaraoke.preencherMaquina();
        Scanner sc = new Scanner(System.in);
        int decisao = 1;
        while (decisao == 1){
            System.out.println("Deseja escolher uma música para cantar? Digite 1 (sim) ou 0 (encerrar programa)");
            decisao = sc.nextInt();
            switch (decisao){
                case 1:
                    System.out.println("Como deseja ordernar a visualização da lista de músicas? 1 (nome da musica) 2 (nome do artista)");
                    int escolhaOrdenacao = sc.nextInt();
                    maquinaKaraoke.visualizarTodasAsMusicas(escolhaOrdenacao);
                    System.out.println("Escolha uma musica para cantar! Digite o numero da musica:");
                    int numero = sc.nextInt();
                    maquinaKaraoke.escolherMusica(numero);
                    maquinaKaraoke.visualizarMusicasEmTramite();
                    maquinaKaraoke.removerMusicaDeTramite();
                    break;
                default:
                    break;
            }

        }
    }

}
