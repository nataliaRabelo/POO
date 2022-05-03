package com.company;

public class PokemonTerra extends Pokemon{

    private int hitPoints;
    private int attack;
    private int defense;
    private int specialAttack;
    private int specialDefense;
    private int speed;

    public PokemonTerra(String nome, int tamanho, int peso) {
        super(nome, tamanho, peso);
        this.hitPoints = 45;
        this.attack = 49;
        this.defense = 49;
        this.specialAttack = 65;
        this.specialDefense = 65;
        this.speed = 45;
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
