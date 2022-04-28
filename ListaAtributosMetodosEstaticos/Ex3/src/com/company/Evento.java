/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import java.util.ArrayList;

/**
 * @author Natália Bruno Rabelo.
 *
 * Esta classe é responsável por administrar um Evento.
 */
public class Evento {
    
    private ArrayList<Palestra> palestras;
    private ArrayList<Participante> participantes;
    private static final int LIMITEPALESTRA = 20;
    private static final int LIMITEPARTICIPANTE = 100;
    private static Evento instanciaEvento; // atributo estático (do escopo da classe) que será chamado no singleton para verificar se este atributo está com valor nulo.

    /**
     * Construtor vazio e privado para impedir que outras classes o chamem e criem objetos a partir dessa classe.
     */
    private Evento(){
               
    }

    /**
     * Este método é responsável por cadastrar uma palestra ao ArrayList de palestras do evento.
     * @param palestra
     */
    public void cadastrarPalestra(Palestra palestra){
        if (LIMITEPALESTRA < palestras.size()){
            palestras.add(palestra);
        }       
    }

    /**
     * Este método é responsável por cadastrar um participante ao ArrayList de participantes do evento.
     * @param participante
     */
    public void cadastrarParticipante(Participante participante){
        if (LIMITEPARTICIPANTE < participantes.size()){
            participantes.add(participante);
        }       
    }

    /**
     * Singleton que só permite uma instância do objeto ser criada, quando o atributo estático instanciaEvento tem o valor nulo.
     * @return
     */
    public static Evento getInstanciaEvento() {
        if (instanciaEvento == null) {
            instanciaEvento = new Evento();
        }
        return instanciaEvento;
    }
    
    
    
            
}
