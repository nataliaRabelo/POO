package com.company.Pessoas;

/**
 * @author Natália Bruno Rabelo
 * Esta classe é responsável por representar entidade PessoaFisica que herda de Pessoa.
 */
public class PessoaFisica extends Pessoa {

    private String nome;
    private int cpf;
    private String dataDeAniversario;


    public PessoaFisica(String endereco, String nome, int cpf, String dataDeAniversario) {
        super(endereco);
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeAniversario = dataDeAniversario;
    }

    public String getNome(){
        return this.nome;
    }

    public int getCpf(){
        return this.cpf;
    }

    public String getDataDeAniversario(){
        return this.dataDeAniversario;
    }
}
