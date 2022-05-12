package com.company;

/**
 * @author Natália Bruno Rabelo
 * Este método é responsável por representar uma entidade Bicicleta.
 */
public class Bicicleta implements CarbonFootprint {

    private int pedaladas;

    public Bicicleta(int pedaladasBike) {
        this.pedaladas  = pedaladasBike;
    }

    @Override
    public double getCarbonFootPrint() {
        return 0;
    }
}
