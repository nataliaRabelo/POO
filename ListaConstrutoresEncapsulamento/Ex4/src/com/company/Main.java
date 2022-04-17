package com.company;

public class Main {

    public static void main(String[] args) {
	    Data data1 = new Data(31, 7, 1998);
        Data data2  = new Data("Agosto", 8, 2017);
        Data data3 = new Data(31, 1998);

        System.out.println(data1.getDia() + " " + data1.getMes() + " " + data1.getAno());
        System.out.println(data2.getMesPorExtenso() + " " + data2.getMes() + " " + data2.getAno());
        System.out.println(data3.getDia() + " " +data3.getAno());
    }
}
