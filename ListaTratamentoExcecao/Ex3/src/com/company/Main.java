package com.company;


import java.util.Scanner;

/**
 * @author Natália Bruno Rabelo
 */
public class Main {


    public static void main(String[] args) throws ClienteInexistenteException {

        criarOuBuscarCliente();
    }

    /**
     * Método responsável por criar instâncias da classe Cliente ou buscar estas instâncias na lista de clientes contida na classe CadastroCliente.
     * Este método depende da escolha do usuario para realizar as ações supracitadas.
     */
    public static void criarOuBuscarCliente(){
        CadastroCliente cadastroCliente = new CadastroCliente();
        Scanner sc = new Scanner(System.in);
        int decisao = 1;
        while (decisao == 1 || decisao == 2) {
            System.out.println("O que deseja fazer agora?\nDigite 1 (criar cliente) ou 2 (buscar cliente) ou 0 (encerrar programa)");
            decisao = sc.nextInt();
            try {
                switch (decisao) {
                    case 1:
                        Cliente cliente = new Cliente();
                        System.out.println("Um cliente esta sendo criado.\nDigite o cpf do cliente:");
                        sc.nextLine();
                        String cpf = sc.nextLine();
                        cliente.setCpf(cpf);
                        System.out.println("Digite o nome do cliente:");
                        String nome = sc.nextLine();
                        cliente.setNome(nome);
                        cadastroCliente.inserirCliente(cliente);
                        cadastroCliente.printarLista();
                        break;
                    case 2:
                        System.out.println("Digite o cpf do cliente:");
                        sc.nextLine();
                        String cpf2 = sc.nextLine();
                        cadastroCliente.buscarCliente(cpf2);
                        break;
                    default:
                        break;
                }
            } catch (DadoInvalidoException | ClienteJaExistenteException | ClienteInexistenteException | RepositorioException | NullPointerException ex1) {
                System.out.println(ex1.getMessage());
            }
        }

    }
}

