package com.company;


/**
 * @author Natália Bruno Rabelo 
 * Esta classe é responsável por representar um dia da semana a depender dos métodos que interagem com a classe enumerator Dia.
 */
public class DiaDaSemana {
    

    DiaDaSemana(Dia dia) {
        this.dia = dia; 
    }
    
    /**
    * Esta classe é responsável por representar todas as possibilidades de dia da semana em constantes do tipo enumerator.
    */
    public enum Dia{
        DOMINGO,
        SEGUNDA,
        TERCA,
        QUARTA,
        QUINTA,
        SEXTA,
        SABADO;
    }
    
    Dia dia;

    /**
    * Este método é responsável por verificar se o dia da semana em questão é um dia útil.
    */
  public void ehDiaUtil(DiaDaSemana diaDaSemana){
        switch(diaDaSemana.dia){
            case DOMINGO:
                System.out.println("O dia da semana eh: " + dia + ". Nao eh dia da semana.");
                break;
            case SEGUNDA:
                System.out.println("O dia da semana eh: " + dia + ". Eh dia da semana.");
                break;
            case TERCA:
                System.out.println("O dia da semana eh: " + dia + ". Eh dia da semana.");
                break;
            case QUARTA:
                System.out.println("O dia da semana eh: " + dia + ". Eh dia da semana.");
                break;
            case QUINTA:
                System.out.println("O dia da semana eh: " + dia + ". Eh dia da semana.");
                break;
            case SEXTA:
                System.out.println("O dia da semana eh: " + dia + ". Eh dia da semana.");
                break;
            case SABADO:
                System.out.println("O dia da semana eh: " + dia + ". Nao eh dia da semana.");
                break;
        }
    } 

    /**
    * Este método é responsável por fazer o dia da semana atual passar para o próximo.
    */ 
    public void fazerDiaPassar(DiaDaSemana diaDaSemana){
        if(diaDaSemana.dia == Dia.DOMINGO){
            diaDaSemana.dia = Dia.SEGUNDA;
        }
        else if(diaDaSemana.dia == Dia.SEGUNDA){
            diaDaSemana.dia = Dia.TERCA;
        }
        else if(diaDaSemana.dia == Dia.TERCA){
            this.dia = Dia.QUARTA;
        }
        else if(diaDaSemana.dia == Dia.QUARTA){
            this.dia = Dia.QUINTA;
        }
        else if(diaDaSemana.dia == Dia.QUINTA){
            this.dia = Dia.SEXTA;
        }
        else if(diaDaSemana.dia == Dia.SEXTA){
            this.dia = Dia.SABADO;
        }
        else if(diaDaSemana.dia == Dia.SABADO){
            this.dia = Dia.DOMINGO;
        }
    } 
    public Dia getDia(){
        return this.dia;
    }
}
