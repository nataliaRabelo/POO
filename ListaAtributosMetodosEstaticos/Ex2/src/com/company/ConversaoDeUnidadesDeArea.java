package com.company;

/**
 * @author Natália Bruno Rabelo
 */

/**
 * Esta classe é responsável por representar a entidade estática ConversaoDeUnidadesDeArea.
 * Contém como atributos os constantes que significam resultados de conversao de uma unidade de medida de area para outra, como por exemplo, um metro quadrado equivale a 10.76 pés quadrados.
 * Além disso, conta com o atributo estático da métrica de um campo de futebol em metros quadrados.
 */
public class ConversaoDeUnidadesDeArea {

    private static final double METROQUADRADO_PEQUADRADO = 10.76;
    private static final double METROQUADRADO_ACRE = 0.000247105;
    private static final double METROQUADRADO_CMQUADRADO = 10000;

    private static final double CAMPODEFUTEBOL_METROSQUADRADOS = 8250;


    /**
     * Este método é responsável por converter metros quadrados de um campo de futebol para pés quadrados.
     */
    public static void converterMetroQuadradoParaPeQuadrado(){
        double resultado = CAMPODEFUTEBOL_METROSQUADRADOS * METROQUADRADO_PEQUADRADO;
        System.out.println("A conversao de "+ CAMPODEFUTEBOL_METROSQUADRADOS + " metros quadrados para pes quadrados eh = " + resultado);
    }

    /**
     * Este método é responsável por converter metros quadrados de um campo de futebol para acres.
     */
    public static void converterMetroQuadradoParaAcres(){
        double resultado = CAMPODEFUTEBOL_METROSQUADRADOS * METROQUADRADO_ACRE;
        System.out.println("A conversao de "+ CAMPODEFUTEBOL_METROSQUADRADOS + " metros quadrados para acres eh = " + resultado);
    }

    /**
     * Este método é responsável por converter metros quadrados de um campo de futebol para acres.
     */
    public static void converterMetroQuadradoParaCmQuadrado(){
        double resultado = CAMPODEFUTEBOL_METROSQUADRADOS * METROQUADRADO_CMQUADRADO;
        System.out.println("A conversao de "+ CAMPODEFUTEBOL_METROSQUADRADOS + " metros quadrados para centimetros quadrados eh = " + resultado);
    }



}
