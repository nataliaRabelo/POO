package com.company.Naipes;


/**
 * @author Natália Bruno Rabelo.
 */

import java.util.HashMap;
import java.util.Map;

/**
 * Esta classe é responsável por representar o naipe de copas do baralho.
 */
public class CartasCopas {

    private Map<Integer, String> dictionaryCopas = new HashMap<>();

    /**
     * Este método é responsável por preencher um dicionario referente ao naipe de Copas.
     */
    public void preencherNaipeCopas(){
        dictionaryCopas.put(1,"As_Copas");
        dictionaryCopas.put(2,"2_Copas");
        dictionaryCopas.put(3,"3_Copas");
        dictionaryCopas.put(4,"4_Copas");
        dictionaryCopas.put(5,"5_Copas");
        dictionaryCopas.put(6,"6_Copas");
        dictionaryCopas.put(7,"7_Copas");
        dictionaryCopas.put(8,"8_Copas");
        dictionaryCopas.put(9,"9_Copas");
        dictionaryCopas.put(10,"10_Copas");
        dictionaryCopas.put(11,"J_Copas");
        dictionaryCopas.put(12,"Q_Copas");
        dictionaryCopas.put(13,"K_Copas");
        System.out.println("Naipe de copas: " + dictionaryCopas);
    }

    public Map<Integer, String> getDictionaryCopas(){
        return this.dictionaryCopas;
    }

}
