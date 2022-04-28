/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

/**
 * @author Natália Bruno Rabelo
 *
 * Esta classe é responsável por representar uma entidade Participante.
 */
public class Participante {
    
    private int matricula;
    private String nome;
    private String email;
    private int tipoDeParticipante;  
    
    public Participante(int matricula, String nome, String email, int tipoDeParticipante){
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.tipoDeParticipante = tipoDeParticipante;
    }
    
    public int getMatricula(){
        return this.matricula;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public int getTipoDeParticipante(){
        return this.tipoDeParticipante;
    }
}
