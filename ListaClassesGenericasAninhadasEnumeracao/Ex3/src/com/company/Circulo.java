package com.company;

/**
 * @author Natália Bruno Rabelo
 * Esta classe é responsável por representar uma entidade Circulo que herda da entidade FormaGeometrica.
 *
 * OBS: classe utilizada para testar se o método genérico de somar areas está funcionando com atributos inteiros.
 */
public class Circulo extends FormaGeometrica {

    private int raio;
    private static final double PI = 3.14;

    public Circulo(int area, int raio) {
        super(area);
        this.raio  = raio;
    }

    /**
     * Este método é responsável por calcular a área de uma instância de Circulo.
     */
    @Override
    public void calcularArea(){
        int area = (int) (PI * this.raio * this.raio);
        System.out.println("A area do seu circulo eh: " + area);
        setArea(area);
    }

    @Override
    public void setArea(double area) {
        super.setArea(area);
    }

}
