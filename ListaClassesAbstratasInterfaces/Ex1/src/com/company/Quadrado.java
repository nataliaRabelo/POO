package com.company;

/**
 * @author Natália Bruno Rabelo
 * Esta classe é responsável por representar uma entidade Quadrado que herda da entidade FormaGeometrica.
 */
public class Quadrado extends Retangulo {

    private double lado;


    public Quadrado(double area, double lado) {
        super(area);
        this.lado = lado;
    }

    /**
     * Este método é responsável por calcular a área de uma instância de Quadrado.
     */
    @Override
    public void calcularArea(){
        double area = this.lado * this.lado;
        System.out.println("A area do seu quadrado eh: " + area);
        setArea(area);
    }

    @Override
    public void setArea(double area) {
        super.setArea(area);
    }

}
