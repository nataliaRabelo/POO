package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Natália Bruno Rabelo
 */

/**
 * Esta classe é responsável por administrar a loja.
 */
public class Loja {
    private ArrayList<Celular> listaDeCelulares = new ArrayList<>();

    /**
     * Este método é responsável por criar uma instância do objeto celular e adicioná-lo à lista de celulares.
     */
    public void criarCelular() {

        Scanner myObj = new Scanner(System.in);
        int bateria = 100;
        String donoDoCelular = myObj.nextLine();
        Celular celular = new Celular(bateria, donoDoCelular);
        this.listaDeCelulares.add(celular);
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Parabens, " + celular.getDonoDoCelular() + " voce acabou de criar um celular! Ele se inicia com nivel de bateria: " + celular.getBateria() + "%");
        System.out.println("------------------------------------------------------------------------------------------");
    }

    /**
     * Este método é responsável por encontrar uma instância do objeto celular e decrementar uma unidade da bateria após a leitura e impressão de uma mensagem de texto.
     *
     */
    public void enviarMensagem(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Digite de qual celular deseja enviar a mensagem de texto, para isso, digite o nome de usuario: ");
        String nome = myObj.nextLine();
        for(Celular celular : this.listaDeCelulares){
            if(nome.equals(celular.getDonoDoCelular())){
                System.out.println("Voce acessou o celular de " + celular.getDonoDoCelular() + ", escreva a sua mensagem de texto: ");
                String mensagem = myObj.nextLine();
                System.out.println("------------------------------------------------------------------------------------------");
                System.out.println("Sua mensagem: " + mensagem);
                System.out.println("------------------------------------------------------------------------------------------");
                int bateria = celular.getBateria();
                bateria--;
                celular.setBateria(bateria);
            }
        }
    }

    /**
     * Este método é responspavel por encontrar uma instância do objeto celular e decrementar uma unidade da bateria após simular uma ligação onde cada linha representa 5 segundos da ligação.
     */
    public void realizarLigacao(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Digite de qual celular deseja realizar a ligacao, para isso, digite o nome de usuario: ");
        String nome = myObj.nextLine();
        for(Celular celular : this.listaDeCelulares){
            if(nome.equals(celular.getDonoDoCelular())){
                System.out.println("Você acessou o celular de " + celular.getDonoDoCelular() + " e esta em uma ligacao.");
                System.out.println("Escreva o que deseja dizer durante a ligacao, cada linha equivale a 5 segundos de chamada.");
                int decisao = 1;
                while(decisao == 1){
                    System.out.println("Digite 1 (escrever uma linha) ou 2 (encerrar chamada).");
                    decisao = myObj.nextInt();
                    Scanner myObj2 = new Scanner(System.in);
                    switch (decisao){
                        case 1:
                            System.out.println("Escreva o que deseja dizer durante 5 segundos da sua ligacao:");
                            String chamada5sec = myObj2.nextLine();
                            System.out.println("------------------------------------------------------------------------------------------");
                            System.out.println("Nos seus 5 segundos de chamada voce disse: " + chamada5sec);
                            System.out.println("------------------------------------------------------------------------------------------");
                            int bateria = celular.getBateria();
                            bateria--;
                            celular.setBateria(bateria);
                            break;
                        default:
                            break;
                    }
                }
            }
        }
    }

    /**
     * Este método é responsável por encontrar uma instância do objeto celular na lista de celulares por meio do nome do dono do celular e imprimir o estado atual da bateria.
     */
    public void mostrarBateria(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Digite de qual celular deseja exibir o nivel de bateria, para isso, digite o nome de usuario: ");
        String nome = myObj.nextLine();
        for(Celular celular : this.listaDeCelulares){
            if(nome.equals(celular.getDonoDoCelular())){
                System.out.println("------------------------------------------------------------------------------------------");
                System.out.println("O nivel de bateria do celular de " + celular.getDonoDoCelular() + " eh: " + celular.getBateria() + "%");
                System.out.println("------------------------------------------------------------------------------------------");
            }
        }
    }

    public ArrayList<Celular> getListaDeCelulares(){
        return this.listaDeCelulares;
    }
}
