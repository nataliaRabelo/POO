package com.company.Pessoas;


/**
 * @author Natália Bruno Rabelo
 * Esta classe é responsável por representar entidade PessoaJuridica que herda de Pessoa.
 */
public class PessoaJuridica extends Pessoa {

    private String razaoSocial;
    private int cnpj;
    private int faturamento;

    public PessoaJuridica(String endereco, String razaoSocial, int cnpj, int faturamento) {
        super(endereco);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.faturamento = faturamento;
    }

    public String getRazaoSocial(){
        return this.razaoSocial;
    }

    public int getCnpj(){
        return this.cnpj;
    }

    public int getFaturamento(){
        return this.faturamento;
    }
}
