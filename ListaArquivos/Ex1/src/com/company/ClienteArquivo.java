package com.company;

import java.io.*;
import java.util.ArrayList;

/**
 * @author Natália Bruno Rabelo.
 * Classe responsável por administrar um arquivo com as informações das instâncias de Cliente.
 */
public class ClienteArquivo {

    private static ClienteArquivo instancia;

    /**
     * Método responsável por atualizar o arquivo conforme este for chamado em outros métodos de manipulação do array de registro de clientes na classe CadastroDeClientes.
     * @param clientes
     * @throws FileNotFoundException
     */
    public void atualizarArquivo(ArrayList<Cliente> clientes) throws FileNotFoundException {
        ObjectOutputStream ous = null;

        try {
            ous = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("clientes.txt")));

            try {

                ous.writeObject(clientes);

            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        } finally {

            if (ous != null) {
                try {
                    ous.close();
                } catch (IOException e) {

                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Método responsável por construir o array de registro de clientes conforme o arquivo salvo.
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void construirArrayDeOndeParou() throws IOException, ClassNotFoundException {
        ObjectInputStream ins = null;
        ArrayList<Cliente> clientes = null;

        try {
            ins = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("clientes.txt"))));

            try {
                clientes = (ArrayList<Cliente>)ins.readObject();

            } catch (ClassNotFoundException e1) {
                e1.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (ins != null) {
                try {
                    ins.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            CadastroDeCliente.getInstancia().setClientes(clientes);
        }

    }


    /**
     * Singleton que só permite uma instância do objeto ser criada, quando o atributo estático instancia tem o valor nulo.
     * @return
     */
    public static ClienteArquivo getInstancia() {
        if (instancia == null) {
            instancia = new ClienteArquivo();
        }
        return instancia;
    }
}
