package com.company.PessoasUFF;

/**
 * @author Natália Bruno Rabelo
 * Esta classe é responsável por representar classe Professor que herda de PessoaUFF.
 */
public class Professor extends PessoaUFF {

    private String departamento;

    public Professor(String endereco, String nome, int cpf, String dataDeAniversario, int matricula, String email, String departamento) {
        super(endereco, nome, cpf, dataDeAniversario, matricula, email);
        this.departamento = departamento;
    }

    public String getDepartamento(){
        return this.departamento;
    }

}
