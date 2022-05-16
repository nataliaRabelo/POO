package com.company;

/**
 * @author Natália Bruno Rabelo.
 * Esta classe abstrata é responsável por representar uma entidade Funcionario.
 */
public abstract class Funcionario {

    protected double salario;

    public Funcionario(double salario){
        this.salario = salario;
    }


    public double getSalario(){
        return this.salario;
    }

}
