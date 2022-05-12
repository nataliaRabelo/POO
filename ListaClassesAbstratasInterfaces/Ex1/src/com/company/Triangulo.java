package com.company;

/**
 * @author Natália Bruno Rabelo
 * Esta classe é responsável por representar uma entidade Triangulo que herda da entidade FormaGeometrica.
 */
public class Triangulo extends FormaGeometrica{

    private double base;
    private double altura;

    public Triangulo(double area, double baseTriangulo, double alturaTriangulo) {
        super(area);
        this.base = baseTriangulo;
        this.altura = alturaTriangulo;
    }

    /**
     * Este método é responsável por calcular a área de uma instância de Triangulo.
     */
    @Override
    public void calcularArea(){
        double area = this.base * this.altura/2;
        System.out.println("A area do seu triangulo eh: " + area);
        setArea(area);
    }

    @Override
    public void calcularPerimetro() {

    }

    @Override
    public void setArea(double area) {
        super.setArea(area);
    }

}
