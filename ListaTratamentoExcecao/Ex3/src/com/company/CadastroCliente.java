package com.company;


public class CadastroCliente {

    private Cliente[] clientes = new Cliente[10];

    public void inserirCliente(Cliente cliente) throws ClienteJaExistenteException, ClienteInexistenteException {
        int contador = 0;
        for (int i = 0; i < clientes.length; i++){
            if(i == 10 && clientes[i] != null){
                throw new RepositorioException("Nao eh possivel adicionar mais clientes. O registro está cheio.");
            }
            else if(verificarSeClienteInseridoJaEstaNaLista(clientes[i]) == true){
                throw new ClienteJaExistenteException("Este cliente nao pode ser inserido. Porque este ja consta no registro.");
            }
            else if (clientes[i] == null && contador == 0){
                clientes[i] = cliente;
                contador++;
            }
        }

    }

    public void buscarCliente(Cliente cliente) throws ClienteInexistenteException {
        for (int i = 0; i < clientes.length; i++){
            if(i == 10 && clientes[i] != cliente){
                throw new ClienteInexistenteException("Nao eh possivel encontrar cliente. O cliente nao esta cadastrado.");
            }
            else if(clientes[i] == cliente){
                System.out.println("O cliente foi achado: " + clientes[i] + " | " + clientes[i].getNome() +  " | " + clientes[i].getCpf());
            }
        }
    }

    public boolean verificarSeClienteInseridoJaEstaNaLista(Cliente cliente) throws ClienteInexistenteException {
        for (int i = 0; i < clientes.length; i++){
            if(i == 10 && clientes[i] != cliente){
                throw new ClienteInexistenteException("Nao eh possivel verificar cliente na lista. O cliente nao esta cadastrado.");
            }
            else if(cliente.getCpf() == clientes[i].getCpf()){
                return true;
            }
        }
        return false;
    }
}
