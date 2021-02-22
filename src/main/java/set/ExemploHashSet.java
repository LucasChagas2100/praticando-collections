package set;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {
        Set<Double> notasAlunos = new HashSet<>();

        //adiciona as notas
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);
        System.out.println("As notas iniciais: "+notasAlunos);

        

        notasAlunos.remove(3.8);
        System.out.println("\nO tamanho da lista: "+notasAlunos.size());

        notasAlunos.clear();
        System.out.println("Agora a lista de notas está vazia? "+notasAlunos.isEmpty());

    }
}
