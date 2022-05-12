package com.company;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Natália Bruno Rabelo
 */
public class Main {

    /**
     * Este método é responsável por ler os dados de entrada de cada objeto e iterar o ArrayList do tipo CarbonFootPrint para acessar o método previsto no contrato desta interface de cada um dos objetos salvos.
     * @param args
     *
     * COMENTARIO SOBRE A LETRA A) : Não é possível que o programa continue funcionando porque a classe Construcao se tornou abstrata, logo, não pode ser instanciada.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<CarbonFootprint> geradoresDeCarbono = new ArrayList<>();
        System.out.println("Voce esta criando duas bicicletas\nDigite o numero de pedaladas realizadas na primeira:");
        int pedaladasBike1 = sc.nextInt();
        System.out.println("Digite o numero de pedaladas da segunda bicicleta:");
        int pedaladasBike2 = sc.nextInt();
        Bicicleta bicicleta1 = new Bicicleta(pedaladasBike1);
        Bicicleta bicicleta2 = new Bicicleta(pedaladasBike2);
        geradoresDeCarbono.add(bicicleta1);
        geradoresDeCarbono.add(bicicleta2);
        System.out.println("Voce esta criando dois carros\nDigite o nome do combustivel (gasolina), (diesel), (gas) do primeiro:");
        sc.nextLine();
        String combustivel1 = sc.nextLine();
        System.out.println("Digite a cilindrada do primeiro:");
        float cilindrada1 = sc.nextFloat();
        System.out.println("Digite os litros de combustivel gastos pelo primeiro:");
        float litros1 = sc.nextFloat();
        System.out.println("Digite o nome do combustivel (gasolina), (diesel), (gas) do segundo:");
        sc.nextLine();
        String combustivel2 = sc.nextLine();
        System.out.println("Digite a cilindrada do segundo:");
        float cilindrada2 = sc.nextFloat();
        System.out.println("Digite os litros de combustivel gastos pelo segundo:");
        float litros2 = sc.nextFloat();
        Carro carro1 = new Carro(combustivel1, cilindrada1, litros1);
        Carro carro2 = new Carro(combustivel2, cilindrada2, litros2);
        geradoresDeCarbono.add(carro1);
        geradoresDeCarbono.add(carro2);

        System.out.println("Voce esta criando duas construcoes. Dessa vez eh uma casa e uma escola!\nDigite o numero de pessoas trabalhando nela da primeira:");
        int numeroPessoas = sc.nextInt();
        System.out.println("Esta usando energia renovável na primeira? Digite true ou false:");
        sc.nextLine();
        boolean b1 = true;
        String decisao1 = sc.nextLine();
        if(decisao1.equals("true")){
            b1 = true;
        }
        else if(decisao1.equals("false")){
            b1 = false;
        }
        System.out.println("Digite o numero de lampadas trabalhando nela da primeira:");
        int numeroDeLampadas = sc.nextInt();
        System.out.println("Esta usando ar condicionado na primeira? Digite true ou false:");
        sc.nextLine();
        String decisao2 = sc.nextLine();
        boolean b2 = true;
        if(decisao2.equals("true")){
            b2 = true;
        }
        else if(decisao2.equals("false")){
            b2 = false;
        }
        Casa casa = new Casa(numeroPessoas, b1, numeroDeLampadas, b2);;
        geradoresDeCarbono.add(casa);

        System.out.println("Digite o numero de pessoas trabalhando na segunda:");
        int numeroPessoas2 = sc.nextInt();
        System.out.println("Esta usando energia renovável na segunda? Digite true ou false:");
        sc.nextLine();
        boolean b3 = true;
        String decisao3 = sc.nextLine();
        if(decisao3.equals("true")){
            b3 = true;
        }
        else if(decisao3.equals("false")){
            b3 = false;
        }
        System.out.println("Digite o numero de lampadas trabalhando nela da primeira:");
        int numeroDeLampadas2 = sc.nextInt();
        System.out.println("Esta usando ar condicionado na segunda? Digite true ou false:");
        boolean b4 = true;
        String decisao4 = sc.nextLine();
        if(decisao4.equals("true")){
            b4 = true;
        }
        else if(decisao4.equals("false")){
            b4 = false;
        }
        Escola escola = new Escola(numeroPessoas2, b3, numeroDeLampadas2, b4);
        geradoresDeCarbono.add(escola);

        for(CarbonFootprint geradoreDeCarbono: geradoresDeCarbono){
            if(geradoreDeCarbono.getClass() == Bicicleta.class){
                System.out.println("A medida de CarbonFootPrint desta bicicleta eh: " + geradoreDeCarbono.getCarbonFootPrint());
            }
            else if(geradoreDeCarbono.getClass() == Carro.class){
                System.out.println("A medida de CarbonFootPrint deste carro eh: " + geradoreDeCarbono.getCarbonFootPrint());
            }
            else if(geradoreDeCarbono.getClass() == Casa.class){
                System.out.println("A medida de CarbonFootPrint desta casa eh: " + geradoreDeCarbono.getCarbonFootPrint());
            }
            else if(geradoreDeCarbono.getClass() == Escola.class){
                System.out.println("A medida de CarbonFootPrint desta escola eh: " + geradoreDeCarbono.getCarbonFootPrint());
            }
        }



    }
}
