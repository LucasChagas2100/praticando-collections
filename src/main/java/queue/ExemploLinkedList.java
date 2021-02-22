package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Juliana");
        filaBanco.add("Pedro");
        filaBanco.add("Carlos");
        filaBanco.add("Larissa");
        filaBanco.add("João");

        System.out.println("\nValores iniciais através de For each: ");
        for (String cliente: filaBanco){
            System.out.println(cliente);
        }

        String primeiroCliente = filaBanco.peek();//retorna o primeiro elemento da lista sem remove-lo
        System.out.println("\nO próximo a ser atendido é o: "+primeiroCliente);
        System.out.println("A fila atual após uso do peek é: "+filaBanco);

        String clienteASerAtendido = filaBanco.poll();//retorna e remove o primeiro elemento da lista
        System.out.println("O cliente a ser atendido é "+clienteASerAtendido);
        System.out.println("Nova fila: "+ filaBanco); //lista sem o primeiro elemento da lista inicial

        //filaBanco.clear();//limpa a lista e a deixa vazia
        String primeiroClienteOuErro = filaBanco.element();//retorna o primeiro elemento da lista sem remove-lo, com a diferença de retornar erro se lista estiver vazia
        System.out.println("\nPrimeiro cliente ou erro, com element(): "+primeiroClienteOuErro);
        System.out.println("A fila com o uso de element(): "+filaBanco);

        filaBanco.add("Daniel");//adiciona mais um nome e verifica qual local assumiu na lista abaixo:

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        System.out.println("\nA fila pelo while iterator: ");
        while( iteratorFilaBanco.hasNext()){
            System.out.println(iteratorFilaBanco.next());
        }

        System.out.println("\nTamanho da fila: "+filaBanco.size());
        System.out.println("A fila está vazia? "+filaBanco.isEmpty());
        System.out.println("A fila possui Carlos? "+filaBanco.contains("Carlos"));

    }
}
