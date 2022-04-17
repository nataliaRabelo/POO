package com.company.Naipes;

import java.util.HashMap;
import java.util.Map;
/**
 * @author Natália Bruno Rabelo.
 */

/**
 * Esta classe é responsável por representar o naipe de espadas do baralho.
 */
public class CartasEspada {

    private Map<Integer, String> dictionaryEspada = new HashMap<>();

    /**
     * Este método é responsável por preencher um dicionario referente ao naipe de Espadas.
     */
    public void preencherNaipeEspada(){
        dictionaryEspada.put(1,"As_Espadas");
        dictionaryEspada.put(2,"2_Espadas");
        dictionaryEspada.put(3,"3_Espadas");
        dictionaryEspada.put(4,"4_Espadas");
        dictionaryEspada.put(5,"5_Espadas");
        dictionaryEspada.put(6,"6_Espadas");
        dictionaryEspada.put(7,"7_Espadas");
        dictionaryEspada.put(8,"8_Espadas");
        dictionaryEspada.put(9,"9_Espadas");
        dictionaryEspada.put(10,"10_Espadas");
        dictionaryEspada.put(11,"J_Espadas");
        dictionaryEspada.put(12,"Q_Espadas");
        dictionaryEspada.put(13,"K_Espadas");
        System.out.println("Naipe de espadas: " + dictionaryEspada);
    }
    public Map<Integer, String> getDictionaryEspada(){
        return this.dictionaryEspada;
    }
}
