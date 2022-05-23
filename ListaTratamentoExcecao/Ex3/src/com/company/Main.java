package com.company;


/**
 * @author Natália Bruno Rabelo
 */
public class Main {


    public static void main(String[] args) {
        CadastroCliente cadastroCliente = new CadastroCliente();
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Cliente cliente3 = new Cliente();
        Cliente cliente4 = new Cliente();
        Cliente cliente5 = new Cliente();
        Cliente cliente6 = new Cliente();
        Cliente cliente7 = new Cliente();
        Cliente cliente8 = new Cliente();
        Cliente cliente9 = new Cliente();
        Cliente cliente10 = new Cliente();
        Cliente cliente11 = new Cliente();
        //TESTANDO EXCECAO DE CPF
        try{
            cliente1.setCpf("132456789"); //Aqui eh pra dar excecao de CPF com menos de 11 digitos.
            cliente1.setNome("Wesley Safadao");
            System.out.println("Cliente: " + cliente1.getNome() + " " + cliente1.getCpf()); // print de debug caso desse certo
        }
        catch (DadoInvalidoException ex1){
            System.out.println(ex1.getMessage());
        }
        // TESTANDO EXCECAO DE NOME
        try{
            cliente2.setCpf("13245678945");
            cliente2.setNome("Waleska"); //Aqui eh pra dar excecao por nao ter sobrenome.
            System.out.println("Cliente: " + cliente2.getNome() + " " + cliente2.getCpf()); // print de debug caso desse certo
        }
        catch (DadoInvalidoException ex1){
            System.out.println(ex1.getMessage());
        }
        // TESTANDO EXCECAO POR JA HAVER MESMO CPF NO VETOR
        try{
            cliente1.setCpf("13245678945");
            cliente1.setNome("Wesley Safadao");
            cliente2.setCpf("13245678945");
            cliente2.setNome("Waleska Poposuda");
            System.out.println("Cliente: " + cliente1.getNome() + " " + cliente1.getCpf());
            System.out.println("Cliente: " + cliente2.getNome() + " " + cliente2.getCpf());
            cadastroCliente.inserirCliente(cliente1);
            cadastroCliente.inserirCliente(cliente2);
        }
        catch (ClienteJaExistenteException ex1){
            System.out.println(ex1.getMessage());
        }
        catch (ClienteInexistenteException ex2){
            System.out.println(ex2.getMessage());
        }


    }

}
