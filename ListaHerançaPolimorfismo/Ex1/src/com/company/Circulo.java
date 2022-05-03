package com.company;

/**
 * @author Natália Bruno Rabelo
 * Esta classe é responsável por representar uma entidade Circulo que herda da entidade FormaGeometrica.
 */
public class Circulo extends FormaGeometrica {

    private double raio;
    private static final double PI = 3.14;

    public Circulo(double raio) {
        this.raio = raio;
    }

    /**
     * Este método é responsável por calcular a área de uma instância de Circulo.
     */
    @Override
    public void calcularArea(){
        double area = PI * this.raio * this.raio;
        System.out.println("A area do seu circulo eh: " + area);
    }
}
