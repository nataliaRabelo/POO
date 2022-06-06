package com.company;

import java.util.*;

/**
 * @author Natália Bruno Rabelo.
 */
public class Main {

    public static void main(String[] args) {
        //Implementação de matriz redimensionável da interface List. Implementa todas as operações de lista opcionais e permite todos os elementos, incluindo null. Além de implementar a interface List, essa classe fornece métodos para manipular o tamanho do array usado internamente para armazenar a lista.
        ArrayList<String> listaDeStrings = new ArrayList();
        listaDeStrings.add("banana");
        listaDeStrings.add("laranja");
        listaDeStrings.add("maca");
        listaDeStrings.add("kiwi");
        System.out.println("ArrayList: ");
        for (String value : listaDeStrings) {
            System.out.println(value);
        }
        //Essa classe implementa a interface Set, apoiada por uma tabela de hash (na verdade, uma instância de HashMap). Não oferece garantias quanto à ordem de iteração do conjunto; em particular, não garante que o pedido permaneça constante ao longo do tempo. Esta classe permite o elemento nulo.
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(listaDeStrings);
        System.out.println("HashSet: ");
        for (String value : hashSet) {
            System.out.println(value);
        }
        //Uma fila de prioridade ilimitada baseada em um heap de prioridade. Os elementos da fila de prioridade são ordenados de acordo com sua ordenação natural, ou por um Comparador fornecido no momento da construção da fila, dependendo de qual construtor é utilizado. Uma fila de prioridade não permite elementos nulos.
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(hashSet);
        System.out.println("PriorityQueue: ");
        for (String value : priorityQueue) {
            System.out.println(value);
        }
        //Implementação de matriz redimensionável da interface Deque. Os deques de matriz não têm restrições de capacidade; eles crescem conforme necessário para suportar o uso. Eles não são thread-safe; na ausência de sincronização externa, eles não oferecem suporte ao acesso simultâneo por vários threads. Elementos nulos são proibidos. Essa classe provavelmente será mais rápida que Stack quando usada como pilha e mais rápida que LinkedList quando usada como fila.
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(priorityQueue);
        System.out.println("ArrayDeque: ");
        for (String value : arrayDeque) {
            System.out.println(value);
        }
        //Uma implementação NavigableSet baseada em um TreeMap. Os elementos são ordenados usando sua ordenação natural ou por um Comparador fornecido no momento da criação do conjunto, dependendo de qual construtor é usado. Essa implementação fornece custo de tempo log(n) garantido para as operações básicas (adicionar, remover e conter).Observe que a ordenação mantida por um conjunto (se um comparador explícito é fornecido ou não) deve ser consistente com igual para implementar corretamente a interface Set. (Consulte Comparable ou Comparator para obter uma definição precisa de consistente com equals.) Isso ocorre porque a interface Set é definida em termos da operação equals, mas uma instância TreeSet executa todas as comparações de elementos usando seu método compareTo (ou compare), portanto, dois elementos que são considerados iguais por este método são, do ponto de vista do conjunto, iguais. O comportamento de um conjunto é bem definido mesmo que sua ordenação seja inconsistente com iguais; ele simplesmente não obedece ao contrato geral da interface Set.
        TreeSet <String> treeSet  = new TreeSet <>();
        treeSet.addAll(priorityQueue);
        System.out.println("ArrayDeque: ");
        for (String value : treeSet) {
            System.out.println(value);
        }
    }
}
