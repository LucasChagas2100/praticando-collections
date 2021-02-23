package map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        Map<String, Integer> ocorrencias = new HashMap<>();
        //adicionando ocorrências
        ocorrencias.put("Ensino Medio", 2013);
        ocorrencias.put("Senai", 2013);
        ocorrencias.put("Faculdade", 2014);
        ocorrencias.put("Jovem aprendiz", 2014);
        ocorrencias.put("Estágio", 2017);
        ocorrencias.put("Planejador", 2019);
        ocorrencias.put("Curso Dev Jr", 2020);
        ocorrencias.put("Desenvolvedor Java", 2021);
        System.out.println("Valores iniciais: "+ocorrencias);
        ocorrencias.get(2020);
        //atualiza o valor para a chave Ensino Medio
        ocorrencias.put("Ensino Medio", 2011);

        //retornar o valor da chave Senai
        System.out.println("\nqual ano de ocorrência do Senai? "+ocorrencias.get("Senai"));
        //retorna true se a chave informada existe
        System.out.println("Há alguma experiência na Toyota? "+ocorrencias.containsKey("Toyota"));

        //remove uma chave
        ocorrencias.remove("Senai");

        //retorna true se o valor informado existe no mapa
        System.out.println("\nHá alguma ocorrência em 2014? "+ocorrencias.containsValue(2014));
        //O tamanho do mapa
        System.out.println("O tamanho do mapa é: "+ocorrencias.size());

        System.out.println("\nNavegando através do for Map.Entry:");
        for (Map.Entry<String, Integer> entry: ocorrencias.entrySet()){
            System.out.println(entry.getKey()+" -- "+ entry.getValue());
        }

        System.out.println("\nNavegando através do for each:");
        for (String key: ocorrencias.keySet() ) {
            System.out.println(key+ " -- "+ ocorrencias.get(key));
        }
        
    }
}
