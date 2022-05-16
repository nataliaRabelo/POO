package com.company;

/**
 * @author Natália Bruno Rabelo
 * Esta classe é responsável por representar uma entidade Funcionario assalariado.
 */
public class FuncionarioAssalariado extends Funcionario implements CalculadorDeGanhos{

    public FuncionarioAssalariado(double salario) {
        super(salario);
    }


    @Override
    public void calcularGanhos() {
        System.out.println("Ganhos: " + this.salario);
        System.out.println("---------------------------------------");
    }

}
