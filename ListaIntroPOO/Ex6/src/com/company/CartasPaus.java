package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Natália Bruno Rabelo.
 */

/**
 * Esta classe é responsável por representar o naipe de paus do baralho.
 */
public class CartasPaus {

    public Map<Integer, String> dictionaryPaus = new HashMap<>();

    /**
     * Este método é responsável por preencher um dicionario referente ao naipe de Paus.
     */
    public void preencherNaipePaus(){
        dictionaryPaus.put(1, "As_Paus");
        dictionaryPaus.put(2,"2_Paus");
        dictionaryPaus.put(3,"3_Paus");
        dictionaryPaus.put(4,"4_Paus");
        dictionaryPaus.put(5,"5_Paus");
        dictionaryPaus.put(6,"6_Paus");
        dictionaryPaus.put(7,"7_Paus");
        dictionaryPaus.put(8,"8_Paus");
        dictionaryPaus.put(9,"9_Paus");
        dictionaryPaus.put(10,"10_Paus");
        dictionaryPaus.put(11,"J_Paus");
        dictionaryPaus.put(12,"Q_Paus");
        dictionaryPaus.put(13,"K_Paus");
        System.out.println("Naipe de paus: " + dictionaryPaus);
    }
}
