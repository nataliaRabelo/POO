package com.company;

import java.util.Calendar;

public class Compromisso {

    private String titulo;
    private String descricao;
    private String local;
    private Calendar data;

    public Compromisso(String titulo, String descricao, String local, Calendar dataDoCompromisso) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.local = local;
        this.data = dataDoCompromisso;
    }
}
