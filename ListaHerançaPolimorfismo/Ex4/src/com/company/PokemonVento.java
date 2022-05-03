package com.company;

public class PokemonVento extends Pokemon{

    private int hitPoints;
    private int attack;
    private int defense;
    private int specialAttack;
    private int specialDefense;
    private int speed;

    public PokemonVento(String nome, int tamanho, int peso) {
        super(nome, tamanho, peso);
        this.hitPoints = 40;
        this.attack = 35;
        this.defense = 30;
        this.specialAttack = 20;
        this.specialDefense = 20;
        this.speed = 50;
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
