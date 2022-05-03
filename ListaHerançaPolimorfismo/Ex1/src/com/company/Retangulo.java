package com.company;

/**
 * @author Natália Bruno Rabelo
 * Esta classe é responsável por representar uma entidade Retangulo que herda da entidade FormaGeometrica.
 */
public class Retangulo extends FormaGeometrica{

    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * Este método é responsável por calcular a área de uma instância de Retangulo.
     */
    @Override
    public void calcularArea(){
        double area = this.base * this.altura;
        System.out.println("A area do seu retangulo eh: " + area);
    }
}
