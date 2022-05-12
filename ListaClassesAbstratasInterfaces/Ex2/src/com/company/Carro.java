package com.company;

/**
 * @author Natália Bruno Rabelo
 * Este método é responsável por representar uma entidade Carro.
 */
public class Carro implements CarbonFootprint{

    private String combustivel;
    private float cilindrada;
    private float litroDeCombustivel;

    public Carro(String combustivel, float cilindrada, float litroDeCombustivel) {
        this.combustivel = combustivel;
        this.litroDeCombustivel =  litroDeCombustivel;
        this.cilindrada = cilindrada;
    }

    @Override
    public double getCarbonFootPrint() {
        float resultado = 0.0F;
        if(this.combustivel.equals("gasolina")){
            float CO2emitidoPorLitro = 2.3F;
            resultado = this.litroDeCombustivel * CO2emitidoPorLitro;
        }
        else if(this.combustivel.equals("diesel")){
            float CO2emitidoPorLitro = 2.7F;
            resultado = this.litroDeCombustivel * CO2emitidoPorLitro;
        }
        else if(this.combustivel.equals("gas")){
            float CO2emitidoPorLitro = 1.90F;
            resultado = this.litroDeCombustivel * CO2emitidoPorLitro;
        }
        return resultado;
    }
}
