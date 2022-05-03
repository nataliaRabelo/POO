package com.company;

import java.util.Scanner;

public class PokemonAgua extends Pokemon{

    private int hitPoints;
    private int attack;
    private int defense;
    private int specialAttack;
    private int specialDefense;
    private int speed;
    private static final int LIMITEATAQUES = 30;

    public PokemonAgua(String nome, int tamanho, int peso) {
        super(nome, tamanho, peso);
        this.hitPoints = 44	;
        this.attack = 48;
        this.defense = 65;
        this.specialAttack = 50;
        this.specialDefense = 64;
        this.speed = 43;
    }
    public int getHitPoints(){
        return this.hitPoints;
    }

    public int getAttack(){
        return this.attack;
    }

    public int getDefense(){
        return this.defense;
    }

    public int getSpecialAttack(){
        return this.specialAttack;
    }

    public int getSpecialDefense(){
        return this.specialDefense;
    }

    public int getSpeed(){
        return this.speed;
    }

    public void setHitPoints(int n){
        this.hitPoints+= n;
    }
    public void setAttack(int n){
        this.attack+= n;
    }
    public void setDefense(int n){
        this.defense+= n;
    }
    public void setSpecialAttack(int n){
        this.specialAttack+= n;
    }
    public void setSpecialDefense(int n){
        this.specialDefense+= n;
    }
    public void setSpeed(int n){
        this.speed+= n;
    }

}
