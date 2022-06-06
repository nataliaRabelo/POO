package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Natália Bruno Rabelo
 * Esta classe é responsável por administrar uma máquina de karaokê.
 */
public class MaquinaKaraoke {

    private ArrayList<Musica> todasAsMusicasDaMaquina = new ArrayList<>();
    private ArrayList<Musica> todasAsMusicasDaOrdenadas = new ArrayList<>();
    private ArrayList<Musica> musicasEmTramite = new ArrayList<>();

    /**
     * Este método é responsável por preencher a lista de todas as músicas da máquina.
     */
    public void preencherMaquina() {
        Musica musica1 = new Musica("Queens of Stone Age", "Everybody knows that you are insane");
        Musica musica2 = new Musica("Metallica", "One");
        Musica musica3 = new Musica("Metallica", "Unforgiven");
        Musica musica4 = new Musica("Hellacopters", "On the Sign of Octopus");
        Musica musica5 = new Musica("Ramones", "She's the one");
        Musica musica6 = new Musica("Ramones", "I Wanna Be Sedated");
        Musica musica7 = new Musica("Nirvana", "It smells like a teen spirit");
        Musica musica8 = new Musica("Pink Floyd", "One these days");
        Musica musica9 = new Musica("Hellacopters", "By The Grace of God");
        Musica musica10 = new Musica("Metallica", "Seek And Destroy");
        Musica musica11 = new Musica("Slayer", "Raign in blood");
        Musica musica12 = new Musica("Misfits", "Hybrid Moments");
        Musica musica13 = new Musica("Slayer", "The antichrist");
        Musica musica14 = new Musica("Black Sabbath", "Black Sabbath");
        Musica musica15 = new Musica("Beatles", "Lucy in the sky with diamonds");
        Musica musica16 = new Musica("Queens of Stone Age", "In My Head");
        todasAsMusicasDaMaquina.add(musica1);
        todasAsMusicasDaMaquina.add(musica2);
        todasAsMusicasDaMaquina.add(musica3);
        todasAsMusicasDaMaquina.add(musica4);
        todasAsMusicasDaMaquina.add(musica5);
        todasAsMusicasDaMaquina.add(musica6);
        todasAsMusicasDaMaquina.add(musica7);
        todasAsMusicasDaMaquina.add(musica8);
        todasAsMusicasDaMaquina.add(musica9);
        todasAsMusicasDaMaquina.add(musica10);
        todasAsMusicasDaMaquina.add(musica11);
        todasAsMusicasDaMaquina.add(musica12);
        todasAsMusicasDaMaquina.add(musica13);
        todasAsMusicasDaMaquina.add(musica14);
        todasAsMusicasDaMaquina.add(musica15);
        todasAsMusicasDaMaquina.add(musica16);
    }

    /**
     * Este método é responsável por visualizar todas as músicas da máquina de acordo com a escolha de ordenação do usuário.
     * @param escolhaOrdenacao
     */
    public void visualizarTodasAsMusicas(int escolhaOrdenacao) {
        todasAsMusicasDaOrdenadas.clear();
        if (escolhaOrdenacao == 1) {
            Collections.sort(todasAsMusicasDaMaquina, (Musica m1, Musica m2) -> m1.getNomeDaMusica().compareTo(m2.getNomeDaMusica()));
            AtomicInteger i = new AtomicInteger();
            todasAsMusicasDaMaquina.forEach((musica) -> {
                i.getAndIncrement();
                System.out.println(i + " - Nome da musica: " + musica.getNomeDaMusica() + " | Nome do artista: " + musica.getNomeDoArtista() + "\n");
                todasAsMusicasDaOrdenadas.add(musica);
        });
        }
        else if (escolhaOrdenacao == 2){
            Collections.sort(todasAsMusicasDaMaquina, (Musica m1, Musica m2) -> m1.getNomeDoArtista().compareTo(m2.getNomeDoArtista()));
            AtomicInteger i = new AtomicInteger();
            todasAsMusicasDaMaquina.forEach((musica) -> {
                i.getAndIncrement();
                System.out.println(i + " - Nome do artista: " + musica.getNomeDoArtista() + " | Nome da musica: " + musica.getNomeDaMusica() + "\n");
                todasAsMusicasDaOrdenadas.add(musica);
        });
        }
    }


    /**
     * Este método é responsável por selecionar uma música da lista com todas as músicas ordenadas conforme escolha de usuário e adicioná-la à lista de músicas em trâmite.
     * @param numero
     */
    public void escolherMusica(int numero){
        int i = 1;
        for(Musica musica : this.todasAsMusicasDaOrdenadas){
            if(i == numero){
                this.musicasEmTramite.add(0,musica);
            }
             i++;
        }

    }

    /**
     * Este método é responsável por visualizar as músicas em trâmite a serem cantadas na máquina.
     */
    public void visualizarMusicasEmTramite(){
        System.out.println("---------------- Musicas em tramite ----------------");
        int i = 1;
        for(Musica musica : this.musicasEmTramite){
            System.out.println(i + " - Nome do artista: " + musica.getNomeDoArtista() + " | Nome da musica: " + musica.getNomeDaMusica() + "\n");
            i++;
        }
        System.out.println("----------------------------------------------------");
    }

    /**
     * Este método é responsável por remover uma música após ter sido cantada no karaokê, onde o critério fantasia estabelecido é de que a quinta música em trâmite e mais antiga será a removida.
     */
    public void removerMusicaDeTramite() {
        int i = 1;
        Musica musicaRemovida = null;
        for (Musica musica : this.musicasEmTramite) {
            if(i == 5){
                musicaRemovida = musica;
            }
            i++;

        }
        this.musicasEmTramite.remove(musicaRemovida);
    }
}
