package com.company;

public class Data {
    private int dia;
    private int mes;
    private String mesPorExtenso;
    private int ano;

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano =  ano;
    }

    public Data(String mesPorExtenso, int mes, int ano){
        this.mesPorExtenso = mesPorExtenso;
        this.mes = mes;
        this.ano =  ano;
    }

    public Data(int dia, int ano){
        this.dia = dia;
        this.ano =  ano;
    }

    public int getDia(){
        return this.dia;
    }

    public int getMes(){
        return this.mes;
    }

    public String getMesPorExtenso(){
        return this.mesPorExtenso;
    }

    public int getAno(){
        return this.ano;
    }
}
