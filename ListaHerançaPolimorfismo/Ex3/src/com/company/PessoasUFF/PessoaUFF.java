package com.company.PessoasUFF;

import com.company.Pessoas.PessoaFisica;
/**
 * @author Natália Bruno Rabelo
 * Esta classe é responsável por representar classe PessoaUff que herda de PessoaFisica.
 */
public class PessoaUFF extends PessoaFisica {

    private int matricula;
    private String email;

    public PessoaUFF(String endereco, String nome, int cpf, String dataDeAniversario, int matricula, String email) {
        super(endereco, nome, cpf, dataDeAniversario);
        this.matricula = matricula;
        this.email = email;

    }

    public int getMatricula(){
        return this.matricula;
    }

    public String getEmail(){
        return this.email;
    }
}
