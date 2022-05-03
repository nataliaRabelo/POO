package com.company;

import java.util.ArrayList;

/**
 * @author Natália Bruno Rabelo
 * Esta classe é responsável por representar uma entidade Agenda.
 */
public class Agenda {

    private static Agenda instanciaAgenda;

    ArrayList<Pessoa> pessoas = new ArrayList<>();
    /**
     * Construtor vazio e privado para impedir que outras classes o chamem e criem objetos a partir dessa classe.
     */
    private Agenda(){

    }

    /**
     * Este método é responsável por adicionar uma pessoa ao ArrayList da Agenda.
     * @param pessoa
     */
    public void adicionarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }

    /**
     * Este método é responsável por buscar uma pessoa na Agenda comparando se o numero recebido é igual ao cnpj ou cpf da pessoa.
     * @param numero
     */
    public void buscarPessoa(int numero){
        for(Pessoa pessoa : pessoas){
            if(pessoa.getClass() == PessoaJuridica.class && numero == ((PessoaJuridica) pessoa).getCnpj()){
                System.out.println("Endereco: " + pessoa.getEndereco() + " | Razao social: " + ((PessoaJuridica) pessoa).getRazaoSocial() + " | CNPJ: " + ((PessoaJuridica) pessoa).getCnpj() + " | Faturamento: " + ((PessoaJuridica) pessoa).getFaturamento());
            }
            else if(pessoa.getClass() == PessoaFisica.class && numero == ((PessoaFisica) pessoa).getCpf()){
                System.out.println("Endereco: " + pessoa.getEndereco() + " | Nome: " + ((PessoaFisica) pessoa).getNome() + " | CPF: " + ((PessoaFisica) pessoa).getCpf() + " | Data de aniversario: " + ((PessoaFisica) pessoa).getDataDeAniversario());
            }
        }
    }

    /**
     * Singleton que só permite uma instância do objeto ser criada, quando o atributo estático instanciaEvento tem o valor nulo.
     */
    public static Agenda getInstanciaAgenda() {
        if (instanciaAgenda == null) {
            instanciaAgenda = new Agenda();
        }
        return instanciaAgenda;
    }
}
