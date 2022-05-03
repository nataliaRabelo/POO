package com.company.PessoasUFF;


/**
 * @author Natália Bruno Rabelo
 * Esta classe é responsável por representar classe Funcionario que herda de PessoaUFF.
 */
public class Funcionario extends PessoaUFF {

    private String cargo;

    public Funcionario(String endereco, String nome, int cpf, String dataDeAniversario, int matricula, String email, String cargo) {
        super(endereco, nome, cpf, dataDeAniversario, matricula, email);
        this.cargo = cargo;
    }

    public String getCargo(){
        return this.cargo;
    }
}
