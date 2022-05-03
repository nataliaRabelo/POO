package com.company;

import java.util.ArrayList;

public class Arena {

    public void batalhar(Pokemon pokemon1, Pokemon pokemon2, int potencia, int precisao){

        }


    public void evoluir(Pokemon pokemon, int n){
        if(pokemon.getClass() == PokemonAgua.class){
            ((PokemonAgua) pokemon).setAttack(n);
            ((PokemonAgua) pokemon).setHitPoints(n);
            ((PokemonAgua) pokemon).setDefense(n);
            ((PokemonAgua) pokemon).setSpecialAttack(n);
            ((PokemonAgua) pokemon).setSpecialDefense(n);
            ((PokemonAgua) pokemon).setSpeed(n);
            pokemon.setTamanho();
            pokemon.setPeso();
        }
        else if(pokemon.getClass() == PokemonFogo.class){
            ((PokemonFogo) pokemon).setAttack(n);
            ((PokemonFogo) pokemon).setHitPoints(n);
            ((PokemonFogo) pokemon).setDefense(n);
            ((PokemonFogo) pokemon).setSpecialAttack(n);
            ((PokemonFogo) pokemon).setSpecialDefense(n);
            ((PokemonFogo) pokemon).setSpeed(n);
            pokemon.setTamanho();
            pokemon.setPeso();
        }
        else if(pokemon.getClass() == PokemonTerra.class){
            ((PokemonTerra) pokemon).setAttack(n);
            ((PokemonTerra) pokemon).setHitPoints(n);
            ((PokemonTerra) pokemon).setDefense(n);
            ((PokemonTerra) pokemon).setSpecialAttack(n);
            ((PokemonTerra) pokemon).setSpecialDefense(n);
            ((PokemonTerra) pokemon).setSpeed(n);
            pokemon.setTamanho();
            pokemon.setPeso();
        }
        else if(pokemon.getClass() == PokemonVento.class){
            ((PokemonVento) pokemon).setAttack(n);
            ((PokemonVento) pokemon).setHitPoints(n);
            ((PokemonVento) pokemon).setDefense(n);
            ((PokemonVento) pokemon).setSpecialAttack(n);
            ((PokemonVento) pokemon).setSpecialDefense(n);
            ((PokemonVento) pokemon).setSpeed(n);
            pokemon.setTamanho();
            pokemon.setPeso();
        }
    }
}
