package com.company;

import java.util.ArrayList;

/**
 * @author Natália Bruno Rabelo
 * Esta classe é responsável por representar uma superclasse da entidade forma geométrica.
 */
public class FormaGeometrica {

    private double area;
    private static Double soma = new Double(0);

    public FormaGeometrica(double area) {
        this.area = area;
    }

    /**
     * Este método genérico é responsável por somar as areas de todas as instâncias de herdeiros de FormaGeometrica e converter o resultado final para tipo Double.
     * @param x
     * @param <T>
     */
    public static<T extends Number> void somar(T x){
        soma += x.doubleValue();
    }

    /**
     * Este método é responsável por imprimir o valor das somas de todas as areas
     */
    public static void printSomas(){
        System.out.println("A soma das areas das formas geometricas eh: " + soma);
    }

    public double getArea(){
        return this.area;
    }
    /**
     * Este método é responsável por imprimir uma mensagem simulando uma fórmula de calcular área de uma forma geométrica genérica.
     */
    public void calcularArea(){
        System.out.println("Uma formula generica para calcular a area.");
    }

    public void setArea(double area) {
        this.area = area;
    }

}
