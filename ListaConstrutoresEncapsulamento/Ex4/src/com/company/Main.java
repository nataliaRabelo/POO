package com.company;

public class Main {

    public static void main(String[] args) {
	    Data data1 = new Data(31, 7, 1998);
        Data data2 = new Data(15, 8, 1993);
        Data data3  = new Data("Agosto", 8, 2017);
        Data data4  = new Data("Julho", 7, 1998);
        Data data5 = new Data(31, 1998);
        Data data6 = new Data(15, 1993);

        System.out.println(data1.getDia() + " " + data1.getMes() + " " + data1.getAno());
        System.out.println(data2.getDia() + " " + data2.getMes() + " " + data2.getAno());
        System.out.println(data3.getMesPorExtenso() + " " + data3.getMes() + " " + data3.getAno());
        System.out.println(data4.getMesPorExtenso() + " " + data4.getMes() + " " + data4.getAno());
        System.out.println(data5.getDia() + " " + data5.getAno());
        System.out.println(data6.getDia() + " " + data5.getAno());
    }
}
