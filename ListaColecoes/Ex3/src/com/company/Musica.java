package com.company;

/**
 * @author Natália Bruno Rabelo
 * Esta classe é responsável por representar uma entidade Musica.
 */
public class Musica {

    private String nomeDoArtista;
    private String nomeDaMusica;

    /**
     * Construtor padrão da classe música.
     * @param nomeDoArtista
     * @param nomeDaMusica
     */
    public Musica(String nomeDoArtista, String nomeDaMusica) {
        this.nomeDaMusica = nomeDaMusica;
        this.nomeDoArtista = nomeDoArtista;
    }

    public String getNomeDaMusica() {
        return nomeDaMusica;
    }

    public String getNomeDoArtista() {
        return nomeDoArtista;
    }
}
