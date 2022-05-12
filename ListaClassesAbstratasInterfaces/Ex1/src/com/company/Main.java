package com.company;


import java.util.Scanner;

/**
 * @author Natália Bruno Rabelo
 */
public class Main {


    public static void main(String[] args) {
        int decisao = 1;
        double area = 0;
        Scanner sc = new Scanner(System.in);
        while(decisao == 1 || decisao == 2 || decisao == 3 || decisao == 4){
            System.out.println("Digite qual formula geometrica deseja calcular a area\nDigite 1 (circulo) ou 2 (quadrado) ou 3 (retangulo) ou 4 (triangulo) ou 0 (encerrar programa)");
            decisao = sc.nextInt();
            switch (decisao){
                case 1:
                    System.out.println("Digite o raio do seu circulo:");
                    int raio = sc.nextInt();
                    Circulo circulo = new Circulo((int) area, raio); //parametros em inteiros para testar se o método genérico FormaGeometrica.somar() está funcionando.
                    circulo.calcularArea();
                    FormaGeometrica.somar(circulo.getArea());
                    FormaGeometrica.printSomas();
                    break;
                case 2:
                    System.out.println("Digite o lado do seu quadrado:");
                    double lado = sc.nextDouble();
                    Quadrado quadrado = new Quadrado(area, lado);
                    quadrado.calcularArea();
                    FormaGeometrica.somar(quadrado.getArea());
                    FormaGeometrica.printSomas();
                    break;
                case 3:
                    System.out.println("Digite a base do seu retangulo:");
                    double base = sc.nextDouble();
                    System.out.println("Digite a altura do seu retangulo:");
                    double altura = sc.nextDouble();
                    Retangulo retangulo = new Retangulo(area, base, altura);
                    retangulo.calcularArea();
                    FormaGeometrica.somar(retangulo.getArea());
                    FormaGeometrica.printSomas();
                    break;
                case 4:
                    System.out.println("Digite a base do seu triangulo:");
                    double baseTriangulo = sc.nextDouble();
                    System.out.println("Digite a altura do seu triangulo:");
                    double alturaTriangulo = sc.nextDouble();
                    Triangulo triangulo = new Triangulo(area, baseTriangulo, alturaTriangulo);
                    triangulo.calcularArea();
                    FormaGeometrica.somar(triangulo.getArea());
                    FormaGeometrica.printSomas();
            }

        }

    }
}
