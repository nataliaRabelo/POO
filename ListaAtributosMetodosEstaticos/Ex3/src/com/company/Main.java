package com.company;


/**
 * @author Natália Bruno Rabelo
 */
public class Main {

    public static void main(String[] args) {
        Evento a = Evento.getInstanciaEvento(); //TESTE PRA VER SE O SINGLETON TÁ MESMO FUNCIONANDO
        Evento b = Evento.getInstanciaEvento();
        Evento c = Evento.getInstanciaEvento();
        System.out.println(a + " " + b +  " " + c);
    }
}
