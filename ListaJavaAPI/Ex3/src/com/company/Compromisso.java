package com.company;

import java.time.LocalDateTime;

/**
 *
 * @author Natália Bruno Rabelo
 */

/**
 * Esta classe é responsável por representar uma entidade Compromisso.
 */
public class Compromisso {

    private String titulo;
    private String descricao;
    private String local;
    private LocalDateTime data;

    public Compromisso(String titulo, String descricao, String local, LocalDateTime dataDoCompromisso) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.local = local;
        this.data = dataDoCompromisso;
    }

    public String getTitulo(){

        return this.titulo;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public String getLocal(){
        return this.local;
    }

    public LocalDateTime getData(){
        return this.data;
    }
}
