package com.company;

import java.util.Scanner;

public class Pokemon {

    private String nome;



    private int tamanho;
    private int peso;

    public Pokemon(String nome, int tamanho, int peso){
        this.nome = nome;
        this.tamanho = tamanho;
        this.peso = peso;
    }



    public String getNome(){
        return this.nome;
    }

    public int getTamanho(){
        return this.tamanho;
    }

    public int getPeso(){
        return this.peso;
    }

    public void setTamanho(){
        this.tamanho++;
    }
    public void setPeso(){
        this.peso++;
    }
}
