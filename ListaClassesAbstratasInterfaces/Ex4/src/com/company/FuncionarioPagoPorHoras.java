package com.company;

/**
 * @author Natália Bruno Rabelo
 * Esta classe é responsável por representar uma entidade Funcionario pago por hora.
 */
public class FuncionarioPagoPorHoras extends Funcionario implements CalculadorDeGanhos{

    private int horasExtrasTrabalhadas;
    private static final double bonusPorHoraExtra = 1.5;


    public FuncionarioPagoPorHoras(double salario, int horasExtrasTrabalhadas) {
        super(salario);
        this.horasExtrasTrabalhadas = horasExtrasTrabalhadas;
    }


    /**
     * Este método é responsável por calcular a taxa de salário por hora a partir do salário semanal de um funcionário.
     * @return
     */
    public double calcularTaxaDeSalarioPorHora(){
        double resultado = this.salario/168; //levando em consideracao que os salarios são de acordo com a semana e uma semana tem 7 dias e cada dia 24 horas, logo 7 * 24 = 168 horas.
        return resultado;
    }

    @Override
    public void calcularGanhos() {
        double taxaDeSalarioPorHora = calcularTaxaDeSalarioPorHora();
        double bonusPorHoraExtraDesteFuncionario = taxaDeSalarioPorHora * bonusPorHoraExtra;
        double resultado = this.salario + this.horasExtrasTrabalhadas * bonusPorHoraExtraDesteFuncionario;
        System.out.println("Ganhos: " + resultado);
        System.out.println("---------------------------------------");
    }

    public int getHorasExtrasTrabalhadas(){
        return this.horasExtrasTrabalhadas;
    }

}
