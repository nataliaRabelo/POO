package com.company;

import com.company.Pessoas.Pessoa;
import com.company.Pessoas.PessoaFisica;
import com.company.Pessoas.PessoaJuridica;
import com.company.PessoasUFF.Aluno;
import com.company.PessoasUFF.Funcionario;
import com.company.PessoasUFF.Professor;

import java.util.ArrayList;

/**
 * @author Natália Bruno Rabelo
 * Esta classe é responsável por administrar um Evento.
 */
public class Evento {

    private static Evento instanciaEvento;

    ArrayList<Pessoa> pessoas = new ArrayList<>();
    /**
     * Construtor vazio e privado para impedir que outras classes o chamem e criem objetos a partir dessa classe.
     */
    private Evento(){

    }

    /**
     * Este método é responsável por adicionar uma pessoa ao ArrayList do Evento.
     * @param pessoa
     */
    public void adicionarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }

    /**
     * Este método é responsável por buscar uma pessoa na lista do Evento comparando se o numero recebido é igual ao cnpj ou cpf da pessoa.
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
            else if(pessoa.getClass() == Funcionario.class && numero == ((Funcionario) pessoa).getCpf()){
                System.out.println("Endereco: " + pessoa.getEndereco() + " | Nome: " + ((Funcionario) pessoa).getNome() + " | CPF: " + ((Funcionario) pessoa).getCpf() + " | Data de aniversario: " + ((Funcionario) pessoa).getDataDeAniversario() + " | Matricula: " + ((Funcionario) pessoa).getMatricula() + " | Email: " + ((Funcionario) pessoa).getNome() + " | Cargo: " + ((Funcionario) pessoa).getCargo());
            }
            else if(pessoa.getClass() == Professor.class && numero == ((Professor) pessoa).getCpf()){
                System.out.println("Endereco: " + pessoa.getEndereco() + " | Nome: " + ((Professor) pessoa).getNome() + " | CPF: " + ((Professor) pessoa).getCpf() + " | Data de aniversario: " + ((Professor) pessoa).getDataDeAniversario() + " | Matricula: " + ((Professor) pessoa).getMatricula() + " | Email: " + ((Professor) pessoa).getNome() + " | Departamento: " + ((Professor) pessoa).getDepartamento());
            }
            else if(pessoa.getClass() == Aluno.class && numero == ((Aluno) pessoa).getCpf()){
                System.out.println("Endereco: " + pessoa.getEndereco() + " | Nome: " + ((Aluno) pessoa).getNome() + " | CPF: " + ((Aluno) pessoa).getCpf() + " | Data de aniversario: " + ((Aluno) pessoa).getDataDeAniversario() + " | Matricula: " + ((Aluno) pessoa).getMatricula() + " | Email: " + ((Aluno) pessoa).getNome() + " | Curso: " + ((Aluno) pessoa).getCurso());
            }
        }
    }

    /**
     * Singleton que só permite uma instância do objeto ser criada, quando o atributo estático instanciaEvento tem o valor nulo.
     */
    public static Evento getInstanciaEvento() {
        if (instanciaEvento == null) {
            instanciaEvento = new Evento();
        }
        return instanciaEvento;
    }
}
