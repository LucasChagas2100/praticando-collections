package set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeCapitais = new TreeSet<>();

        //monta arvore com as capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("Sao Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");
        System.out.println("Valores iniciais: "+treeCapitais);

        System.out.println("\nA primeira capital da arvore é: "+treeCapitais.first());
        System.out.println("A última capital da arvore é: "+treeCapitais.last());

        System.out.println("\nQual a capital anterior na arvore, antes de Curitiba? "+treeCapitais.lower("Curitiba"));
        System.out.println("Qual a próxima capital na arvore, depois de Curitiba? "+treeCapitais.higher("Curitiba"));

        System.out.println("\nRetorna e remove o primeiro item da arvore: "+treeCapitais.pollFirst());
        System.out.println("\nRetorna e remove o último item da arvore: "+treeCapitais.pollLast());

        Iterator<String> iterator = treeCapitais.iterator();
        while (iterator.hasNext()){
            System.out.println("-->"+iterator.next()); //exibe sem valores retirados com a função poll()
        }

    }
}
