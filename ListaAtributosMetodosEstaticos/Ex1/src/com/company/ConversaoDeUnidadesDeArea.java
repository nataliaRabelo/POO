package com.company;

/**
 * @author Natália Bruno Rabelo
 */

/**
 * Esta classe é responsável por representar a entidade estática ConversaoDeUnidadesDeArea.
 * Contém como atributos os constantes que significam resultados de conversao de uma unidade de medida de area para outra, como por exemplo, um metro quadrado equivale a 10.76 pés quadrados.
 */
public class ConversaoDeUnidadesDeArea {

    private static final double METROQUADRADO_PEQUADRADO = 10.76;
    private static final double PEOQUADRADO_CMQUADRADO = 929;
    private static final double MILHAQUADRADA_ACRE = 640;
    private static final double ACRE_PEQUADRADO = 43560;


    /**
     * Este método é responsável por converter metros quadrados para pés quadrados.
     * @param n
     */
    public static void converterMetroQuadradoParaPeQuadrado(double n){
        double resultado = n * METROQUADRADO_PEQUADRADO;
        System.out.println("A conversao de "+ n + " metros quadrados para pes quadrados eh = " + resultado);
    }

    /**
     * Este método é responsável por converter pés quadrados para centímetros quadrados.
     * @param n
     */
    public static void converterPeQuadradoParaCmQuadrado(double n){
        double resultado = n * PEOQUADRADO_CMQUADRADO;
        System.out.println("A conversao de "+ n + " pes quadrados para centímetros quadrados eh = " + resultado);
    }

    /**
     * Este método é responsável por converter milhas quadrados para acres.
     * @param n
     */
    public static void converterMilhaQuadradaParaAcre(double n){
        double resultado = n * MILHAQUADRADA_ACRE;
        System.out.println("A conversao de "+ n + " milhas quadradas para acres eh = " + resultado);
    }

    /**
     * Este método é responsável por converter acres para pés quadrados.
     * @param n
     */
    public static void converterAcreParaPeQuadrado(double n){
        double resultado = n * ACRE_PEQUADRADO;
        System.out.println("A conversao de "+ n + " acres para pes quadrados eh = " + resultado);
    }
}
