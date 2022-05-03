package com.company.PessoasUFF;

/**
 * @author Natália Bruno Rabelo
 * Esta classe é responsável por representar classe Aluno que herda de PessoaUFF.
 */
public class Aluno extends PessoaUFF {

    private String curso;

    public Aluno(String endereco, String nome, int cpf, String dataDeAniversario, int matricula, String email, String curso) {
        super(endereco, nome, cpf, dataDeAniversario, matricula, email);
        this.curso = curso;
    }

    public String getCurso(){
        return this.curso;
    }
}
