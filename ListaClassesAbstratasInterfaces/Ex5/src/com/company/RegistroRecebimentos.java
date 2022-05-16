package com.company;

import java.util.ArrayList;

/**
 * @author Natália Bruno Rabelo
 * Esta classe é responsável por administrar um registro de recebimentos de receitas.
 */
public class RegistroRecebimentos implements Recebivel{

    private ArrayList<Recebivel> registros = new ArrayList<>();
    private static RegistroRecebimentos instanciaRegistroRecebimentos;

    /**
     * Construtor vazio e privado para impedir que outras classes o chamem e criem objetos a partir dessa classe.
     */
    private RegistroRecebimentos(){

    }

    /**
     * Este método é responsável por adicionar um produto ou serviço ao registro de recibos.
     * @param recebivel
     */
    public void adicionarRegistro(Recebivel recebivel){
        registros.add(recebivel);
    }

    /**
     * Este método é responsável por imprimir dados e calcular a receita total de todos os produtos e serviços vendidos.
     */
    @Override
    public void totalizarReceita() {
        int i = 1;
        int j = 1;
        double receitaTotal = 0;
        System.out.println("----------------- RECEITA TOTALIZADA -----------------");
        for(Recebivel recebivel : registros){
            if(recebivel.getClass() == ItemVenda.class){
                System.out.println("------------------------------------------------------");
                System.out.println("ItemVenda " + i + "\nProduto: " + ((ItemVenda) recebivel).getProduto() +"\nQuantidade: " + ((ItemVenda) recebivel).getQuantidade() + "\nPreco unitario: " + ((ItemVenda) recebivel).getPrecoUnitario() +  "\nValor total: " + ((ItemVenda) recebivel).getValorTotal());
                receitaTotal+=((ItemVenda) recebivel).getValorTotal();
                i++;
            }
            else if(recebivel.getClass() == Servico.class){
                System.out.println("------------------------------------------------------");
                System.out.println("Servico " + j + "\nDescricao " + ((Servico) recebivel).getDescricao() + "\nHoras: " + ((Servico) recebivel).getHoras() + "\nPreco da Hora: " + ((Servico) recebivel).getPrecoHora() + "\nValor total: " + ((Servico) recebivel).getValorTotal());
                receitaTotal+=((Servico) recebivel).getValorTotal();
                j++;
            }
        }
        System.out.println("------------------------------------------------------\nValor total das vendas: " + receitaTotal);
        System.out.println("------------------------------------------------------");

    }

    /**
     * Singleton que só permite uma instância do objeto ser criada, quando o atributo estático instanciaEvento tem o valor nulo.
     * @return
     */
    public static RegistroRecebimentos getinstanciaRegistroRecebimentos() {
        if (instanciaRegistroRecebimentos == null) {
            instanciaRegistroRecebimentos = new RegistroRecebimentos();
        }
        return instanciaRegistroRecebimentos;
    }
}
