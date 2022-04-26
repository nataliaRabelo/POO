package com.company;

import java.util.Scanner;

/**
 * @author Natália Bruno Rabelo
 */
public class Main {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int decisao = 1;
        System.out.println("Voce sabia que um campo de futebol mede 8.250 metros quadrados??!! :O");
        while (decisao == 1){
            System.out.println("\nVoce deseja converter este valor alguma unidade de area?\nDigite 1 (sim) ou 2 (nao)");
            decisao = obj.nextInt();
            switch (decisao){
                case 1:
                    System.out.println("Qual conversao deseja fazer?\nDigite 1 (metros quadrados para pes quadrados) ou 2 (metros quadrados para acres) ou 3 (metros quadrados para centimetros quadrados)");
                    int decisao2 = obj.nextInt();
                    if(decisao2 == 1){
                        ConversaoDeUnidadesDeArea.converterMetroQuadradoParaPeQuadrado();
                    }
                    else if (decisao2 == 2){
                        ConversaoDeUnidadesDeArea.converterMetroQuadradoParaAcres();
                    }
                    else if (decisao2 == 3){
                        ConversaoDeUnidadesDeArea.converterMetroQuadradoParaCmQuadrado();
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
