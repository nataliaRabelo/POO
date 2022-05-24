package com.company;

/**
 * @author Natália Bruno Rabelo.
 * Esta classe é responsável por administrar um cadastro de clientes.
 */
public class CadastroCliente {

    private Cliente[] clientes = new Cliente[10];

    /**
     * Este método é responsável por inserir um cliente ao registro de clientes.
     * @param cliente
     * @throws ClienteJaExistenteException
     * @throws ClienteInexistenteException
     */
    public void inserirCliente(Cliente cliente) throws ClienteJaExistenteException, ClienteInexistenteException {
        int count = 0;
        for (int i = 0; i < clientes.length; i++){
            if(i == 9 && clientes[i] != null){
                throw new RepositorioException("Nao eh possivel adicionar mais clientes. O registro está cheio.");
            }
            else if(clientes[i] != null && cliente.getCpf().equals(clientes[i].getCpf())){
                throw new ClienteJaExistenteException("Este cliente nao pode ser inserido. Porque este ja consta no registro.");
            }
            else if (clientes[i] == null && count == 0){
                clientes[i] = cliente;
                count++;
                System.out.println("Um cliente esta sendo adicionado: " + clientes[i] + " | " + clientes[i].getNome() +  " | " + clientes[i].getCpf());
            }

        }

    }

    /**
     * Este método é responsável por buscar um cliente no registro de clientes.
     * @param cpf
     * @throws ClienteInexistenteException
     */
    public void buscarCliente(String cpf) throws ClienteInexistenteException {
        int count = 0;
        for (int i = 0; i < clientes.length; i++){
            if(clientes[0] == null){
                throw new NullPointerException("A lista esta nula, nao foi possivel buscar cliente");
            }
            else if((clientes[i] != null && i == 9 && !(clientes[i].getCpf().equals(cpf))) && count == 0){
                throw new ClienteInexistenteException("Nao eh possivel encontrar cliente. O cliente nao esta cadastrado.");
            }
            else if(clientes[i] != null && clientes[i].getCpf().equals(cpf) && count == 0){
                System.out.println("O cliente foi achado: " + clientes[i] + " | " + clientes[i].getNome() +  " | " + clientes[i].getCpf());
                count++;
            }
        }
    }

    /**
     * Este método é responsável por exibir na tela a lista de clientes registrados.
     */
    public void printarLista(){
        System.out.println("------------- LISTA DE CLIENTES -------------");
        for (Cliente cliente : clientes) {
            if (cliente != null) {
                System.out.println(cliente + " | " + cliente.getNome() + " | " + cliente.getCpf());
            }
        }
        System.out.println("---------------------------------------------");
    }

}
