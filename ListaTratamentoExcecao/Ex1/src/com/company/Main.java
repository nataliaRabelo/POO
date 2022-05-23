package com.company;


/**
 * @author Natália Bruno Rabelo
 * IllegalArgumentException: Lançado para indicar que um método recebeu um argumento ilegal ou inapropriado.
 * NumberFormatException: Lançado para indicar que o aplicativo tentou converter uma string em um dos tipos numéricos, mas que a string não tem o formato apropriado.
 */
public class Main {


    public static void main(String[] args) {


        try {
            int a = Integer.parseInt("oie");
            System.out.println(a);
        } catch (NumberFormatException ex1) {
            System.out.println("Nao eh possivel converter este dado para inteiro");
            System.out.println("----------------------------------------");
            System.out.println(ex1.getMessage());
            System.out.println(ex1.getStackTrace());
            System.out.println("----------------------------------------");
        }

        try {
            int b = -1;
            int z = 2;
            int x = somadorDeNumerosPositivos(b, z);
            System.out.println(x);
        }
        catch (IllegalArgumentException ex2){
            System.out.println("Nao eh possivel somar numeros negativos ou igual a zero");
            System.out.println("----------------------------------------");
            System.out.println(ex2.getMessage());
            System.out.println(ex2.getStackTrace());
            System.out.println("----------------------------------------");
        }


    }

    /**
     * Método responsável por somar numeros positivos.
     * Foi lançada uma exceção IllegalArgumentException caso os parâmetros recebidos sejam igual ou menor a 0.
     * @param n
     * @param y
     * @return
     */
    public static int somadorDeNumerosPositivos(int n, int y){

        if(n <= 0 || y <=0){
            throw new IllegalArgumentException("Os numeros precisam ser positivos");
        }

        return n + y;

    }
}
