package list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {
        List<String> filmes = new Vector<>();

        //adiciona 5 itens
        filmes.add("A origem");
        filmes.add("No limite do amanhã");
        filmes.add("TENET");
        filmes.add("Jogos mortais");
        filmes.add("Missão impossível");
        System.out.println("Valores iniciais: "+filmes);

        //altera o valor da posição 2
        filmes.set(1, "Madagascar");

        //remove o filme TENET
        filmes.remove("TENET");
        filmes.remove(3);

        System.out.println("valores depois de alterados: "+filmes);

        //retorna o primeiro item do vetor
        System.out.println("O primeiro filme é "+ filmes.get(0));

        //navega na lista
        System.out.println("\nfor each:");
        for (String item: filmes){
            System.out.println("-->"+item);
        }

    }
}
