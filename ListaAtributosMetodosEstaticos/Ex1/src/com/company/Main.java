package com.company;

import java.util.Scanner;

/**
 * @author Natália Bruno Rabelo
 */
public class Main {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int decisao = 1;
        while (decisao == 1){
            System.out.println("Voce deseja converter alguma unidade de area?\nDigite 1 (sim) ou 2 (nao)");
            decisao = obj.nextInt();
            switch (decisao){
                case 1:
                    System.out.println("Qual conversao deseja fazer?\nDigite 1 (metros quadrados para pes quadrados) ou 2 (pes quadrados para centimetros quadrados) ou 3 (milhas quadradas para acres) ou 4 (acres para pes quadrados)");
                    int decisao2 = obj.nextInt();
                    if(decisao2 == 1){
                        System.out.println("Digite quantos metros quadrados deseja converter para pes quadrados.");
                        double metrosQuadrados = obj.nextDouble();
                        ConversaoDeUnidadesDeArea.converterMetroQuadradoParaPeQuadrado(metrosQuadrados);
                    }
                    else if (decisao2 == 2){
                        System.out.println("Digite quantos pes quadrados deseja converter para centimetros quadrados.");
                        double pesQuadrados = obj.nextDouble();
                        ConversaoDeUnidadesDeArea.converterPeQuadradoParaCmQuadrado(pesQuadrados);
                    }
                    else if (decisao2 == 3){
                        System.out.println("Digite quantas milhas quadradas deseja converter para acres.");
                        double milhasQuadradas = obj.nextDouble();
                        ConversaoDeUnidadesDeArea.converterMilhaQuadradaParaAcre(milhasQuadradas);
                    }
                    else if (decisao2 == 4){
                        System.out.println("Digite quantos acres deseja converter para pes quadrados.");
                        double acres = obj.nextDouble();
                        ConversaoDeUnidadesDeArea.converterAcreParaPeQuadrado(acres);
                    }
                    break;
                default:
                    break;
            }
        }

    }
}
