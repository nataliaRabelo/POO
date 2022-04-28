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
 * Esta classe é responsável por representar uma entidade Palestra.
 */
public class Palestra {
    
    private String titulo;
    private String nomeDoPalestrante;
    private String local;
    private String data;
    private String horarioInicio;
    private String horarioFim;
    private static final int LIMITEPARTICIPANTE = 20;
    private int numeroParticipantesPorPalestra;
    private ArrayList<Participante> participantes;
    
    public Palestra(String titulo, String nomeDoPalestrante, String local, String data, String horarioInicio, String horarioFim){

        this.titulo = titulo;
        this.nomeDoPalestrante = nomeDoPalestrante;
        this.local = local;
        this.data = data;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
    }

    /**
     * Este método é responsável por cadastrar o participante na palestra o adicionando ao ArrayList participantes.
     * @param participante
     */
    public void cadastrarParticipanteNaPalestra(Participante participante){
        if (LIMITEPARTICIPANTE < participantes.size()){
            participantes.add(participante);
            this.numeroParticipantesPorPalestra++;
        }       
    }

    /**
     * Este método é responsável por consultar o numero de participantes em uma instâncio de uma Palestra.
     * @param palestra
     */
    public void consultarParticipantesPalestra(Palestra palestra){
        System.out.println("O numero de participantes dessa palestra eh:" + numeroParticipantesPorPalestra);
    }

    /**
     * Este método é responsável por consultar a quantidade de vagas disponíveis em uma palestra.
     * @param palestra
     */
    public void consultarVagasDisponiveis(Palestra palestra){
        System.out.println("O numero de vagas disponiveis eh:" + (LIMITEPARTICIPANTE - numeroParticipantesPorPalestra));
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public String getNomeDoPalestrante(){
        return this.nomeDoPalestrante;
    }
    
    public String getLocal(){
        return this.local;
    }
    
    public String getData(){
        return this.data;
    }
    
    public String getHorarioInicio(){
        return this.horarioInicio;
    }
    
    public String getHorarioFim(){
        return this.horarioFim;
    }
    
    public int getnNumeroParticipantesPorPalestra(){
        return this.numeroParticipantesPorPalestra;
    }
    
    public ArrayList<Participante> getParticipantes(){
       return this.participantes;
    }
}
