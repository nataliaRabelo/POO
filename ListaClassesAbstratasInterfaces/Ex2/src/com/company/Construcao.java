package com.company;

/**
 * @author Natália Bruno Rabelo
 * Este método é responsável por representar uma entidade Construcao.
 */
public class Construcao implements CarbonFootprint{

    private int numeroDePessoas;
    private boolean usoDeEnergiaRenovavel;
    private int numeroDeLampadas;
    private boolean usoDeArCondicionado;

    public Construcao(int numeroPessoas, boolean b, int numeroDeLampadas, boolean b1) {
        this.numeroDePessoas = numeroPessoas;
        this.usoDeEnergiaRenovavel = b;
        this.numeroDeLampadas = numeroDeLampadas;
        this.usoDeArCondicionado = b1;
    }


    @Override
    public double getCarbonFootPrint() {
        float somatorio;
        float CO2PorUmaLampadaPorDia = 0.48F;
        float CO2GeradoPerCapitaNoBrasilPorDia = 2.25F;
        float CO2GeradoPorArCondicionadoPorDia = 0.0F;
        float CO2PorNumeroDeLampadasPorDia = this.numeroDeLampadas * CO2PorUmaLampadaPorDia;
        float CO2PorPessoa = this.numeroDePessoas * CO2GeradoPerCapitaNoBrasilPorDia;
        if(this.usoDeArCondicionado == true){
            CO2GeradoPorArCondicionadoPorDia = 5.7F;
        }
        else if (this.usoDeArCondicionado == false){
            CO2GeradoPorArCondicionadoPorDia = 0.0F;
        }
        somatorio = CO2PorNumeroDeLampadasPorDia + CO2PorPessoa + CO2GeradoPorArCondicionadoPorDia;
        if(this.usoDeEnergiaRenovavel == true){
            somatorio = CO2PorNumeroDeLampadasPorDia + CO2PorPessoa + CO2GeradoPorArCondicionadoPorDia - 1;
        }
        else if (this.usoDeEnergiaRenovavel == false){
            somatorio = CO2PorNumeroDeLampadasPorDia + CO2PorPessoa + CO2GeradoPorArCondicionadoPorDia - 1;
        }
        return somatorio;
    }
}
