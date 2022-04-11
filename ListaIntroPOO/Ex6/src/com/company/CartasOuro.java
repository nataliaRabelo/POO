package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Natália Bruno Rabelo.
 */

/**
 * Esta classe é responsável por representar o naipe de ouros do baralho.
 */
public class CartasOuro {

    public Map<Integer, String> dictionaryOuro = new HashMap<>();

    /**
     * Este método é responsável por preencher um dicionario referente ao naipe de Ouros.
     */
    public void preencherNaipeOuro(){
        dictionaryOuro.put(1,"As_Ouros");
        dictionaryOuro.put(2,"2_Ouros");
        dictionaryOuro.put(3,"3_Ouros");
        dictionaryOuro.put(4,"4_Ouros");
        dictionaryOuro.put(5,"5_Ouros");
        dictionaryOuro.put(6,"6_Ouros");
        dictionaryOuro.put(7,"7_Ouros");
        dictionaryOuro.put(8,"8_Ouros");
        dictionaryOuro.put(9,"9_Ouros");
        dictionaryOuro.put(10,"10_Ouros");
        dictionaryOuro.put(11,"J_Ouros");
        dictionaryOuro.put(12,"Q_Ouros");
        dictionaryOuro.put(13,"K_Ouros");
        System.out.println("Naipe de ouros: " + dictionaryOuro);
    }
}
