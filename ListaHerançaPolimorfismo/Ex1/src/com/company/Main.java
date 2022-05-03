package com.company;

import java.util.Scanner;

/**
 * @author Natália Bruno Rabelo
 */
public class Main {

    public static void main(String[] args) {
        int decisao = 1;
        Scanner sc = new Scanner(System.in);
        while(decisao == 1 || decisao == 2 || decisao == 3 || decisao == 4){
            System.out.println("Digite qual formula geometrica deseja calcular a area\nDigite 1 (circulo) ou 2 (quadrado) ou 3 (retangulo) ou 4 (triangulo) ou 0 (encerrar programa)");
            decisao = sc.nextInt();
            switch (decisao){
                case 1:
                    System.out.println("Digite o raio do seu circulo:");
                    double raio = sc.nextDouble();
                    Circulo circulo = new Circulo(raio);
                    circulo.calcularArea();
                    break;
                case 2:
                    System.out.println("Digite o primeiro lado do seu quadrado:");
                    double lado1 = sc.nextDouble();
                    System.out.println("Digite o segundo lado do seu quadrado:");
                    double lado2 = sc.nextDouble();
                    Quadrado quadrado = new Quadrado(lado1, lado2);
                    quadrado.calcularArea();
                    break;
                case 3:
                    System.out.println("Digite a base do seu retangulo:");
                    double base = sc.nextDouble();
                    System.out.println("Digite a altura do seu retangulo:");
                    double altura = sc.nextDouble();
                    Retangulo retangulo = new Retangulo(base, altura);
                    retangulo.calcularArea();
                    break;
                case 4:
                    System.out.println("Digite a base do seu triangulo:");
                    double baseTriangulo = sc.nextDouble();
                    System.out.println("Digite a altura do seu triangulo:");
                    double alturaTriangulo = sc.nextDouble();
                    Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo);
                    triangulo.calcularArea();

            }


        }


    }
}
