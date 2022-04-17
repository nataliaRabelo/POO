package com.company.Baralho;


import com.company.Naipes.CartasCopas;
import com.company.Naipes.CartasEspada;
import com.company.Naipes.CartasOuro;
import com.company.Naipes.CartasPaus;

import java.util.*;

/**
 * @author Natália Bruno Rabelo
 */
// Ordem dos naipes no Poker: ouro, espada, copas e paus.
//Ordem das cartas: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K

/**
 * Esta classe é responsável por representar um baralho.
 */
public class Baralho {

    private Map<Integer, String> dictionaryBaralho;

    /**
     * Este método é responsável por ordenar o baralho conforme o jogo Poker.
     * @param cartasOuro
     * @param cartasEspada
     * @param cartasCopas
     * @param cartasPaus
     */
    public void ordenarBaralho(CartasOuro cartasOuro, CartasEspada cartasEspada, CartasCopas cartasCopas, CartasPaus cartasPaus){

        int count = 1;
        dictionaryBaralho = new HashMap<>();
        while(dictionaryBaralho.size() < 52){
            for (Map.Entry<Integer, String> entry : cartasOuro.getDictionaryOuro().entrySet()) {
                String val = entry.getValue();
                dictionaryBaralho.put(count, val);
                count++;
            }
            for (Map.Entry<Integer, String> entry : cartasEspada.getDictionaryEspada().entrySet()) {
                String val = entry.getValue();
                dictionaryBaralho.put(count, val);
                count++;
            }
            for (Map.Entry<Integer, String> entry : cartasCopas.getDictionaryCopas().entrySet()) {
                String val = entry.getValue();
                dictionaryBaralho.put(count, val);
                count++;
            }
            for (Map.Entry<Integer, String> entry : cartasPaus.getDictionaryPaus().entrySet()) {
                String val = entry.getValue();
                dictionaryBaralho.put(count, val);
                count++;
            }
        }
        System.out.println("A ordem do baralho ficou: " + dictionaryBaralho);

    }

    /**
     * Este método é responsável por embaralhar o baralho.
     */
    public void embaralharBaralho() {

        ArrayList<String> cartas = new ArrayList<String>();
        for(String carta : dictionaryBaralho.values())
            cartas.add(carta);
        for (int i = 0; i < cartas.size()*2; ++i) {
            int carta_um = (int) (Math.random() * cartas.size());
            int carta_dois = (int) (Math.random() *cartas.size());
            String carta_temp = cartas.get(carta_um);
            cartas.set(carta_um, cartas.get(carta_dois));
            cartas.set(carta_dois, carta_temp);
        }
        dictionaryBaralho.clear();
        for(int i = 0; i < cartas.size(); ++i)
            dictionaryBaralho.put(i, cartas.get(i));
        System.out.println("A ordem do baralho ficou: " + dictionaryBaralho);
    }
}


