package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Lucas");
        nomes.add("William");
        nomes.add("Carol");
        nomes.add("Evelyn");
        nomes.add("Mateus");
        nomes.add("Maria");
        nomes.add("João");
        System.out.println(nomes);

        int posicao = nomes.indexOf("Mateus"); //retorna o indice do valor passado e caso não exista, retorna -1
        System.out.println("A posição de Mateus na lista é: "+ posicao);

        //nomes.clear();//limpa todos os dados da lista e a deixa vazia

        nomes.set(1, "Larissa"); //atualiza valor na posição 1 para Larissa

        nomes.remove(3); //remove elemento do índice
        nomes.remove("João"); //remove elemento por valor passado

        Collections.sort(nomes); //Ordena os nomes alfabeticamente
        System.out.println("Lista ordenada e com itens removidos: "+nomes);

        String nome = nomes.get(2); //funcao get através de índice
        System.out.println("Valor guardado através de get: "+nome);

        int tamanho = nomes.size(); //retorna numero inteiro com quantos elementos têm na lista
        System.out.println("O tamanho da lista é "+tamanho);

        boolean temBruno = nomes.contains("Bruno"); //retorna true caso haja valor na lista
        System.out.println("tem Bruno no array: "+ temBruno);

        System.out.println("A lista está vazia? "+ nomes.isEmpty()); //retorna true se a lista estiver vazia

        System.out.println("\nfor each");
        for (String item: nomes){ //for each para percorrer os valores da lista
            System.out.println("--> "+item); //exibe cada valor
        }

        System.out.println("\nwhile iterator");
        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()){ //retorna true se há mais elementos a ser visto
            System.out.println("++++"+iterator.next()); //retorna valor da iteração atual
        }


    }
}
