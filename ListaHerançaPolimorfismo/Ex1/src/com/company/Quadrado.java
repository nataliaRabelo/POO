package com.company;

/**
 * @author Natália Bruno Rabelo
 * Esta classe é responsável por representar uma entidade Quadrado que herda da entidade FormaGeometrica.
 */
public class Quadrado extends FormaGeometrica{

    private double lado1;
    private double lado2;

    public Quadrado(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    /**
     * Este método é responsável por calcular a área de uma instância de Quadrado.
     */
    @Override
    public void calcularArea(){
        double area = this.lado1 * this.lado2;
        System.out.println("A area do seu quadrado eh: " + area);
    }
}
