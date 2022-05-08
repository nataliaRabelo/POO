package com.company;


/**
 * @author Natália Bruno Rabelo
 */
public class Main {

    private static final int[] T = {};

    public static void main(String[] args) {

        Par par1 = new Par(1, 4.0);
        Par par2 = new Par("Esmeralda", 'C');

        System.out.println("Par1: " + par1.getAtributo1() + " | " + par1.getAtributo2());
        System.out.println("Par2: " + par2.getAtributo1() + " | " + par2.getAtributo2());

        par1.setAtributo1("oieeee");
        par1.setAtributo2('N');
        par2.setAtributo1(5.5);
        par2.setAtributo2(30);
        System.out.println("\nDEPOIS DOS SETS:");

        System.out.println("Par1: " + par1.getAtributo1() + " | " + par1.getAtributo2());
        System.out.println("Par2: " + par2.getAtributo1() + " | " + par2.getAtributo2());
        }

    }

