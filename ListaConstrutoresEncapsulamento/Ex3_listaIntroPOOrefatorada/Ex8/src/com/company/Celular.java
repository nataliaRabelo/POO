package com.company;

/**
 * @author Natália Bruno Rabelo
 */
/**
 * Esta classe é responsável por representar uma entidade Celular.
 */
public class Celular {
    private String donoDoCelular;
    private int bateria;

    public Celular(int bateria, String donoDoCelular) {
        this.bateria = bateria;
        this.donoDoCelular = donoDoCelular;
    }

    public String getDonoDoCelular() {
        return this.donoDoCelular;
    }

    public int getBateria() {
        return this.bateria;
    }

    public void setBateria(int bateria) {
        if (bateria <= 100 && bateria >= 0) {
            this.bateria = bateria;
            System.out.println("A bateria atual eh: " + bateria + "%");
        } else {
            System.out.println("Bateria nao permitida\n");
        }
    }
}
