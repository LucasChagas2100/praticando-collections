package set;

import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        //adiciona valores no set
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);
        sequenciaNumerica.add(32);
        sequenciaNumerica.add(64);

        //remove elemento
        sequenciaNumerica.remove(64);
        System.out.println("sequencia numerica em ordem de inserção: "+sequenciaNumerica);
        System.out.println("Seu tamanho é: "+sequenciaNumerica.size());


    }
}
