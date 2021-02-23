package StreamAPI;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {
    public static void main(String[] args) {
        List<String> estudantes = new ArrayList<>();
        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        //retorna a contagem de elementos do stream
        System.out.println("Contagem: "+ estudantes.stream().count());

        //retorna o elementos com maior número de letras
        System.out.println("\nElemento com maior número de letras: "+ estudantes.stream().max(Comparator.comparingInt(String::length)));
        //retorna o elementos com menor número de letras
        System.out.println("Elemento com menor número de letras: "+ estudantes.stream().min(Comparator.comparingInt(String::length)));

        //retorna os elementos que têm a letra R no nome
        System.out.println("\nCom a letra R no nome: "+ estudantes.stream().filter((estudante)->
                estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        //retorna uma nova coleção, com os nomes concatenados à quantidade de letras de cada nome
        System.out.println("\nRetorna uma nova coleção com a quantidade de letras: "+ estudantes.stream()
                .map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        //retorna somente os 3 primeiros elementos da coleção
        System.out.println("\nRetorna os 3 primeiros elementos: "+ estudantes.stream().limit(3).collect(Collectors.toList()));

        //Exibe cada elemento no console e depois retorna a mesma coleção
        System.out.println("\nRetorna os elementos depois de mostrar cada um: "+ estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        //Exibe cada elemento no console sem retornar a coleção
        System.out.println("\nRetorna os elementos novamente em sequência: ");
        estudantes.stream().forEach(System.out::println);

        //Retorna true se todos os elementos possuem a letra A minuscula no nome
        System.out.println("\nTodos os elementos tem 'a' no nome? "+ estudantes.stream().allMatch((elemento)-> elemento.contains("a")));
        //Retorna true se algum dos elementos possui a letra A minuscula no nome
        System.out.println("Algum dos elementos tem 'a' no nome? "+ estudantes.stream().anyMatch((elemento)-> elemento.contains("a")));
        //Retorna true se nenhum dos elementos possui a letra A minuscula no nome
        System.out.println("Todos os elementos não tem 'a' no nome? "+ estudantes.stream().noneMatch((elemento)-> elemento.contains("a")));

        //Retorna o primeiro elemento da coleção, se existir, exibe no console
        System.out.println("\nRetorna o primeiro elemento da coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        //Exemplo de operação encadeada
        System.out.println("\nOperação encadeada: ");
        System.out.println(estudantes.stream()
                .peek(System.out::println) //primeiro mostra o nome normal
                .map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))//o map concatena com lenght
                .peek(System.out::println)//mostra o valor dado pelo map()
                .filter((estudante)-> estudante.toLowerCase().contains("r"))//filtro aplicado a coleção descomentada abaixo
                //.collect(Collectors.toList())//filtra nomes com r já com regra do map implementada
                //.collect(Collectors.joining(", ")) //junta em string separando pelo delimitador passado, no caso: ", "
                //.collect(Collectors.toSet()) //parecido com o joining, e trás de forma desordenada
                .collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-")+1))) //serve para agrupamento


        );
    }
}
